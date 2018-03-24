import java.io.*;
import java.net.*;

class TCPServer {
 public static void main(String argv[]) throws Exception {
  String clientSentence;
  String capitalizedSentence;
  ServerSocket welcomeSocket = new ServerSocket(6789);
  System.out.println("Welcome Client");
  while (true) {
   Socket connectionSocket = welcomeSocket.accept();
   }
  }
  }
