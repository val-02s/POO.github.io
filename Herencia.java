import java.util.Scanner;

public class Herencia{
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

		Profesor profe[] = new Profesor[1];
		for(int n = 0; n<profe.length; n++){
			profe[0] = new Profesor();
			System.out.println("Datos del Profesor:");
			System.out.println("Captura el nombre del Profesor: ");
			profe[0].setNombre(scan.nextLine());
			System.out.println("Captura el numero de empleado del profesor: ");
			profe[0].setNumEmp(Integer.parseInt(scan.nextLine()));
			System.out.println("Captura el correo del profesor: ");
			profe[0].setCorreo(scan.nextLine());
			System.out.println("Captura el telefono del profesor: ");
			profe[0].setTelefono(scan.nextLine());
			System.out.println("Captura el sueldo del profesor: ");
			profe[0].setSueldo(Double.parseDouble(scan.nextLine()));
		}
		
		for(int j = 0; j<alus.length; j++){
			System.out.printf("Datos Alumno %s:\n", j);
			if (alus[j].getNombre() != null) System.out.println(alus[j].getNombre()+"\t"+alus[j].getMatricula()+"\t"+alus[j].getCorreo()+"\t"+alus[j].getTelefono()+"\t"+alus[j].getPromedio());
		}

        System.out.println("Datos Profesor:");
		for(int k = 0; k<profe.length; k++){
			if (profe[k].getNombre() != null) System.out.println(profe[k].getNombre()+"\t"+profe[k].getNumEmp()+"\t"+profe[k].getCorreo()+"\t"+profe[k].getTelefono()+"\t"+profe[k].getSueldo());
		}
	}
}

class Persona{
	String nombre;

	public void setNombre(String nom){
		nombre = nom;
	}

	public String getNombre(){
		return nombre;
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
}

class Alumno extends Persona{
    int matricula;

	public void setMatricula(int mat){
		matricula = mat;
	}

	public int getMatricula(){
		return matricula;
	}
    double promedio;

	public void setPromedio(double prom){
		promedio = prom;
	}

	public double getPromedio(){
		return promedio;
	}
}

class Profesor extends Persona{
    int numEmpl;

    public void setNumEmp(int nEmpl){
        numEmpl = nEmpl;
    }

    public int getNumEmp(){
        return numEmpl;
    }

    double sueldo;

    public void setSueldo(double sue){
        sueldo = sue;
    }

    public double getSueldo(){
        return sueldo;
    }
}

class CapturaEntrada{

    public static int capturarEntero(String i){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+i+"");
        return (sc.nextInt());
    }
}
