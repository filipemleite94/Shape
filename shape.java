import java.util.Scanner;

public class shape {
	//propriedades gerais de figuras geom�tricas, no caso, o nome.
	String nome;
	public shape(String nome){
		this.nome=nome;
	}
	public String getname(){
		return nome;
	}
	
	//fun��o main que vai requisitar as fun��es da subclasse tri�ngulo
	public static void main(String[] args) {
		
		//interface pra o usu�rio personalizar o seu tri�ngulo:
		Scanner entrada= new Scanner(System.in);
		System.out.println("Digite o nome da figura: ");
		String c=entrada.nextLine();
		double l1,l2,l3;
		triangulo tri=new triangulo(c);
		System.out.println("Digite os lados da figura: ");
		l1=entrada.nextDouble();
		l2=entrada.nextDouble();
		l3=entrada.nextDouble();
		tri.definir(l1,l2,l3);
		
		//retornar a �rea do tri�ngulo.
		System.out.println("A area do triangulo "+tri.getname()+" eh "+tri.Calculararea());
	}

}
