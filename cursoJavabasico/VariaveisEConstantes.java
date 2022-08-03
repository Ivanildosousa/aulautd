package cursoJavabasico;

public class VariaveisEConstantes {

	public static void main(String[] args) {
		//Constantes
		final double Aceleracao_gravidade_terra = 9.80665;
		
		//Criação de variaveis
		String nome="Ivanildo";
		int idade=45;
		double peso=85.5,altura=1.70;
		char sexo='M',cnh='A';
		boolean doadorOrgaos=true;
		
		System.out.println("Nome "+nome);
		System.out.println("Idade "+idade);
		System.out.println("Peso "+peso);
		System.out.println("Altura "+altura);
		System.out.println("Sexo "+sexo);
		System.out.println("CNH "+cnh);
		System.out.println("Doador " +doadorOrgaos);
		System.out.println("Gravidade "+Aceleracao_gravidade_terra);
	}

}
