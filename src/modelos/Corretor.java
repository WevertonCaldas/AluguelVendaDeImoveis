package modelos;


public class Corretor extends AbstPessoa {

    int CRECI;
    public Corretor() {
    }

    public Corretor(int CRECI, String nome, String cpf, Endereco endereco, Contato contato) {
        this.CRECI = CRECI;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
    }

    public int getCRECI() {
        return CRECI;
    }

    public void setCRECI(int CRECI) {
        this.CRECI = CRECI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Corretor{" +
                "CRECI=" + CRECI +
                ", nome='" + nome + '\'' +
                ", contato=" + contato +
                ", endereco=" + endereco +
                '}';
    }
}
