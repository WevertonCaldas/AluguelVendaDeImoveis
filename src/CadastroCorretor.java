import java.util.ArrayList;

public class CadastroCorretor {

    ArrayList<Corretor> Corretores = new ArrayList<>();

    public void adicionarCorretor(Corretor corretor) {
        Corretores.add(corretor);

    }

    public void ListarCorretores() {

        for (int i = 0; i < Corretores.size(); i++) {

            System.out.println(
                    "Corretor - {" +
                            "CRECI='" + Corretores.get(i).CRECI + '\'' +
                            ", nome='" + Corretores.get(i).nome + '\'' +
                            ", contato='" + Corretores.get(i).contato + '\'' +
                            ", endereco='" + Corretores.get(i).endereco + '\'' +
                            '}'
            );
        }

    }

    public void DeletarCorretor(int numeroCreci) {

        for (int i = 0; i < Corretores.size(); i++) {

            if (Corretores.get(i).CRECI == numeroCreci) {
                Corretores.remove(Corretores.get(i));
                System.out.println("Corretor deletado com sucesso!!!");
            }

        }

    }
}
