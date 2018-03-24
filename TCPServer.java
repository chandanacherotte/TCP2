import java.io.*;
import java.net.*;

class TCPServer {
 public static void main(String argv[]) throws Exception {
    String clientSentence;
    ServerSocket welcomeSocket = new ServerSocket(6789);
    Socket welcomeSocket=ss.accept();
    System.out.println("Welcome Client");
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    clientSentence="";
    String str=""; 
    while(!clientSentence.equals("stop")){  
      clientSentence=din.readUTF();  
      System.out.println("Client Says: "+clientSentence);  
      str=br.readLine();  
      dout.writeUTF(str);  
      dout.flush();  
     }   
  }
  }
