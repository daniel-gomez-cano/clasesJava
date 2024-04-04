public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Gato gatico1 = new Gato("rojo",(byte)7,"Egipcio",12,false);
        Gato gatico2 = new Gato("rojo",(byte)7,"Egipcio",12,false);
        Gato gatico3 = new Gato("rojo",(byte)7,"Egipcio",12,false);
        System.out.println(Gato.numeroGatos);
        Gato.maullan(); //Me dice como maullan los gatos sin crear ningún objeto gato
        String nombre = "Daniel";
    }
}

/* Al heredar clases, las clases padres van a ser todas abstractas. Clase Abstract es una clase pensada para la herencia,
donde puedo definir implementaciones y contratos. */
/* En java solo existe la herencia simple, una clase solo puede tener una sola clase padre, esto se soluciona con interface*/
/*Enum son para tener un grupo limitado de Strings */
/*Una clase abstracta es una clase que me permite usarla para harencia, heredar métodos ya implementados y métodos abstractos */
/*En interface todo es abstracto, mientras que en abstract class hay cosas abstractas y no abstractas*/
/*Una interface no es una clase, no tiene atributos, solo tiene métodos abstractos, interface no se heredan, se implementan*/

/*Una clase hereda otra clase, una clase implementa una interfaz */

/*Hemos logrado que Gato herede todos lo métodos de Feline y que implemente los métodos abstractos de Felino
 * Hereda lo propio de felino, implementa lo abstracto de felino e implementa todo lo que hace la Mascota
 * Cada clase tendrá su forma de hacer cada método, por eso es útil el abstract
 */
/*Cuando no vaya a utilizar una variable, la hago null, para que el garbageCollector la borre */

/*Cuando a una variable le pongo static, quiere decir que ese valor va a ser compartido por todos los gatos 
(objetos de la clase) */

/*Práticas comunes:
* Definir una interfaz de constantes, donde allí se definirán todas las constantes (configuración del protecto)
*
*/