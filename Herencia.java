import java.util.Scanner;

public class Herencia{
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

        Profesor profe[] = new Profesor[2];

        profe[0] = new Profesor();
		profe[0].setNombre("Pepe Chuy");
		profe[0].setNumEmp(123456);
		profe[0].setCorreo("Pepe.Chuy@uabc.edu.mx");
		profe[0].setTelefono("6634856789");
		profe[0].setSueldo(5000);

        profe[1] = new Profesor();
		System.out.println("Captura el nombre del Profesor: ");
		profe[1].setNombre(scan.nextLine());
		System.out.println("Captura el numero de empleado del profesor: ");
		profe[1].setNumEmp(Integer.parseInt(scan.nextLine()));
		System.out.println("Captura el correo del profesor: ");
		profe[1].setCorreo(scan.nextLine());
		System.out.println("Captura el telefono del profesor: ");
		profe[1].setTelefono(scan.nextLine());
		System.out.println("Captura el sueldo del profesor: ");
		profe[1].setSueldo(Double.parseDouble(scan.nextLine()));

		System.out.println("Datos Alumnos:");
		for(int i = 0; i<alus.length; i++){
			if (alus[i].getNombre() != null) System.out.println(alus[i].getNombre()+"\t"+alus[i].getMatricula()+"\t"+alus[i].getCorreo()+"\t"+alus[i].getTelefono()+"\t"+alus[i].getPromedio());
		}

        System.out.println("Datos Profesores:");
		for(int i = 0; i<profe.length; i++){
			if (profe[i].getNombre() != null) System.out.println(profe[i].getNombre()+"\t"+profe[i].getNumEmp()+"\t"+profe[i].getCorreo()+"\t"+profe[i].getTelefono()+"\t"+profe[i].getSueldo());
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


