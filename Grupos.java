import java.util.Scanner;

public class Grupos {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		grupo gp1=new grupo();
		System.out.print("Capture id de grupo:");
		gp1.setId(scan.nextLine());
		System.out.print("Captura el nombre del Profesor:");
		gp1.profesor.setNombre(scan.nextLine());
		System.out.print("Capture nombre de la materia:");
		gp1.mat.setNombre(scan.nextLine());
        System.out.println("Captura el numero de empleado del profesor: ");
        gp1.profesor.setNumEmp(Integer.parseInt(scan.nextLine()));
        System.out.println("Captura el sueldo del profesor: ");
        gp1.profesor.setSueldo(scan.nextLine());

		gp1.alus = new Alumno[CapturaEntrada.capturarEntero("Introduzca el numero de alumnos:")];
        for (int i = 0; i<gp1.alus.length; i++){
			gp1.alus[i] = new Alumno();
			System.out.printf("Datos del Alumno %s\n", i+1, ":");
			gp1.alus[i] = new Alumno();
			System.out.println("Captura el nombre del alumno: ");
			gp1.alus[i].setNombre(scan.nextLine());
			System.out.println("Captura la matricula del alumno: ");
			gp1.alus[i].setMatricula(Integer.parseInt(scan.nextLine()));
			System.out.println("Captura el promedio del alumno: ");
			gp1.alus[i].setPromedio(Double.parseDouble(scan.nextLine()));
		}
		System.out.printf("Total Alumnos %s:\n", gp1.alus.length);
		for(int j = 0; j<gp1.alus.length; j++){
			System.out.printf("Datos Alumno %s:\n", j+1);
			if (gp1.alus[j].getNombre() != null) System.out.println(gp1.alus[j].getNombre()+"\t"+gp1.alus[j].getMatricula()+"\t"+gp1.alus[j].getPromedio());
		}

		System.out.printf("Datos del grupo:\n");
		System.out.println(gp1.getId()+"\t"+gp1.profesor.getNombre()+"\t"+gp1.mat.getNombre()+"\t"+gp1.profesor.getNumEmp()+"\t"+gp1.profesor.getSueldo());

	}
}

class grupo{
	Materia mat=new Materia();
	Profesor profesor=new Profesor();
	Alumno alus[]= null;

	String idgrupo;

	public void setId(String id){
        idgrupo=id;
    }

	public String getId(){
        return idgrupo;
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

    String sueldo;

    public void setSueldo(String sue){
        sueldo = sue;
    }

    public String getSueldo(){
        return sueldo;
    }
}

class Materia {
	String clave;
	
	public void setClave(String c){
        clave=c;
    }

	public String getClave(){
        return clave;
    }

	String nombre;

	public void setNombre(String nom){
        nombre=nom;
    }
	public String getNombre(){
        return nombre;
    }
}

class CapturaEntrada{

    public static int capturarEntero(String i){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+i+"");
        return (sc.nextInt());
    }
}

