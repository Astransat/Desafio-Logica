package desafio_2;

import java.util.Scanner;

public class MainDesafio_2 {
    public static Scanner entrada = new Scanner( System.in);
    public static int cont=0;
    public static void main(String[] args) {
        String text[]=new String[3];

        System.out.println("\nEntre com as frases: \n");

        System.out.print("Entrada 1: ");
        text[0] =entrada.nextLine();
        System.out.print("Entrada 2: ");
        text[1] =entrada.nextLine();
        System.out.print("Entrada 3: ");
        text[2] =entrada.nextLine();

        for (int i = 0; i <text.length ; i++) {
            busrcarMaiorLetra(text[i]);
        }
    }

    public static void busrcarMaiorLetra(String frase){

        String palavra = caracteresSpecialMinusculo(frase);
        cont++;


        char maior ='a';

        for (int i = 0; i < palavra.length() ; i++) {
            if(maior < palavra.charAt(i)) {

                maior = palavra.charAt(i);
            }
        }
        System.out.println("Saida "+cont+": Maior letra ="+ maior);

    }
    public static String caracteresSpecialMinusculo(String palavra){
        //Regex para remover caracteres especiais e toLowerCase para deixa em minusculo

        return palavra.toLowerCase().replaceAll("[^a-z0-9]", "");

    }
}
