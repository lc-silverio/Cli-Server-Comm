import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {
    public static void main(String []args) throws IOException{
        Socket client = new Socket("localhost", 4999);

        PrintWriter pr = new PrintWriter(client.getOutputStream());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert message: ");
        String input = scanner.nextLine();
                
        if (input.length() < 12){
            pr.println(input);
            pr.flush();
            System.out.println("Message: " + input + " sent!");
        }else{
            pr.println("Message exceeds size limit");
            System.out.println("Message exceeds size limit");
            pr.flush();
        }
    }
}