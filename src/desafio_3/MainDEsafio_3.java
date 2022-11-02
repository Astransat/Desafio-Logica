package desafio_3;

import java.util.Scanner;

public class MainDEsafio_3 {
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
            simplificarNomes(text[i]);
        }

    }

    public static void simplificarNomes(String frase){

        String tex = frase;
        String[] arrary = tex.split(" ");
        String resultado="";
        cont++;

        for (int i = 0; i < arrary.length; i++) {


            if(i==0) {
                resultado+=arrary[arrary.length-1].toUpperCase()+", ";
            }
            else{
                resultado+=(i!=arrary.length-1?arrary[i-1].charAt(0)+".": arrary[i-1].charAt(0));
            }
        }

        System.out.println("Saida "+cont+":"+resultado);

    }
    public static String caracteresSpecialMinusculo(String palavra){
        //Regex para remover caracteres especiais e toLowerCase para deixa em minusculo

        return palavra.toLowerCase().replaceAll("[^a-z0-9]", "");

    }
}
