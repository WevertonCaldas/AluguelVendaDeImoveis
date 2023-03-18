import DAO.*;
import modelos.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Contato contato1 = new Contato("83996951231", "suezio@gmail.com");
        Contato contato2 = new Contato("83996954465", "jose@gmail.com");

        Endereco endereco1 = new Endereco("rua José Otaviano de Moura", "Bairro", "Cajazeiras", "PB", "20");
        Endereco endereco2 = new Endereco("rua José Otaviano de Moura", "Bairro", "Cajazeiras", "PB", "20");

        // Cadastrar imovel

        CadastroImovel cadastroImovel = new CadastroImovel();

        Imovel imovel1 = new Imovel(1, "casa", "Casa com sala, cozinha, 2 banheiros,3 quartos", 500000.00,
                "Vende-se", new Corretor(1, "josé", "11122233345", endereco2, contato2), endereco1, contato1);

        Imovel imovel2 = new Imovel(2, "apartamento", "Apartamento com sala, cozinha, 2 banheiros,3 quartos", 600000.00,
                "Vende-se", new Corretor(2, "Suezio", "33322211154", endereco1, contato1), endereco2, contato2);

        cadastroImovel.adicionar(imovel1);
        cadastroImovel.adicionar(imovel2);

        // Listar imovel
        ArrayList<Imovel> imovelCadastrado = cadastroImovel.listar();
        System.out.println(imovelCadastrado);

        // Deletar imovel
        cadastroImovel.deletar(1);

//----------------------------------------------------------------
        // Vender imovel
//        VenderImovel venderImovel = new VenderImovel();
//
//        AlugarVender venda1 = new AlugarVender(1, "casa", "Casa com sala, cozinha, 2 banheiros,3 quartos", 500000.00,
//                "Vende-se", new Corretor(1, "josé", "11122233345", endereco2, contato2), endereco1, contato1, new Cliente(2,"Pedro", "55522233344", endereco1, contato1));
//
//        AlugarVender venda2 = new AlugarVender(2, "apartamento", "Apartamento com sala, cozinha, 2 banheiros,3 quartos", 600000.00,
//                "Vende-se", new Corretor(2, "Suezio", "33322211154", endereco1, contato1), endereco2, contato2, new Cliente(2,"Pedro", "55522233344", endereco1, contato1));
//
//        venderImovel.adicionar(venda1);
//        venderImovel.adicionar(venda2);
//
////         Listar imoveis vendidos
//
//        ArrayList<AlugarVender> imovelvendido = venderImovel.listar();
//        System.out.println(imovelvendido);
//
////         Deletar imoveis vendidos
//        venderImovel.deletar(1);

//----------------------------------------------------------------

//      AlugarImovel alugarImovel = new AlugarImovel();
//
////      alugarImovel
//
//        AlugarVender Alugados1 = new AlugarVender(1, "casa", "Casa com sala, cozinha, 2 banheiros,3 quartos", 500000.00,
//                "Vende-se", new Corretor(1, "josé", "11122233345", endereco2, contato2), endereco1, contato1, new Cliente(2,"Pedro", "55522233344", endereco1, contato1));
//
//        AlugarVender Alugados2 = new AlugarVender(2, "apartamento", "Apartamento com sala, cozinha, 2 banheiros,3 quartos", 600000.00,
//                "Vende-se", new Corretor(2, "Suezio", "33322211154", endereco1, contato1), endereco2, contato2, new Cliente(2,"Pedro", "55522233344", endereco1, contato1));
//
//      alugarImovel.adicionar(Alugados1);
//      alugarImovel.adicionar(Alugados2);
//
////        listar imoveis aligados
//        ArrayList<AlugarVender> imovelAlugado = alugarImovel.listar();
//        System.out.println(imovelAlugado);
//
//      alugarImovel.deletar(1);

//----------------------------------------------------------------

        // cadastrar cliente

//      CadastroCliente cliente = new CadastroCliente();
//
//      Cliente cliente1 = new Cliente(1,"Carlos", "11122233344", endereco1, contato1);
//      Cliente cliente2 = new Cliente(2,"Pedro", "55522233344", endereco1, contato1);
//
//      cliente.adicionar(cliente1);
//      cliente.adicionar(cliente2);
//
////        listar clientes
//
//        ArrayList<Cliente> clienteCadastrado =  cliente.listar();
//        System.out.println(clienteCadastrado);
//
//        cliente.deletar(1);

//----------------------------------------------------------------

        // cadastro corretor
//        CadastroCorretor corretor = new CadastroCorretor();
//
//        Corretor corretor1 = new Corretor(1, "josé", "11122233345", endereco2, contato2);
//        Corretor corretor2 = new Corretor(2,"Suezio","55511133345", endereco2, contato2);
//
//        corretor.adicionar(corretor1);
//        corretor.adicionar(corretor2);
//
//        ArrayList<Corretor> corretorCadastrado =corretor.listar();
//        System.out.println(corretorCadastrado);
//
//        corretor.deletar(1);


    }


}

