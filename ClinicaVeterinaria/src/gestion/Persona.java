package gestion;

import java.io.Serializable;
/**
 * Aqui esta la clase persona donde se guardan todos los datos de la misma
 * @author jpinyerob
 *@version 1.0 2021/02/02
 */
public class Persona implements Serializable{
	//Aqui estan los atributos de la clase
	private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    /**
     * Aqui esta el constructor de la clase
     * @param nombre
     * @param apellidos
     * @param dni
     * @param edad
     */
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
/**
 * getter de nombre
 * @return
 */
    public String getNombre() {
        return nombre;
    }
/**
 * setter de nombre
 * @param nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * getter de Apellidos
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * setter de Apellidos
     * @param nombre
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    /**
     * getter de DNI
     * @return
     */
    public String getDni() {
        return dni;
    }
    /**
     * setter de DNI
     * @param nombre
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
    /**
     * getter de Edad
     * @return
     */
    public int getEdad() {
        return edad;
    }
    /**
     * setter de edad
     * @param nombre
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * te devuelve el año de nacimiento de alguien
 * @param anyoactual
 * @return
 */
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    /**
     * metodo toString de la clase
     */
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}