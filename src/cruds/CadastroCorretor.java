package cruds;

import Modelos.Corretor;

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
                            "CRECI='" + Corretores.get(i).getCRECI() + '\'' +
                            ", nome='" + Corretores.get(i).getNome() + '\'' +
                            ", contato='" + Corretores.get(i).getContato() + '\'' +
                            ", endereco='" + Corretores.get(i).getEndereco()+ '\'' +
                            '}'
            );
        }

    }

    public void DeletarCorretor(int numeroCreci) {

        for (int i = 0; i < Corretores.size(); i++) {

            if (Corretores.get(i).getCRECI() == numeroCreci) {
                Corretores.remove(Corretores.get(i));
                System.out.println("Corretor deletado com sucesso!!!");
            }

        }

    }
}
