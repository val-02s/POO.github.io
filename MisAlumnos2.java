import java.util.Scanner;

public class MisAlumnos2{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		Alumno alus[] = new Alumno[CapturaEntrada.capturarEntero("Introduzca el numero de alumnos:")];
		
		for(int i = 0; i<alus.length; i++){
			System.out.printf("Datos del Alumno %s\n", i, ":");
			alus[i] = new Alumno();
			System.out.println("Captura el nombre del alumno: ");
			alus[i].setNombre(scan.nextLine());
			System.out.println("Captura la matricula del alumno: ");
			alus[i].setMatricula(Integer.parseInt(scan.nextLine()));
			System.out.println("Captura el correo del alumno: ");
			alus[i].setCorreo(scan.nextLine());
			System.out.println("Captura el telefono del alumno: ");
			alus[i].setTelefono(scan.nextLine());
			System.out.println("Captura el promedio del alumno: ");
			alus[i].setPromedio(Double.parseDouble(scan.nextLine()));
		}

		for(int j = 0; j<alus.length; j++){
			System.out.printf("Datos Alumno %s:\n", j);
			if (alus[j].getNombre() != null) System.out.println(alus[j].getNombre()+"\t"+alus[j].getMatricula()+"\t"+alus[j].getCorreo()+"\t"+alus[j].getTelefono()+"\t"+alus[j].getPromedio());
		}
	}
}

class Alumno{
	int tamanio;
	public void setTam(int tam){
		tamanio = tam;
	}

	public int getTam(){
		return tamanio;
	}

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

class CapturaEntrada{

    public static int capturarEntero(String i){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+i+"");
        return (sc.nextInt());
    }
}