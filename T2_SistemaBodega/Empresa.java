import java.util.*; 

public class Empresa{
	String Nome, cnpj, Dono;
	Scanner entrada = new Scanner(System.in);

	public Empresa(){
		
	}

	public Empresa(String Nome, String cnpj, String Dono){
		this.Dono = Dono;
		this.Nome = Nome;
		this.cnpj = cnpj;
	}

	public Funcionario contrata(){
		String nome, cpf, cargo;
		double salario;
		System.out.println("Digite o nome do bodegueiro: ");
		nome = entrada.nextLine();
		System.out.println("CPF: ");
		cpf = entrada.next();
		System.out.println("Salario: ");
		salario = entrada.nextDouble();
		System.out.println("Cargo: ");
		entrada.nextLine();
		cargo = entrada.nextLine();
		Funcionario bo = new Funcionario(nome, cpf, cargo, salario);
		return bo;
	}

	public Bebida cadastraBebida(){
		System.out.println("Digite o nome da bebida: ");
		String nome = entrada.nextLine();
		System.out.println("Teor alcoolico: ");
		String teor = entrada.next();
		System.out.println("Preço: ");
		double preco = entrada.nextDouble();
		System.out.println("Quantidade de ml: ");
		int ml = entrada.nextInt();
		System.out.println("Quantidade de bebidas: ");
		int qtd = entrada.nextInt();
		Bebida beb = new Bebida(nome, preco, teor, ml, qtd);
		return beb;
	}

	public Cliente cadastraCliente(){
		String nome, cpf;
		int c;
		boolean fiado = false;
		System.out.print("\nDigite o nome do Cliente: ");
		nome = entrada.next();
		System.out.print("\nCPF: ");
		cpf = entrada.next();
		System.out.print("\nPode comprar fiado? 1(Sim) 2(Não): ");
		c = entrada.nextInt();
		if(c == 1)
			fiado = true;
		else if(c == 2)
			fiado = false;
		Cliente cl = new Cliente(nome, cpf, fiado);
		return cl;
	}

	public void mostraFun(ArrayList<Funcionario> fun){
		for(int i = 0; i < fun.size(); i++){
				Funcionario b = fun.get(i);
			System.out.println("Dados Bodegueiro [" +(i+1)+ "]" + b);
		}
	}

	public void mostraBeb(ArrayList<Bebida> beb){
		for(int i = 0; i < beb.size(); i++){
			Bebida b = beb.get(i);
			System.out.println("Dados Bebida [" +(i+1)+"]" + b);
		}
	}

	public void mostraCli(ArrayList<Cliente> cli){
		for(int i = 0; i < cli.size(); i++){
			Cliente c = cli.get(i);
			System.out.println("\nDados Cliente [" +(i+1)+"]" + c);
		}
	}
}