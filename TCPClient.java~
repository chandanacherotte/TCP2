import java.io.*;
import java.net.*;

class TCPClient {
 public static void main(String argv[]) throws Exception {
  String sentence;
  String modifiedSentence;
  BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
  Socket clientSocket = new Socket("localhost", 6789);
  System.out.println("Enter a message: ");
DataInputStream inTosrvr=new DataInputStream(clientSocket.getInputStream());  
  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
  BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  String str="",str2="";  
while(!str.equals("stop")){  
str=inFromServer.readLine();  
outToServer.writeUTF(str);  
outToServer.flush();  
str2=inTosrvr.readUTF();  
System.out.println("Server says: "+str2);  
}  
outToServer.close();  
inFromServer.close();
}}
