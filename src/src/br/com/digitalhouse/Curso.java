package br.com.digitalhouse;

import java.util.List;

public class Curso {

    private Integer codCurso;
    private String nome;
    private ProfessorTitular professortitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantAluno;
    private List<Aluno> alunoList;

    public Curso(Integer codCurso, String nome, ProfessorTitular professortitular, ProfessorAdjunto professorAdjunto, Integer quantAluno, List<Aluno> alunoList) {
        this.codCurso = codCurso;
        this.nome = nome;
        this.professortitular = professortitular;
        this.professorAdjunto = professorAdjunto;
        this.quantAluno = quantAluno;
        this.alunoList = alunoList;
    }

    public ProfessorTitular getProfessortitular() {
        return professortitular;
    }

    public void setProfessortitular(ProfessorTitular professortitular) {
        this.professortitular = professortitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantAluno() {
        return quantAluno;
    }

    public void setQuantAluno(Integer quantAluno) {
        this.quantAluno = quantAluno;
    }

    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean adicionarUmAluno (Aluno umAluno){


        return true;

    }

    public void excluirUmAluno (Aluno umAluno){

    }

    @Override
    public boolean equals(Object outroCurso) {
        if (this == outroCurso) {
            return true;
        }
        if (!(outroCurso instanceof Curso)) {
            return false;
        }
        Curso curso = (Curso) outroCurso;
        return this.codCurso == ((Curso) outroCurso).getCodCurso();
    }

}
