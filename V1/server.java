import java.net.*;
import java.io.*;
import java.util.Scanner;

public class server {
    public static void main(String []args) throws IOException{
        ServerSocket server = new ServerSocket(4999);
        Socket client = server.accept();

        System.out.println("Client Connected");

        InputStreamReader in = new InputStreamReader(client.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();

        if (str.length()<12){
            System.out.println("Client: " + str);
        }else{
            System.out.println(str);
        }
        
    }
}