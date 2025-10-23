**# Internet Shop system(client-server application)**



The project is a client-server application written in Java that simulates an online

shopping system. It uses JavaFX for the graphical user interface (GUI),

implements object-oriented principles, and demonstrates client-server

communication.



**## Features**



*Packages*

  com.example.shoppingcart

  Contains all the client-side logic for the application, including the

  GUI and communication with the server.

  com.example.server

  Handles the server-side operations, including processing client

  requests and managing product data.



*Server-Side Overview*

The server is responsible for:

1\. Storing Product Data: The server maintains a database of products (using

an in-memory ArrayList for simplicity).

2\. Processing Requests from Clients: It listens for client requests over a

socket and responds accordingly.



*Client-Side Overview*

The client is responsible for:

1\. Interfacing with the user via a GUI built with JavaFX.

2\. Sending requests to the server and displaying the server’s responses.

Key Classes

&nbsp;ClientApp

&nbsp;Entry point of the client-side application.

&nbsp;Launches the JavaFX application



**# Technologies Used**



Language: Java



**## How it works**

The server listens for incoming client connections using a ServerSocket.

2\. When a client connects, the server reads the request sent by the client.

3\. Based on the request (e.g., GET\_PRODUCTS), the server responds by

sending the requested data (e.g., a list of products).

Example Request-Response Flow

1\. Client Request: "GET\_PRODUCTS"

2\. Server Response: Sends a list of products to the client



**## Preview**





**## Author**

PANASHE KEITH MUCHEKENYA

**GitHub:**\[GitHub.com/PanasheKeith14]

