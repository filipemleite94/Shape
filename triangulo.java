//Subclasse
public class triangulo extends shape{
	double l1, l2, l3, p;
	
	//construtor chama o contrutor da superclasse
	public triangulo(String nome) {
		super(nome);
	}
	
	//recebe dados particulares a ela
	public void definir(double l1, double l2, double l3){
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		p=(l1+l2+l3)/2;
	}
	
	//tipo de calculo especifico ao triangulo
	public double Calculararea(){
		return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
	}
}
