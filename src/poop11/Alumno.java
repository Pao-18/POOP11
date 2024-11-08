/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 * Clase que representa un Alumno, junto con sus datos personales y académicos 
 * @author Janet Gracía
 */
public class Alumno {
    String nombre; 
    String apMat; 
    String apPat; 
    int edad; 
    int numCuenta; 
    int semestre; 
    /**
     * Constructor lleno que inicializa Alumno
     * 
     * @param nombre Nombre del alumno.
     * @param apMat Apellido materno del alumno.
     * @param apPat Apellido paterno del alumno.
     * @param edad Edad del alumno.
     * @param numCuenta Número de cuenta del alumno.
     * @param semestre Semestre en el que está inscrito el alumno.
     */
    public Alumno(String nombre, String apMat, String apPat, int edad, int numCuenta, int semestre) {
        this.nombre = nombre;
        this.apMat = apMat;
        this.apPat = apPat;
        this.edad = edad;
        this.numCuenta = numCuenta;
        this.semestre = semestre;
    }

    /**
    * Método que obtiene el apellido materno del alumno.
    * @return El apellido materno del alumno
    */
    public String getApMat() {
        return apMat;
    }
    /**
    * Método que establece el apellido materno del alumno.
    * @param apMat El apellido materno del alumno.
    */
    public void setApMat(String apMat) {
        this.apMat = apMat;
    }
    /**
    * Método que obtiene el apellido paterno del alumno.
    * @return El apellido paterno del alumno
    */
    public String getApPat() {
        return apPat;
    }
    /**
    * Método que establece el apellido paterno del alumno.
    * @param apMat El apellido paterno del alumno.
    */
    public void setApPat(String apPat) {
        this.apPat = apPat;
    }
    /**
    * Método que obtiene el Nombre del alumno.
    * @return El Nombre del alumno
    */
    public String getNombre() {
        return nombre;
    }
    /**
    * Método que establece el Nombre del alumno.
    * @param apMat El Nombre del alumno.
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * Método que obtiene el NumCuenta del alumno.
    * @return El NumCuenta del alumno
    */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
    * Método que establece el NumCuenta del alumno.
    * @param apMat El NumCuenta del alumno.
    */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
    * Método que obtiene el Semestre del alumno.
    * @return El Semestre del alumno
    */
    public int getSemestre() {
        return semestre;
    }
    /**
    * Método que establece el Semestre del alumno.
    * @param apMat El Semestre del alumno.
    */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    /**
     * Método que simula la acción de estudiar.
     * 
     */
    public void estudiar(){
        
    }
    /**
     * Método que devuelve una cadena del objeto Alumno.
     * 
     * @return cadena con los datos del alumno separados por comas
     * 
     */
    @Override
    public String toString() {
        return nombre + "," + apPat + "," + apMat + "," + edad + "," + numCuenta + "," + semestre;
    }
    
    
}