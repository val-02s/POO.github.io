
import java.util.Scanner;

public class MisAlumnos{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Alumno al1 = new Alumno();
		Alumno al2 = new Alumno();
		Alumno al3 = new Alumno();
			
		al1.setNombre("Valentina");
		al2.setNombre("Alex");
		
		System.out.println("Captura un nombre: ");
		al3.setNombre(scan.nextLine());
	
		System.out.println("En forma individual");
		System.out.println("Nombre: "+ al1.getNombre());
		System.out.println("Nombre: "+ al2.getNombre());
		System.out.println("Nombre: "+ al3.getNombre());
		System.out.println();
		
		Alumno alus[] = new Alumno[2];

		for (int i = 0; i<2; i++){
			alus[i] = new Alumno();
		}
		
		for (int i = 0; i<2; i++){
			alus[i].setNombre(args[i]);
		}
		
		System.out.println("En forma de arreglo de objetos");
		for (int i = 0; i<2; i++){
		System.out.println("[" + i + "].Nombre: "+ alus[i].getNombre());
		}
		
	}

}

class Alumno{
	String nombre;

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
	}

}