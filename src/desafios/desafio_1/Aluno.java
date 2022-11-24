package desafios.desafio_1;

public class Aluno {
    private String nomeAluno;
    private int notaAluno1;
    private int notaAluno2;
    private int notaAluno3;
    private int notaAluno4;

    public Aluno(String nomeAluno, int notaAluno1, int notaAluno2, int notaAluno3, int notaAluno4) {
        this.nomeAluno = nomeAluno;
        this.notaAluno1 = notaAluno1;
        this.notaAluno2 = notaAluno2;
        this.notaAluno3 = notaAluno3;
        this.notaAluno4 = notaAluno4;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getNotaAluno1() {
        return notaAluno1;
    }

    public int getNotaAluno2() {
        return notaAluno2;
    }

    public int getNotaAluno3() {
        return notaAluno3;
    }

    public int getNotaAluno4() {
        return notaAluno4;
    }
}
