import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {

    public static void main(String[] args) throws Exception {

        pedirCoches();
        imprimeCoches();
        

        /*
         * Esta tarea consiste en realizar las siguientes tareas:
         * 
         * Hay que definir una clase Coche (Coche.java) con las siguientes
         * características:
         * 
         * -Como atributos privados tendrá al menos "marca", "modelo", "año" y
         * "matricula". Seleccionando el tipo de dato adecuado para cada uno.
         * Tendrá una variable de clase pública llamada "contador_de_coches" que en el
         * constructor se incrementará en 1 con cada instancia creada.
         * Dispondrá de un constructor por defecto y un constructor que tome como
         * parametros solo "marca", "modelo", "año" y "matricula".
         * Además debe tener métodos Getter y Setter para cada atributo privado.
         * 
         * -El proyecto tendra una clase denominada "Concesionario.java" que tendrá la
         * función Main. Dentro de esta función tendrá que realizar lo siguiente:
         * 
         * -El programa pedirá por pantalla el número de Coches que queremos recibir y
         * lo introduciremos por teclado.
         * Por cada uno de estos Coches recibiremos un mensaje que pida la marca, luego
         * el modelo y después el año y por último la matrícula, los leeremos de teclado
         * y los guardaremos en un ArrayList de Coches.
         * Una vez introducidos todos los coches, imprimir por pantalla la variable de
         * clase "contador_de_coches" y los coches que hay en el concesionario con su
         * correspondiente: "marca", "modelo", "año" y "matricula".
         * Realizar un informe que debe explicar el proceso seguido para realizar el
         * programa, además de documentar una prueba de ejecución del programa y hacer
         * capturas de pantallas de dicha prueba.
         * 
         * -Para esta ejecución debe introducir al menos 4 Coches teniendo uno de ellos
         * como "matrícula" el DNI del autor de la tarea.
         * En este informe debe aparecer capturas de la ejecución de la aplicación de
         * modo que se pueda observar perfectamente que se están imprimiendo los valores
         * de las variables en los momentos en que se indican en el enunciado.
         * ¿Qué debes tener en cuenta para resolver la tarea?
         * CONSEJOS Y RECOMENDACIONES PARA REALIZAR LA TAREA.
         * 
         * Para realizar esta tarea es aconsejable seguir los siguientes pasos:
         * 
         * 1.Crear un proyecto Java llamado Concesionario en NetBeans o Eclipse (se
         * pueden usar otros IDEs similares). Con una clase llamada Concesionario.java
         * que contenga la funcion main.
         * 
         * 2.Crear una clase en el proyecto llamada Coches.java con los atributos
         * privados y la variable de clase que se piden en el enunciado. No olvidar
         * añadir los setter y getter de los atributos privados. Además de crear los dos
         * constructores e inicializar cada uno de las atributos y variables de clase
         * como se pide.
         * 
         * 3.En la función main de la clase Concesionario.java comenzaremos imprimiendo
         * un mensaje por pantalla usando el método System.out.println() para pedir el
         * número de coches que tendrá el concesionario. Podemos capturar los valores
         * usando la clase java.util.Scanner.
         * 
         * 4.Después crearemos un bucle que itere hasta el número que se haya
         * introducido anteriormente y en cada iteración imprima un mensaje pidiendo
         * cada dato y lo capture. Guardaremos estos datos en un objeto Coche que, una
         * vez esté completo, añadiremos a un ArrayList<Coches> creado anteriormente.
         * 
         * 5.Una vez hayamos acabado de introducir los datos debemos imprimir la
         * variable de clase para comprobar que se ha incrementado correctamente y hacer
         * otro bucle que recorra el ArrayList y que imprima por pantalla la información
         * de cada objeto
         */

    }

    private static ArrayList<Coches> coches = new ArrayList<>();
    

    public static void añadeCoche(Coches coche) {

        coches.add(coche);
    }

    public static void imprimeCoches() {
        for (Coches elemento : coches) {
            System.out.println(elemento.imprimeDatos(elemento));
        }//TODO esto no tiene sentido no? 
    }

   

    private static void pedirCoches() {

        System.out.println("Introduzca la cantidad de coches que desea añadir");
        Scanner scanner = new Scanner(System.in);
        Integer cantidadCoches = scanner.nextInt();

        for (int i = 0; i < cantidadCoches; i++) {
            System.out.println("Introduzca la marca del coche: \n");
            String marca = scanner.next();
            System.out.println("Introduzca el modelo del coche: \n");
            String modelo = scanner.next();
            System.out.println("Introduzca el año de fabricación del coche: \n");
            Integer ano = scanner.nextInt();
            System.out.println("Introduzca la matrícula del coche: \n");
            String matricula = scanner.next();
            Coches coche = new Coches(marca, modelo, ano, matricula);
            añadeCoche(coche);
            System.out.println(coches.size());
            
            

        }
        scanner.close();

    }
    
}
