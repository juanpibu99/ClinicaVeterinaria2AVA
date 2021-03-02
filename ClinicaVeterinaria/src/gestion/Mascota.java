package gestion;

import java.io.Serializable;
/**
 * Aqui tenemos una clase mascota la cual es un objeto que realiza la funcion de una mascota que 
 * tiene un dueño.
 * 
 * @author jpinyerob
 *@version 1.0 2021/02/02
 */

public class Mascota extends Animal {
	//Aqui estan los atributos de la clase
	private String nombre;
    private Persona duenyo;
    /**
     * Aqui esta el metodo constructor
     * @param ID
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     */
    public Mascota(long ID, String nombre, int edad, String raza, Persona duenyo) {
    	this.setID(ID);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }
    /**
     * Aqui esta el getter del atributo nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Aqui esta el setter del atributo nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Aqui esta el dueño de una mascota
     * @return
     */
    public Persona getDuenyo() {
        return duenyo;
    }
    /**
     * Aqui esta el setter del dueño de una mascota
     * @param Persona
     */
    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }
/**
 * Aqui esta el toString de la clase
 */
    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Due�o: " + duenyo.toString());
    }
}