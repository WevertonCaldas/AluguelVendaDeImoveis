import java.util.ArrayList;

public class AlugarImovel {
    ArrayList<AlugarVender> Imoveis = new ArrayList<>();

    public void adicionarImovelParaAluguel(AlugarVender imovel) {
        Imoveis.add(imovel);
    }

    public void ListarImovelDisponivelAluguel() {
        for (int i = 0; i < Imoveis.size(); i++) {

            System.out.println(
                    "Imovel - " + Imoveis.get(i).numeroCadastro +
                            "\ntipo de Imovel: " + Imoveis.get(i).tipo + "\n" +
                            "Endereço: " + Imoveis.get(i).endereco + "\n" +
                            "Descrição: " + Imoveis.get(i).descricao + "\n" +
                            "Valor: " + Imoveis.get(i).valor + " ------ " + "Telefone: " + Imoveis.get(i).telefone + "\n" +
                            "Status: " + Imoveis.get(i).status +
                            "Corretor: " + Imoveis.get(i).corretor.nome + " ------ " + "Corretor: " + Imoveis.get(i).cliente.nome + "\n"
                            + "\n-------------------------------------------"
            );
        }

    }

    public void DeletarImovelAlugado(int numeroCadastro) {

        for (int i = 0; i < Imoveis.size(); i++) {

            if (Imoveis.get(i).numeroCadastro == numeroCadastro) {
                Imoveis.remove(Imoveis.get(i));
                System.out.println("Imovel alugado com sucesso!!!");
            }

        }

    }

}
