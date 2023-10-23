import java.util.Scanner;

public class CargaDeMaterias {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		grupo gp[]=new grupo[CapturaEntrada.capturarEntero("Introduzca el numero de Grupos:")];
        for (int g = 0; g<gp.length; g++){
            System.out.print("Capture id de grupo:");
            gp[g].setId(scan.nextLine());
            System.out.print("Captura el nombre del Profesor:");
            gp[g].profesor.setNombre(scan.nextLine());
            System.out.print("Capture nombre de la materia:");
            gp[g].mat.setNombre(scan.nextLine());
            System.out.println("Captura el numero de empleado del profesor: ");
            gp[g].profesor.setNumEmp(Integer.parseInt(scan.nextLine()));
            System.out.println("Captura el sueldo del profesor: ");
            gp[g].profesor.setSueldo(scan.nextLine());

            gp[g].alus = new Alumno[CapturaEntrada.capturarEntero("Introduzca el numero de alumnos:")];
            for (int i = 0; i<gp[g].alus.length; i++){
                gp[g].alus[i] = new Alumno();
                System.out.printf("Datos del Alumno %s\n", i+1, ":");
                gp[g].alus[i] = new Alumno();
                System.out.println("Captura el nombre del alumno: ");
                gp[g].alus[i].setNombre(scan.nextLine());
                System.out.println("Captura la matricula del alumno: ");
                gp[g].alus[i].setMatricula(Integer.parseInt(scan.nextLine()));
                System.out.println("Captura el promedio del alumno: ");
                gp[g].alus[i].setPromedio(Double.parseDouble(scan.nextLine()));
            }
            System.out.printf("Total Alumnos %s:\n", gp[g].alus.length);
            for(int j = 0; j<gp[g].alus.length; j++){
                System.out.printf("Datos Alumno %s:\n", j+1);
                if (gp[g].alus[j].getNombre() != null) System.out.println(gp[g].alus[j].getNombre()+"\t"+gp[g].alus[j].getMatricula()+"\t"+gp[g].alus[j].getPromedio());
            }

            System.out.printf("Datos del grupo:\n");
            System.out.println(gp[g].getId()+"\t"+gp[g].profesor.getNombre()+"\t"+gp[g].mat.getNombre()+"\t"+gp[g].profesor.getNumEmp()+"\t"+gp[g].profesor.getSueldo());
        }
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