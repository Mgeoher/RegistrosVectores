import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Datos {
    
    Scanner sc = new Scanner(System.in);

    String[] vector;
    protected int indiceVector;

    public Datos() {
        this.vector = new String[5];
        this.indiceVector = 0;
    }


    List<String> ejemploLista = new ArrayList<String>();

    public String datos1() {
        System.out.println("ingresa el codigo de identificacion estudiantil");
        String codigo = sc.nextLine();
        System.out.println("ingresa un nombre");
        String nombre = sc.nextLine();
        System.out.println("ingresa un aleas");
        String aleas = sc.nextLine();
        System.out.println("ingresa el correo electronico");
        String correo = sc.nextLine();
        System.out.println("ingresa numero de telefono");
        String telefono = sc.nextLine();
        System.out.println("ingresa el codigo de identificacion de el curso");
        String codigoCurso = sc.nextLine();
        System.out.println("ingresa el nombre del curso");
        String nombreCurso= sc.nextLine();
        System.out.println("ingresa el codigo del Grado");
        String codigoGrado= sc.nextLine();
        System.out.println("ingrese una descripcion");
        String descripcion= sc.nextLine();
        this.registrarDatos(codigo, nombre, aleas, correo, telefono,codigoCurso,nombreCurso, codigoGrado,descripcion);

        ejemploLista.add("Codigo estudiantil: "+codigo);
        ejemploLista.add("Nombre: " + nombre);
        ejemploLista.add("Aleas: " +  aleas);
        ejemploLista.add("Correo: " + correo);
        ejemploLista.add("Numero de Telefono: " + telefono);
        ejemploLista.add("Codigo de Curso: " + codigoCurso);
        ejemploLista.add("Nombre del Curso" + nombreCurso);
        ejemploLista.add("Codigo de Grado: " + codigoGrado);
        ejemploLista.add("Descricion: " + descripcion);

        return nombre;

    }

    public void registrarDatos(String codigo ,String nombre, String aleas, String correo, String telefono,
                               String codigoCurso, String nombreCurso,
                               String codigoGrado, String descripcion) {
        this.vector[indiceVector] = "Codigo estudiantil: "+codigo + " --> "+ "Nombre: " + nombre + " --> " + "Aleas: " +  aleas+ " --> " + "Correo: " + correo + " --> "+ "Numero de Telefono: " + telefono + " --> " +
                "Codigo de Curso: " + codigoCurso + " --> " + "Nombre del Curso" + nombreCurso +
        " "+ "Codigo de Grado: " + codigoGrado + " --> " + "Descricion: " + descripcion;
        this.indiceVector = this.indiceVector + 1;

    }
    public void mostrarDatos() {

        for(int i=0; i<this.vector.length; i++){
            if(this.vector[i]!=null){
                System.out.println(vector[i]);
            }
        }


    }


}


