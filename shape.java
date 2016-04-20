import java.util.Scanner;

public class shape {
	String nome;
	public shape(String nome){
		this.nome=nome;
	}
	public String getname(){
		return nome;
	}
	
	public static void main(String[] args) {
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
		System.out.println(tri.Calculararea());
	}

}
