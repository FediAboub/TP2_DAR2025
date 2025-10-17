package serveurPackage;

import java.io.*;
import java.net.*;

public class Serveur {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Serveur en attente d'une connexion...");
            Socket socket = serverSocket.accept();
            System.out.println("Un client est connecté.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String operation = in.readLine();
            System.out.println("Opération reçue : " + operation);
            String resultat = calculer(operation);
            out.println(resultat);
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
            System.out.println("Connexion terminée, serveur fermé.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String calculer(String operation) {
        try {
            String[] p = operation.trim().split(" ");
            if (p.length != 3) return "Erreur : format incorrect";
            double a = Double.parseDouble(p[0]);
            String op = p[1];
            double b = Double.parseDouble(p[2]);
            double r;
            switch (op) {
                case "+": r=a+b;break;
                case "-": r=a-b;break;
                case "*": r=a*b;break;
                case "/": if (b == 0) return "Division par 0 impossible";r=a/b;break;
                default: return "Erreur";
            }
            return "Résultat = " +r;
        } catch (Exception e) {
            return "opération invalide";
        }
    }
}
