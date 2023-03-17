import Modelos.Contato;
import Modelos.Corretor;
import Modelos.Endereco;
import Modelos.Imovel;
import cruds.CadastroImovel;

public class Main {

    public static void main(String[] args) {

        Contato contato1 = new Contato("83996951231", "suezio@gmail.com");
        Contato contato2 = new Contato("83996954465", "jose@gmail.com");

        Endereco endereco1 = new Endereco("rua José Otaviano de Moura", "Bairro", "Cajazeiras", "PB", "20");
        Endereco endereco2 = new Endereco("rua José Otaviano de Moura", "Bairro", "Cajazeiras", "PB", "20");

        // Cadastrar imovel

        CadastroImovel cadastroImovel = new CadastroImovel();

        Imovel imovel1 = new Imovel(1, "casa", "Casa com sala, cozinha, 2 banheiros,3 quartos", 500000.00,
                "Vende-se", new Corretor(1, "josé", contato2, endereco2), endereco1, contato1);

        Imovel imovel2 = new Imovel(2, "apartamento", "Apartamento com sala, cozinha, 2 banheiros,3 quartos", 600000.00,
                "Vende-se", new Corretor(2, "Suezio", contato1, endereco1), endereco2, contato2);

        cadastroImovel.adicionarImovel(imovel1);
        cadastroImovel.adicionarImovel(imovel2);

        // Listar imovel
        cadastroImovel.ListarImovel();

        // Deletar imovel
        cadastroImovel.DeletarImovel(1);

//----------------------------------------------------------------
        // Vender imovel
//        VenderImovel venderImovel = new VenderImovel();
//
//        AlugarVender venda1 = new AlugarVender(1,"casa", "rua José Otaviano de Moura - numero 47", "Casa com sala, cozinha, 2 banheiros,3 quartos", 500.00, "83999556622", "Vende-se", new Corretor(2,"Suezio", "83996951231", "Rua josé Moura, numero - 88"), new Cliente(2,"Pedro", "55522233344", "83996953322"));
//        AlugarVender venda2 = new AlugarVender(2,"apartamento", "rua José Otaviano de Moura - numero 103", "Apartamento com sala, cozinha, 2 banheiros,3 quartos", 600.00, "83999554411", "Vende-se", new Corretor(2,"Suezio", "83996951231", "Rua josé Moura, numero - 88"), new Cliente(2,"Pedro", "55522233344", "83996953322"));
//
//        venderImovel.adicionarImovel(venda1);
//        venderImovel.adicionarImovel(venda2);

        // Listar imoveis vendidos

//        venderImovel.ListarImovel();

        // Deletar imoveis vendidos
//        venderImovel.DeletarImovel(1);

//----------------------------------------------------------------

//      AlugarImovel alugarImovel = new AlugarImovel();
//
//      alugarImovel

//      AlugarVender Alugados1 = new AlugarVender(1,"casa", "rua José Otaviano de Moura - numero 47", "Casa com sala, cozinha, 2 banheiros,3 quartos", 500.00, "83999556622", "Vende-se", new Corretor(2,"Suezio", "83996951231", "Rua josé Moura, numero - 88"), new Cliente(2,"Pedro", "55522233344", "83996953322"));
//      AlugarVender Alugados2 = new AlugarVender(2,"apartamento", "rua José Otaviano de Moura - numero 103", "Apartamento com sala, cozinha, 2 banheiros,3 quartos", 600.00, "83999554411", "Vende-se", new Corretor(2,"Suezio", "83996951231", "Rua josé Moura, numero - 88"), new Cliente(2,"Pedro", "55522233344", "83996953322"));
//
//      alugarImovel.adicionarImovelParaAluguel(Alugados1);
//      alugarImovel.adicionarImovelParaAluguel(Alugados2);

        //listar imoveis aligados

//        alugarImovel.ListarImovelDisponivelAluguel();

//      alugarImovel.DeletarImovelAlugado(1);

//----------------------------------------------------------------

        // cadastrar cliente

//      CadastroCliente cliente = new CadastroCliente();
//
//      Cliente cliente1 = new Cliente(1,"Carlos", "11122233344", "83996955263");
//      Cliente cliente2 = new Cliente(2,"Pedro", "55522233344", "83996953322");

//      cliente.adicionarCliente(cliente1);
//      cliente.adicionarCliente(cliente2);

        //listar clientes

//        cliente.ListarClientes();

//        cliente.DeletarCliente(1);

//----------------------------------------------------------------

        // cadastro corretor
//        CadastroCorretor corretor = new CadastroCorretor();

//        Corretor cliente1 = new Corretor(1,"josé", "83996954465", "Rua josé otaviano, numero - 54");
//        Corretor cliente2 = new Corretor(2,"Suezio", "83996951231", "Rua josé Moura, numero - 88");
//
//        corretor.adicionarCorretor(cliente1);
//        corretor.adicionarCorretor(cliente2);

//        corretor.ListarCorretor();

//        corretor.DeletarCorretor(1);


    }


}

