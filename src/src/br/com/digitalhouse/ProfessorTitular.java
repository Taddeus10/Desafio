package br.com.digitalhouse;

public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer tempCasa, Integer codProf) {
        super(nome, sobrenome, tempCasa, codProf);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
