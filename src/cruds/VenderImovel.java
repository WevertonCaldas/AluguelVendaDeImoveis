package cruds;

import Modelos.AlugarVender;

import java.util.ArrayList;

public class VenderImovel {

    ArrayList<AlugarVender> Imoveis = new ArrayList<>();

    public void adicionarImovel(AlugarVender imovel) {
        Imoveis.add(imovel);
    }

    public void ListarImovel() {

        for (int i = 0; i < Imoveis.size(); i++) {

            System.out.println(
                    "Imovel - " + Imoveis.get(i).getNumeroCadastro() +
                            "\ntipo de Imovel: " + Imoveis.get(i).getTipo() + "\n" +
                            "Endereço: " + Imoveis.get(i).getEndereco() + "\n" +
                            "Descrição: " + Imoveis.get(i).getDescricao() + "\n" +
                            "Valor: " + Imoveis.get(i).getValor() + " ------ " + "Telefone: " + Imoveis.get(i).getTelefone() + "\n" +
                            "Status: " + Imoveis.get(i).getStatus() +
                            "Corretor: " + Imoveis.get(i).getCorretor().getNome() + " ------ " + "Cliente: " + Imoveis.get(i).getCliente().getNome() + "\n"
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
