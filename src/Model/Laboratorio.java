package Model;

public class Laboratorio extends Pessoa{
    private String nomeFantasia;
    private String contato;
    private String status;

    public Laboratorio(int id, String nome, String fone1, String fone2, String email, String cpfCnpj,
                       String rgInscricaoEstadual, String cep, String cidade, String bairro, String logradouro,
                       String complemento, String nomeFantasia, String contato, String status) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, cep, cidade, bairro, logradouro, complemento);
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
        this.status = status;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNome Fantasia: " + this.nomeFantasia + "\nContato: " + this.contato + "\nStatus: " + this.status;
    }

    
}
