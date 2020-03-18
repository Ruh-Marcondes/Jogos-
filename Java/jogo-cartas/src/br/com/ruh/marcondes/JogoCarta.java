package br.com.ruh.marcondes;

import java.util.Scanner;

public class JogoCarta {

    public static void main(String[] args) {
        // Relembrar uso de array
    String [] nipes = {"Ouros","Copas","Espadas","Paus"};
    String [] faces = {"Az","2","3","4",
            "5","6","7","8","9","10", "J","Q","K"};
    int opc = 0;
        Scanner sc = new Scanner(System.in);

    // Linhas a baixo pegam aleatoriamento os válores de array

        do{
        String nipe = nipes[(int) (Math.random()*4)];
        String face = faces [(int) (Math.random()*faces.length)]; //.length pega o tamanho do array;

    // Exibe a carta sorteada
        System.out.printf(face + " de " + nipe + "\n");
        opc = Integer.parseInt(sc.nextLine());
        }while (opc != 0);
    }
}
