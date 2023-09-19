package animales;

public abstract class Animal implements Movible{

    // Atributos de un animal
    String nombre;
    String color;
    double peso;
    double tamaño;

    //Constructores

    public Animal(){

    }
    public Animal(String nombre, String color, double peso, double tamaño) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    //Metedos Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }


    //Comportamientos


    //comer
    public abstract void comer();

    //moverse

   public String moverse() {
       return "El animal puede moverse";
    }

    //dormir
}
