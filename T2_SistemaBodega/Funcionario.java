import java.util.*;

public class Funcionario{
	String nome, cpf, cargo;
	double salario;

	public Funcionario(){

	}

	public Funcionario(String nome, String cpf, String cargo, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String toString(){
		return "\nNome: " + this.nome+"\nCPF: " + this.cpf + "\nSalario : R$ " + this.salario + "\nCargo: " + this.cargo + "\n\n";
	}
}