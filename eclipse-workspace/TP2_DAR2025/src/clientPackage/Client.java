package clientPackage;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Client connecté.");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            System.out.print("Entrez une opération (ex : 34 * 55) : ");
            String operation = sc.nextLine();
            if (!operation.matches("\\d+\\s*[+\\-*/]\\s*\\d+")) {
                System.out.println("Format incorrect. Exemple valide : 34 * 55");
                sc.close();
                socket.close();
                return;
            }
            out.println(operation);
            String resultat = in.readLine();
            System.out.println("Résultat reçu du serveur : " + resultat);
            sc.close();
            in.close();
            out.close();
            socket.close();
            System.out.println("Connexion fermée (client).");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
