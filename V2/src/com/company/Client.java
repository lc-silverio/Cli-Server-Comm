package com.company;

import java.io.IOException;
import java.io.PrintWriter;
//import java.lang.invoke.SwitchPoint;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String []args) throws IOException{
        Scanner scanner = new Scanner (System.in);

        //IP e Porta
        System.out.print("Insert IP Address: ");
        String IP = scanner.nextLine();
        System.out.println(IP);

        System.out.print("Insert Port: ");
        int PORT = scanner.nextInt();
        System.out.println(PORT);

        //Ligação ao servidor
        Socket client = new Socket(IP, PORT);
        PrintWriter pr = new PrintWriter(client.getOutputStream());


        //Sistema de Mensagens
            System.out.print("Insert option: ");
            String menu = scanner.nextLine();
            switch (menu.trim().charAt(0)) { //Menu

                case 'Q': //Exit
                    break;

                case 'S': // Enviar mensagem
                    System.out.print("Insert message: ");
                    String input = scanner.nextLine();
                        if (input.length() <= 12) {
                            pr.println(input);
                            pr.flush();
                            System.out.println("Message: " + input + " sent!");
                        } else {
                            pr.println("Error");
                            System.out.println("Message exceeds size limit");
                            pr.flush();
                        }
                        break;
            }
        }
    }
