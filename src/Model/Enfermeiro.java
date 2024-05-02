package Model;

import java.util.Date;

public class Enfermeiro extends Pessoa{
    private String cre;
    private String login;
    private String senha;
    private String nomeSocial;
    private Jornada jornada;

    public Enfermeiro(int id, String nome, String fone1, String fone2, String email, String cpfCnpj,
                     String rgInscricaoEstadual, String cep, String cidade, String bairro, String logradouro,
                     String complemento, String cre, String login, String senha, String nomeSocial) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, cep, cidade, bairro, logradouro, complemento);
        this.cre = cre;
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }

    public String getCre() {
        return cre;
    }

    public void setCre(String cre) {
        this.cre = cre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada){
        this.jornada = jornada;
    }

    public void iniciarJornada(Date dataInicial, Date dataFinal, int cargaHoraria){
        this.jornada = new Jornada(dataInicial, dataFinal, cargaHoraria);
    }

    @Override
    public String toString(){
        return super.toString() + "\nCRE: " + this.cre + "\nNome Social: " + this.nomeSocial;
    }

}
