class Medicamento{
	String nome = "Doril";
	Double precoVenda = 10.00;
	Data dataDeValidade = new Data();
	Laboratorio laboratorio = new Laboratorio();
	boolean receitaObrigatoria = false;
	int qtdEstoque = 10;	


	public void reajustarPrecoVenda(double percentual, int opcao1){
		if (opcao1 == 1)	
			this.precoVenda += this.precoVenda * (percentual/100);
		else
			this.precoVenda -= this.precoVenda * (percentual/100);
	
}

	public void vender(int quantidade){
		if(this.receitaObrigatoria == true){
			System.out.println("Este medicamento so pode ser vendido com receita");
		}
		else {
			if(quantidade <= this.qtdEstoque){
				System.out.println("Este medicamento pode ser vendido sem receita");
				this.qtdEstoque -= quantidade;
				System.out.println("Venda feita com sucesso");
			}else if(quantidade >= this.qtdEstoque){
				System.out.println("Quantidade maior do que no estoque, Venda nao concluida");
			}
		}
	}	

	public void comprar(int quantidade){
		this.qtdEstoque += quantidade;
		System.out.println("Produto aumentado no Estoque");

	}	


	public void mostrar(){
		System.out.println("Medicamento = " + this.nome);
		System.out.println("Preco da Venda = " + this.precoVenda);
		System.out.println("Data de Validade = " +dataDeValidade.formata());
		System.out.println("Receita Obrigatoria = " + ((this.receitaObrigatoria)? "Sim" : "Nao"));
		System.out.println("Quantidade do Estoque = " + this.qtdEstoque);		
	}	
	
	public void mostrarLab(){
		System.out.println("Nome fantasia do laboratorio:" + laboratorio.nomeFantasia);
		System.out.println("Razao social do laboratorio:" + laboratorio.razaoSocial);
		System.out.println("Cnpj do laboratorio:"+laboratorio.cnpj);
		System.out.println("Inscricao estadual do Laboratorio:"+laboratorio.inscricaoEstadual);
		System.out.println("Endereco do Laboratorio:"+laboratorio.endereco);
		System.out.println("Telefone do Laboratorio:"+laboratorio.telefone);
	}


}



