package cruds;

import Modelos.AlugarVender;

import java.util.ArrayList;

public class AlugarImovel {
    ArrayList<AlugarVender> Imoveis = new ArrayList<>();

    public void adicionarImovelParaAluguel(AlugarVender imovel) {
        Imoveis.add(imovel);
    }

    public void ListarImovelDisponivelAluguel() {
        for (int i = 0; i < Imoveis.size(); i++) {

            System.out.println(
                    "Imovel - " + Imoveis.get(i).getNumeroCadastro() +
                            "\ntipo de Imovel: " + Imoveis.get(i).getTipo() + "\n" +
                            "Endereço: " + Imoveis.get(i).getEndereco() + "\n" +
                            "Descrição: " + Imoveis.get(i).getDescricao() + "\n" +
                            "Valor: " + Imoveis.get(i).getValor() + " ------ " + "Telefone: " + Imoveis.get(i).getTelefone() + "\n" +
                            "Status: " + Imoveis.get(i).getStatus() +
                            "Corretor: " + Imoveis.get(i).getCorretor().getNome() + " ------ " + "Corretor: " + Imoveis.get(i).getCliente().getNome() + "\n"
                            + "\n-------------------------------------------"
            );
        }

    }

    public void DeletarImovelAlugado(int numeroCadastro) {

        for (int i = 0; i < Imoveis.size(); i++) {

            if (Imoveis.get(i).getNumeroCadastro() == numeroCadastro) {
                Imoveis.remove(Imoveis.get(i));
                System.out.println("Imovel alugado com sucesso!!!");
            }

        }

    }

}
