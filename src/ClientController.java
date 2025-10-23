package com.example.shoppingcart;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class ClientController {
    @FXML
    private TableColumn<Product, Integer> idColumn;
    @FXML
    private TableColumn<Product, String> nameColumn;
    @FXML
    private TableColumn<Product, Double> priceColumn;

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    @FXML
    private TableView<Product> productTable;
    @FXML
    private ListView<Product> cartList;

    private Cart cart = new Cart();

    @FXML
    private void onLoadProducts() {
        try (Socket socket = new Socket("localhost", 12345);
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

            // Send request to server
            out.writeObject("GET_PRODUCTS");

            // Read product list from server
            List<Product> products = (List<Product>) in.readObject();

            // Populate the table with received products
            productTable.setItems(FXCollections.observableArrayList(products));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();


        }

    }

    @FXML
    private void onAddToCart() {
        Product selectedProduct = productTable.getSelectionModel().getSelectedItem();
        if (selectedProduct != null) {
            cart.addItem(selectedProduct);
            cartList.getItems().add(selectedProduct);
        }
    }

    @FXML
    private void onCheckout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Checkout");
        alert.setHeaderText("Checkout Successful");
        alert.setContentText("Thank you for your purchase!");
        alert.showAndWait();
    }
}

