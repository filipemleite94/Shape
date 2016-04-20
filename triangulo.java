
public class triangulo extends shape{
	double l1, l2, l3, p;
	public triangulo(String nome) {
		super(nome);
	}
	public void definir(double l1, double l2, double l3){
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		p=(l1+l2+l3)/2;
	}
	public double Calculararea(){
		return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
	}
}
