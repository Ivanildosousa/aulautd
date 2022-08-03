package media;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String aluno;
		double nota1,nota2,nota3,nota4,media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do Aluno: ");
		aluno = leitor.nextLine();
		System.out.println(aluno);
		
		System.out.println("Digite a nota1: ");
		nota1=leitor.nextDouble();
		System.out.println(nota1);
		
		System.out.println("Digite a nota2: ");
		nota2=leitor.nextDouble();
		System.out.println(nota2);
		
		System.out.println("Digite a nota3: ");
		nota3=leitor.nextDouble();
		System.out.println(nota3);
		
		System.out.println("Digite a nota4: ");
		nota4=leitor.nextDouble();
		System.out.println(nota4);		
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("\n A média geral do Aluno é: " +media);
		
	}

}
