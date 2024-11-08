/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal que demuestra la manipulación de archivos
 * @author Janet García 
 */
public class POOP11 {

    /**
     * Método principal de la clase. Creación de archivos 
     * @param args Argumentos de la línea de comandos 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            /**
             * Creación del archivo y verificación de su existencia 
             */
            File archivo  = new File("archivo.txt");
            System.out.println(archivo.exists());
        try {
            boolean seCrea = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            
        System.out.println("########### fileWritter ###########");
        
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo");
            String texto = br.readLine();
            System.out.println(texto);
            
   
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.print(texto);
            salida.print("Esta es la segunda lìnea");
            
            for (int i = 0; i < 10; i++) {
                salida.println("Linea" + i);   
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("Cargando archivo" + i*10 + "%");
                
            }
            salida.close();
            
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("###### FileReader #######");
        try{
            FileReader fr = new FileReader("archivo.txt"); 
            BufferedReader br = new BufferedReader(fr); 
            System.out.println("El texto del archivo es: ");
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            fr.close();
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
            }
        System.out.println("###### StringTokenizer #######");
        String alumnoParseado = "Janet, Gracia, Ortiz, 321100742, 19, 3";
        System.out.println(alumnoParseado);
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        while(tokenizador.hasMoreTokens()){
            System.out.println(tokenizador.nextToken());
        }
        /**
         * Creación de instancias de alumnos(objetos)
         */
        Alumno alumno0 = new Alumno("Janet", "Garcia", "Ortiz", 19, 321100742, 3); 
        System.out.println(alumno0);
        
        Alumno alumno1 = new Alumno("Halley", "Mendoza", "Santos",19, 321100743, 3);
        System.out.println(alumno1);
        Alumno alumno2 = new Alumno("Aye", "Sanchez", "Mendoza", 19, 321100744, 3); 
        System.out.println(alumno2);
        Alumno alumno3 = new Alumno("Carlos", "Ojeda", "Ruiz", 19, 321100745, 3); 
        System.out.println(alumno3);
        Alumno alumno4 = new Alumno("Samuel", "Paz", "Garcia", 19, 321100746, 3);
        System.out.println(alumno3);
        
        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(alumno0); 
        lista.add(alumno1); 
        lista.add(alumno2); 
        lista.add(alumno3); 
        lista.add(alumno4); 
        
        for(Alumno alumno : lista ){
            System.out.println(alumno);
        }
        System.out.println("Escribiendo archivo de texto");
        try{
            FileWriter fw = new FileWriter("alumnos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            for (Alumno alumno : lista){
                salida.println(alumno);
            }
            salida.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            
        }
        System.out.println("Escribiendo archivo de csv");
        try{
            FileWriter fw = new FileWriter("alumnos.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            for (Alumno alumno : lista){
                salida.println(alumno);
            }
            salida.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            
        }
        //NUEVA LISTA 2
        // Mostrar los elementos de lista2
         ArrayList<Alumno> lista2 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer tokenizadorArchivo = new StringTokenizer(linea, ",");
                String nombre = tokenizadorArchivo.nextToken().trim();
                String apPat = tokenizadorArchivo.nextToken().trim();
                String apMat = tokenizadorArchivo.nextToken().trim();
                int edad = Integer.parseInt(tokenizadorArchivo.nextToken().trim());
                int numCuenta = Integer.parseInt(tokenizadorArchivo.nextToken().trim());
                int semestre = Integer.parseInt(tokenizadorArchivo.nextToken().trim());

                Alumno alumno = new Alumno(nombre, apMat, apPat, edad, numCuenta, semestre);
                lista2.add(alumno);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Mostrar los elementos de lista2
        System.out.println("##### LISTA2 #####");
        System.out.println("Alumnos generados desde el archivo:");
        for (Alumno alumno : lista2) {
            System.out.println(alumno);
        }
            
            
        }
        }
        
        
    