public class Corretor {

    int CRECI;
    String nome;
    Contato contato;
    Endereco endereco;

    public Corretor() {
    }

    public Corretor(int CRECI, String nome, Contato contato, Endereco endereco) {
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
