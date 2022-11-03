package desafios.desafio_1;

public class Turma {
    private Aluno turmaAluno[];
    private int quantidadeDeAlunos;

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public Turma(int tamanho) {

        this.turmaAluno = new Aluno[tamanho];
        this.quantidadeDeAlunos = 0;
    }

    public boolean inserirAluno(Aluno novo){
        if(this.quantidadeDeAlunos==this.turmaAluno.length){

            return false;
        }else{
            turmaAluno[quantidadeDeAlunos]=novo;
            quantidadeDeAlunos++;

            return true;
        }
    }
    public void mostraMediaAlunos() {
        final double QUANTIDADENOTAS = 4;
        double media;

        for (int i = 0; i < quantidadeDeAlunos; i++) {

            media = (turmaAluno[i].getNotaAluno1()
                    + turmaAluno[i].getNotaAluno2()
                    + turmaAluno[i].getNotaAluno3()
                    + turmaAluno[i].getNotaAluno4()) / QUANTIDADENOTAS;

            System.out.println("Saida 1: Aluno = " + turmaAluno[i].getNomeAluno() + " // Media = " + media);

        }
    }

}
