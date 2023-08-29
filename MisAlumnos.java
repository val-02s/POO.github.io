
import java.util.Scanner;

public class MisAlumnos{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Alumno alus[] = new Alumno[3];
		
		alus[0] = new Alumno();
		alus[0].setNombre("Valentina");
		alus[0].setMatricula(1282007);
		alus[0].setCorreo("valentina.segura@uabc.edu.mx");
		alus[0].setTelefono("6648137183");
		alus[0].setPromedio(79.9);

		alus[1] = new Alumno();
		System.out.println("Captura el nombre del alumno: ");
		alus[1].setNombre(scan.nextLine());
		System.out.println("Captura la matricula del alumno: ");
		alus[1].setMatricula(Integer.parseInt(scan.nextLine()));
		System.out.println("Captura el correo del alumno: ");
		alus[1].setCorreo(scan.nextLine());
		System.out.println("Captura el telefono del alumno: ");
		alus[1].setTelefono(scan.nextLine());
		System.out.println("Captura el promedio del alumno: ");
		alus[1].setPromedio(Double.parseDouble(scan.nextLine()));

		alus[2] = new Alumno();
		if  (args.length > 4){
			alus[2].setNombre(args[0]);
			alus[2].setMatricula(Integer.parseInt(args[1]));
			alus[2].setCorreo(args[2]);
			alus[2].setTelefono(args[3]);
			alus[2].setPromedio(Double.parseDouble(args[4]));
		}
		else System.out.println("uso: java MisAlumnos nombere matricula correo telefono promedio");

		System.out.println("Datos:");
		for(int i = 0; i<alus.length; i++){
			if (alus[i].getNombre() != null) System.out.println(alus[i].getNombre()+"\t"+alus[i].getMatricula()+"\t"+alus[i].getCorreo()+"\t"+alus[i].getTelefono()+"\t"+alus[i].getPromedio());
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

	int matricula;

	public void setMatricula(int mat){
		matricula = mat;
	}

	public int getMatricula(){
		return matricula;
	}

	String correo;

	public void setCorreo(String cor){
		correo = cor;
	}

	public String getCorreo(){
		return correo;
	}

	String telefono;

	public void setTelefono(String tel){
		telefono = tel;
	}

	public String getTelefono(){
		return telefono;
	}

	double promedio;

	public void setPromedio(double prom){
		promedio = prom;
	}

	public double getPromedio(){
		return promedio;
	}

}