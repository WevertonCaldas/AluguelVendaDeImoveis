import java.util.ArrayList;

public class Corretor {

    int CRECI;
    String nome;
    String contato;
    String endereco;

    public Corretor(int CRECI, String nome, String contato, String endereco) {
        this.CRECI = CRECI;
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Corretor{" +
                "CRECI='" + CRECI + '\'' +
                ", nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
