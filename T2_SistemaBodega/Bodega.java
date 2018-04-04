import java.util.*;

public class Bodega{
	public static void main(String[] args){
		ArrayList<Funcionario> bodegueiros = new ArrayList<>();
		ArrayList<Bebida> produtos = new ArrayList<>();
		ArrayList<Cliente> fregueses = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		Empresa bodega = new Empresa("Bodega da Amizade", "152475238/123", "João Pereira");
		bodegueiros.add(new Funcionario("Renan", "03547113008", "Gerente", 1900.34));
		bodegueiros.add(new Funcionario("Luiz", "18242115078", "Bartender", 1400.20));
		bodegueiros.add(new Funcionario("Willian", "47487720004", "Garçom", 1300.63));
		Funcionario fun = new Funcionario();
		produtos.add(new Bebida("Velho Bareiro", 20.01, "39%", 910, 12));
		Bebida beb = new Bebida();
		fregueses.add(new Cliente("Zé", "03547115041", true));
		Cliente cli = new Cliente();
		int x;

		do{
		System.out.println("\n1 - Contratar Bodegueiro          | 6 - Conferir Estoque de Bebida");
		System.out.println("2 - Cadastrar Bebida no Estoque   | 7 - Mostrar Dados Bebidas");
		System.out.println("3 - Cadastrar Cliente Novo        | 8 - Mostrar Dados Clientes");
		System.out.println("4 - Vender Bebida                 | 9 - Mostrar Dados Bodegueiros");
		System.out.println("5 - Comprar Bebida                | 0 - Fechar Programa");
		x = entrada.nextInt();
		switch(x){
			case 1:
				bodegueiros.add(bodega.contrata());
				break;
			case 2:
				produtos.add(bodega.cadastraBebida());
				break;
			case 3:
				fregueses.add(bodega.cadastraCliente());
				break;
			case 4:
				beb.venda(produtos);
				break;
			case 5:
				beb.compra(produtos);
				break;
			case 6:
				beb.estoque(produtos);
				break;
			case 7:
				bodega.mostraBeb(produtos);
				break;
			case 8:
				bodega.mostraCli(fregueses);
				break;
			case 9:
				bodega.mostraFun(bodegueiros);
				break;
			case 0:
				System.out.println("Programa Encerrado!");
				break;
			default:
				System.out.println("Opção invalida, digite novamente: ");
				break;
			}
		}while(x != 0);
	}
}