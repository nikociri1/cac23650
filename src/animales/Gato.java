package animales;

public class Gato extends Animal{

    Boolean tieneGarras;

    public Gato (String nombre, String color, double peso, double tamaño,Boolean tieneGarras){
        super (nombre,color,peso,tamaño);
        this.tieneGarras= tieneGarras;

}

//Sobrescribibmos el metodo moverse

@Override
public String moverse(){
    return "El gato corre";
    }
}


