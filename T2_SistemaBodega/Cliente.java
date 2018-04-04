import java.util.*;

public class Cliente{
	String nome, cpf;
	boolean fiado;

	public Cliente(){

	}

	public Cliente(String nome, String cpf, boolean fiado){
		this.nome = nome;
		this.cpf = cpf;
		this.fiado = fiado;
	}

	public String toString(){
		String fi;
		if(this.fiado)
			fi = new String("Sim");
		else
			fi = new String("Nao");
		return "\nNome: " + this.nome + "\nCPF: " + this.cpf + "\nPode comprar fiado? " + fi;
	}
}