import animales.Delfin;
import animales.Gato;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* String nombre= "Nicolas";
        int edadDeNicolas= 28;
        final double ALTURA_NICOLAS = 1.81;

        String dias []= new String [7];
        dias[0]= "Domingo";
        dias[1]= "Lunes";
        dias[2]= "Martes";
        dias[3]= "Miercoles";
        dias[4]= "Jueves";
        dias[5]= "Viernes";
        dias[6]= "Sabado";


        //Mostar unicamente los dias con indice impar con for
       for (int i = 0; i < dias.length; i++){
           if ( i %2 != 0) System.out.println(dias[i]);
       }

        //Mostar unicamente los dias con indice impar con while
        int i = 0;
        while(i < dias.length){
           if ( i %2 != 0) System.out.println(dias[i]);
           i++;
        }

        //System.out.println("La persona se llama "+ nombre + ", tiene " + edadDeNicolas +
        //  " de edad y mide " + ALTURA_NICOLAS + " mts");


       */

        System.out.println("Hola a todos");


        //CREACION DE ANIMALES

        Gato gatito= new Gato("Cleo","amarillo",2.0,0.75,true);
        Delfin delfi= new Delfin();

        System.out.println("Mi gato se llama : "+ gatito.getNombre());

        System.out.println(gatito.moverse());
        System.out.println(delfi.moverse());


    }
}