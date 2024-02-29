
package modelo;

import java.io.Serializable;


public class Atleta implements Serializable{
    
    //Atributos
    
    private String nombre;
    private int edad;
    private double peso;
    private int estatura;

    //Constructor

    public Atleta(String nombre, int edad, double peso, int estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    //Metodos get

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public int getEstatura() {
        return estatura;
    }
    
    

    


}
