package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor {


    private Integer quantDeHoras;


    public ProfessorAdjunto(String nome, String sobrenome, Integer tempCasa, Integer codProf) {
        super(nome, sobrenome, tempCasa, codProf);
    }

    public Integer getQuantDeHoras() {
        return quantDeHoras;
    }

    public void setQuantDeHoras(Integer quantDeHoras) {
        this.quantDeHoras = quantDeHoras;
    }
}
