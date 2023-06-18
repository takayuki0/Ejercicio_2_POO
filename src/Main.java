public class Main {
    public static void main(String[] args) {

        //En este ejercicio simplemente creo una clase Libro y a continuacion comienzo a crear objetos de la clase
        //Creo los objetos del tipo de mi clase libro y a continuación comienzo a pasarle los argumentos.
        Libro libroUno = new Libro("Sun Tzu", "El Arte de la Guerra", 25);
        Libro libroDos = new Libro("Robert Kiyosaki", "Padre Rico Padre Pobre", 30);
        Libro libroTres = new Libro("Robin S. Sharma", "El Club de las 5 de la Mañana", 40);

        //En esta parte lo mismo he creado mi clase Pelicula y aquí simplemento creo mis objetos del tipo de mi clase Pelicula
        Pelicula peliculaUno = new Pelicula("Titanic", "Kate Winslet", "James Cameron", 45);
        Pelicula peliculaDos = new Pelicula("The Lord of the Ring", "Elijah Wood", "Peter Jackson", 60);
        Pelicula peliculaTres = new Pelicula("Forrest Gump", "Tom Hanks", "Robert Zemeckis", 65);


        //Solo resta imprimir cada uno de mis objetos con el método toString()
        //Vale destacar que no hace falta colocar el .toString() ya que eso es redundante
        //Vasta solo con colocar el nombre de nuestro objeto que vamos a imprimir.
        System.out.println(libroUno);
        System.out.println(libroDos);
        System.out.println(libroTres);

        System.out.println(peliculaUno);
        System.out.println(peliculaDos);
        System.out.println(peliculaTres);
    }
}