package cruds;

import Modelos.Imovel;

import java.util.ArrayList;

public class CadastroImovel {

    ArrayList<Imovel> Imoveis = new ArrayList<>();

    public void adicionarImovel(Imovel imovel) {
        Imoveis.add(imovel);
    }

    public void ListarImovel() {

        for (int i = 0; i < Imoveis.size(); i++) {

            System.out.println(
                    "Imovel - " + Imoveis.get(i).getNumeroCadastro() +
                            "\ntipo de Imovel: " + Imoveis.get(i).getTipo() + "\n" +
                            "Endereço: " + Imoveis.get(i).getEndereco() + "\n" +
                            "Descrição: " + Imoveis.get(i).getDescrição() + "\n" +
                            "Valor: " + Imoveis.get(i).getValor() + " ------ " + "Contato: " + Imoveis.get(i).getContato() + "\n" +
                            "Status: " + Imoveis.get(i).getStatus() +
                            "Corretor: " + Imoveis.get(i).getCorretor().getNome()
                            + "\n-------------------------------------------"
            );
        }

    }

    public void DeletarImovel(int numeroCadastro) {

        for (int i = 0; i < Imoveis.size(); i++) {

            if (Imoveis.get(i).getNumeroCadastro() == numeroCadastro) {
                Imoveis.remove(Imoveis.get(i));
                System.out.println("Imovel deletado com sucesso!!!");
            }

        }

    }


}
