package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
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