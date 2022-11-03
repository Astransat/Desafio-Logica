package desafios.desafio_1;

import java.util.Scanner;

public class MainDesafio_1 {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Entre quantidade de aluno");
        int quantidade = validarInteiro(entrada.nextLine());
        cadastraAluno(quantidade);

    }

    public  static void  cadastraAluno(int quantidadeAluno){

        Turma turma = new Turma(quantidadeAluno);

        while (turma.getQuantidadeDeAlunos()!= quantidadeAluno) {
         



                System.out.println("Entrada " + (turma.getQuantidadeDeAlunos() + 1) + ":");
                System.out.println("Escreva seu nome:");
                String nome = entrada.nextLine();
                System.out.println("Digite a primeira nota: ");
                int nota1 = validarInteiro(entrada.nextLine());
                System.out.println("Digite a segunda nota: ");
                int nota2 = validarInteiro(entrada.nextLine());
                System.out.println("Digite a terceira nota: ");
                int nota3 = validarInteiro(entrada.nextLine());
                System.out.println("Digite a quarta nota: ");
                int nota4 = validarInteiro(entrada.nextLine());

                Aluno aluno = new Aluno(nome, nota1, nota2, nota3, nota4);
                turma.inserirAluno(aluno);
          
        }
        turma.mostraMediaAlunos();

    }
    public static int validarInteiro(String valiada){

        //Regex para aceitar apenas numero de inteiro
        while (!valiada.matches("[0-9]*")){
            System.out.println("Apenas numeros inteiros positivos podem ser usados: ");
            valiada = entrada.nextLine();

        }
        return Integer.parseInt( valiada);
    }
}
