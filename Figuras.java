//Abstract class
abstract class Figura{
	protected double x;
	protected double y;
	
	public Figura(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public abstract double calcularArea();
	public abstract double calcularPerim();
}

interface Dibujable{
	public void dibujar();
}

interface Rotable{
	public void rotar(int grados);
}

interface Ampliable{
	public void ampliar(int porcentaje);
}

interface Reducible{
	public void redudir(int porcentaje);
}

//Multiple Inheritance
class Circulo extends Figura implements Dibujable, Rotable, Ampliable, Reducible{
	private double radio;

	public Circulo(double x, double y, double radio){
		super(x,y);
		this.radio = radio;
	}
	
	public double calcularArea(){
		return Math.PI*radio*radio;
	}
	public double calcularPerim(){
		return Math.PI*radio*2;
	}

	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN CIRCULO");
	}
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CIRCULO");
	}
	public void ampliar(int porcentaje){
		System.out.println("Imaginame AMPLIFICADO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
	public void reducir(int porcentaje){
		System.out.println("Imaginame REDUCIDO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
}//Fin clase Circulo

//Multiple Inheritance
class Cuadrado extends Figura implements Dibujable, Rotable, Ampliable, Reducible{
	private double lado;
	public Cuadrado(double x, double y, double lado){
		super(x,y);
		this.lado = lado;
	}
	
	public double calcularArea(){
		return lado*lado;
	}
	public double calcularPerim(){
		return 4*lado;
	}
	
	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN CUADRADO");
	}
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CUADRADO");
	}
		public void ampliar(int porcentaje){
		System.out.println("Imaginame AMPLIFICADO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
	public void reducir(int porcentaje){
		System.out.println("Imaginame REDUCIDO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
} //Fin clase Cuadrado

//Multiple Inheritance
class Triangulo extends Figura implements Dibujable, Rotable, Ampliable, Reducible{
	private double base;
	private double altura;
	private double lado1;
	private double lado2;

	public Triangulo(double x, double y, double base, double altura, double lado1, double lado2){
		super(x,y);
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double calcularArea(){
		return (base*altura)/2;
	}
	public double calcularPerim(){
		return base+lado1+lado2;
	}

	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN TRIANGULO");
	}
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN TRIANGULO");
	}
		public void ampliar(int porcentaje){
		System.out.println("Imaginame AMPLIFICADO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
	public void reducir(int porcentaje){
		System.out.println("Imaginame REDUCIDO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
}//Fin clase Triangulo

class Rectangulo extends Figura implements Dibujable, Rotable, Ampliable, Reducible{
	private double base;
	private double altura;

	public Rectangulo(double x, double y, double base, double altura){
		super(x,y);
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea(){
		return (base*altura);
	}
	public double calcularPerim(){
		return (2*base)+(2*altura);
	}

	public void dibujar(){
		System.out.println("Imaginame DIBUJADO: soy UN TRIANGULO");
	}
	public void rotar(int grados){
		System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN TRIANGULO");
	}
		public void ampliar(int porcentaje){
		System.out.println("Imaginame AMPLIFICADO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
	public void reducir(int porcentaje){
		System.out.println("Imaginame REDUCIDO " + porcentaje +" PORCIENTO: soy UN CIRCULO");
	}
}

public class Figuras{
	public static void main(String args[]){
		Circulo cir = new Circulo(200.0, 235.0, 23.5);
		Cuadrado cua = new Cuadrado(200.0, 235.0, 23.5);
		Triangulo tri = new Triangulo(200.0, 235.0, 23.5, 16.5, 25.5, 25.5);
		Rectangulo rec = new Rectangulo(200.0, 235.0,23.5, 16.5);
		System.out.println("Area del Circulo: "+ cir.calcularArea());
		System.out.println("Perimetro del Circulo: "+ cir.calcularPerim());
		cir.dibujar();
		cir.rotar(20);
		cir.ampliar(30);
		cir.reducir(40);
		System.out.println();
		System.out.println("Area del Cuadrado: "+ cua.calcularArea());
		System.out.println("Perimetro del Cuadrado: "+ cua.calcularPerim());
		cua.dibujar();
		cua.rotar(20);
		cua.ampliar(30);
		cua.reducir(40);
		System.out.println();
		System.out.println("Area del Triangulo: "+ tri.calcularArea());
		System.out.println("Perimetro del Triangulo: "+ tri.calcularPerim());
		tri.dibujar();
		tri.rotar(20);
		tri.ampliar(30);
		tri.reducir(40);
		System.out.println();
		System.out.println("Area del Rectangulo: "+ rec.calcularArea());
		System.out.println("Perimetro del Rectangulo: "+ rec.calcularPerim());
		rec.dibujar();
		rec.rotar(20);
		rec.ampliar(30);
		rec.reducir(40);
	}
}
		
