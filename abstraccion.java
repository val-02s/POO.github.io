import java.util.Scanner;

public class abstraccion{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
        Alumno al1 = new Alumno();
        Empleo emp1 = new Empleo();
        Casa cs1 = new Casa();
        Persona ps1 = new Persona();

        ps1.setNombre("valentina");
        ps1.setCorreo("valentina.segura@uabc.edu.mx");
        ps1.setTelefono("6648137183");
        cs1.setRol("hija");
        cs1.setEcoActivo("si");
        al1.setMatricula(123435);
        al1.setPromedio(80.5);
        emp1.setNumEmp(15500);
        emp1.setSueldo(5000);
        
        
        System.out.println("Nombre: " + ps1.getNombre());
        System.out.println("Correo: " + ps1.getCorreo());
        System.out.println("Telefono: " + ps1.getTelefono());
        System.out.println("Rol: " + cs1.getRol());
        System.out.println("Economicamente Activo: " + cs1.getEcoActivo());
        System.out.println("Matricula: " + al1.getMatricula());
        System.out.println("Promedio: " + al1.getPromedio());
        System.out.println("Numero de empleado: " + emp1.getNumEmp());
        System.out.println("Sueldo: " + emp1.getSueldo());
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

class Casa extends Persona{
    String rolP;

	public void setRol(String rol){
		rolP = rol;
	}

	public String getRol(){
		return rolP;
	}
    String ecActivo;

	public void setEcoActivo(String eAc){
		ecActivo = eAc;
	}

	public String getEcoActivo(){
		return ecActivo;
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

class Empleo extends Persona{
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
