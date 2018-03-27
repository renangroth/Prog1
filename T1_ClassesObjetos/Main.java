import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Medicamento Medicamento =new Medicamento();
        int opcao = 0;
	  	int opcao1 = 0;
	  	int percentual = 0;
	  	int quantidade = 0;
	
	
		do{
			System.out.println("1- Reajustar Preço da Venda");
			System.out.println("2- Vender Medicamento");
			System.out.println("3- Comprar Medicamento");
			System.out.println("4- Mostrar Medicamento");
			System.out.println("5- Mostrar Laboratorio");
			System.out.println("0- Sair");

			opcao = in.nextInt(); 
			if(opcao == 1){
	 			System.out.println("1- Aumento");
				System.out.println("2- Promoção");
				opcao1 = in.nextInt();	
				if(opcao1 == 1){
					System.out.println("Digite o percentual que deseja aumentar: (Ex: 20%)");			
					percentual = in.nextInt();
					Medicamento.reajustarPrecoVenda(percentual, opcao1);
				}
				else if(opcao1 == 2){
					System.out.println("Digite o percentual que deseja diminuir: (Ex: 20%)");
					percentual = in.nextInt();
					Medicamento.reajustarPrecoVenda(percentual, opcao1);
				}
			}	
			else if(opcao == 2){
		
				System.out.println("Digite quantos medicamentos deseja vender: ");
				quantidade = in.nextInt();
				Medicamento.vender(quantidade);
			}
			else if(opcao == 3){
		
				System.out.println("Digite quantos medicamentos deseja comprar:");
				quantidade = in.nextInt();
				Medicamento.comprar(quantidade);
			}
			else if(opcao == 4){
				Medicamento.mostrar();
			}

			else if(opcao == 5){
				Medicamento.mostrarLab();	
			}

		}while(opcao != 0);
	}
}


