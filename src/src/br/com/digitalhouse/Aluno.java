package br.com.digitalhouse;

public class Aluno {

    private String nome;
    private String sobrenome;
    private Integer codAluno;

    public Aluno(String nome, String sobrenome, Integer codAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Integer codAluno) {
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object outroAluno) {
        if (this == outroAluno) {
            return true;
        }
        if (!(outroAluno instanceof Aluno)) {
            return false;
        }

        return this.codAluno == ((Aluno) outroAluno).getCodAluno();
    }
}
