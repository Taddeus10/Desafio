package br.com.digitalhouse;

public class Professor {

    private String nome;
    private String sobrenome;
    private Integer tempCasa;
    private Integer codProf;

    public Professor(String nome, String sobrenome, Integer tempCasa, Integer codProf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempCasa = tempCasa;
        this.codProf = codProf;
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

    public Integer getTempCasa() {
        return tempCasa;
    }

    public void setTempCasa(Integer tempCasa) {
        this.tempCasa = tempCasa;
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        this.codProf = codProf;
    }

    @Override
    public boolean equals(Object outroProf) {
        if (this == outroProf) {
            return true;
        }
        if (!(outroProf instanceof Professor)) {
            return false;
        }

        return this.codProf == ((Professor) outroProf).getCodProf();

    }


}
