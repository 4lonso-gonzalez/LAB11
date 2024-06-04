/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alons
 */
public class LAB11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Menu Arraylist");
            System.out.println("1. Definicion de un Arraylist");
            System.out.println("2. Diferencias entre un Arraylist y un Arreglo");
            System.out.println("3. Metodos de la clase Arraylist");
            System.out.println("4. Submenu con implementaciones");
            System.out.println("5. Cerrar Menu");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Definicion: ");
                    System.out.println("La clase Arraylist en Java, es una clase que permite "
                            + "almacenar datos en memoria de forma similar a los Arrays, con ");
                    System.out.println("la ventaja de que el numero de elementos que almacena, lo hace "
                            + "de forma dinamica, es decir, que no es necesario declarar su "
                            + "tamaño como pasa con los Arrays (Ricardo Moya, Jarroba, 2013)");
                    break;
                case 2:
                    System.out.println("Diferencias: ");
                    System.out.println("- La matriz o vector posee un tamaño estatico, mientras "
                            + "que el arraylist tiene un tamaño dinamico.");
                    System.out.println("- Para inicializar directa o indirectamente un array se "
                            + "necesita proporcionar el tamaño de este, mientras que para un "
                            + "arraylist se puede crear la instancia sin especificar el tamaño.");
                    System.out.println("- Los array funcionan mas rapido en comparacion con los "
                            + "arraylist debido a la operacion de cambio de tamaño en estos que "
                            + "relentiza el rendimiento.");
                    System.out.println("- Un array proporciona una variable de longitud que indica "
                            + "la longitud del vector, mientras que arraylist proporciona el metodo "
                            + "size() para determinar el tamaño de este.");
                    System.out.println("- Los array pueden ser multidimensionales, en cambio, los "
                            + "arraylisty solo pueden ser unidimensionales.");
                    System.out.println("- En un array es posible almacenar tanto objetos como tipos "
                            + "premitivos, mientras que en un arraylist no se pueden almacenar tipos "
                            + "primitivos ya que los convierte automaticamente en objetos.");
                    break;
                case 3:
                    System.out.println("Metodos de la clase: ");
                    System.out.println("- void add(int index, E, element): Este metodo permite "
                            + "añadir un elemento en una posicion especifica.");
                    System.out.println("- boolean is Empty(): Este metodo devuelve TRUE si el "
                            + "arraylist se encuentra vacio.");
                    System.out.println("- E get(int index): Este metodo obtiene el elemento de "
                            + "la posicion pasada por el parametro.");
                    System.out.println("- int size(): Este metodo devuelve el tamaño de la lista.");
                    break;
                case 4:
                    System.out.println("Conclusiones: ");
                    System.out.println("Un arraylist es una estructura de datos versatil y eficiente "
                            + "que se puede utilizar en aplicaciones que requieren flexibilidad y ");
                    System.out.println("dinamismo en la gestion de los datos, siempre y cuando se tengan en cuenta "
                            + "sus limitaciones y se utilice de manera efectiva.");

                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(1);
                    arrayList.add(9);
                    arrayList.add(3);
                    arrayList.add(11);
                    arrayList.add(6);

                    int subopcion;
                    do {
                        System.out.println("Array inicial: {1, 9, 3, 11, 6}");
                        System.out.println("1. Agregar un elemento");
                        System.out.println("2. Eliminar un elemento");
                        System.out.println("3. Buscar un elemento");
                        System.out.println("4. Mostrar el array");
                        System.out.println("5. Volver al Menu principal");
                        subopcion = leer.nextInt();

                        switch (subopcion) {
                            case 1:
                                System.out.println("Ingrese el elemento a agregar:");
                                int AgregarElemento = leer.nextInt();
                                arrayList.add(AgregarElemento);
                                System.out.println("El elemento ha sido agregado");
                                break;
                            case 2:
                                System.out.println("Ingrese el elemento a eliminar:");
                                int EliminarElemento = leer.nextInt();
                                if (arrayList.remove(Integer.valueOf(EliminarElemento))) {
                                    System.out.println("Elemento eliminado");
                                } else {
                                    System.out.println("Elemento no encontrado");
                                }
                                break;
                            case 3:
                                System.out.println("Ingrese el elemento a buscar:");
                                int BuscarElemento = leer.nextInt();
                                if (arrayList.contains(BuscarElemento)) {
                                    System.out.println("Elemento encontrado en la posicion: " + arrayList.indexOf(BuscarElemento));
                                } else {
                                    System.out.println("Elemento no encontrado");
                                }
                                break;
                            case 4:
                                System.out.println("El Arraylist quedo asi: " + arrayList);
                                break;
                            case 5:
                                System.out.println("Volviendo al Menu...");
                                break;
                        }
                    } while (subopcion != 5);
                    break;
                case 5:
                    System.out.println("Información obtenida en: "
                            + "Definicion: https://jarroba.com/arraylist-en-java-ejemplos/ "
                            + "Diferencias: https://www.javatpoint.com/difference-between-array-and-arraylist "
                            + "Metodos: https://refactorizando.com/uso-arraylist-en-java");
                    System.out.println("Cerrando Menu...");
                default:
                    System.out.println("Opcion invalida, intente de nuevo");
            }
        } while (opcion != 5);
    }

}

