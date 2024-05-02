package Model;

public class Fornecedor extends Pessoa{
    private int nomeFantasia;
    private int contato;

    public Fornecedor(int id, String nome, String fone1, String fone2, String email, String cpfCnpj,
                     String rgInscricaoEstadual, String cep, String cidade, String bairro, String logradouro,
                     String complemento, int nomeFantasia, int contato) {
        super(id, nome, fone1, fone2, email, cpfCnpj, rgInscricaoEstadual, cep, cidade, bairro, logradouro, complemento);
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
    }

    public int getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(int nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNome Fantasia: " + this.nomeFantasia + "\nContato: " + this.contato;
    }


}
