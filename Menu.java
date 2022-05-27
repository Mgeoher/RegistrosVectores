import java.util.Scanner;
public class Menu extends Datos {
    Scanner sc = new Scanner(System.in);

    public boolean salir = false;
    public void menu1()  {
        do {
            System.out.println("***********************************************************************************************************");
            System.out.println("Escribe una opcion " + "1 Ingresa Datos " + "2 Historial de Datos en vectores " + "3 Historial de datos en lista " + "4 salir");
            System.out.println("***********************************************************************************************************");
            int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                this.datos1();
                break;
            case 2:
                this.mostrarDatos();
                break;
            case 3:
                ejemploLista.size();
                ejemploLista.get(0);
                for (int i = 0; i <= ejemploLista.size() - 1; i++) {
                    System.out.println(ejemploLista.get(i));
                }
                break;

            case 4:
                System.out.println("Vuelva pronto");
                salir = true;
                break;
            default:
                System.out.println("Solo números entre 1 y 4");
        }
        } while (!salir);
    }


    }


