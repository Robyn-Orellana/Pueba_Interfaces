/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author robyn
 */
public class ClsPersona implements IPersona{
    public static List<ClsPersona> lis = new ArrayList();
    public static ClsPersona per = new ClsPersona(); 
    public String nombre;

    @Override
    public String getNombre() {
        return nombre; 
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void llenar_informacion() {
        ClsPersona p = new ClsPersona();
        Scanner t = new Scanner(System.in);
        String archivo;
        
        System.out.println("Ingresa el nombre que desear anexar a la lista: ");
        archivo=t.nextLine();
        
        p.Cargar_información(archivo);
        System.out.println("Informacion cargada en la lista: ");
        
        for(ClsPersona v : lis){
            
            System.out.println(v.getNombre());
            
            }
        System.out.println("\n");
        
        for(ClsPersona v : lis){
            
            archivo= v.getNombre();
            p.guardar_información(archivo);
            System.out.println("Los datos guardados en el archivo: " + v.getNombre());
            }
        
    }

    @Override
    public void Cargar_información(String archivo) {
        File archivos = new File("prueba.txt");
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivos));
            String lectura;
            lectura = entrada.readLine();
            int NoLinea = 1;
            
            per.setNombre(archivo);
            lis.add(per);
            per= new ClsPersona();
            
            while (lectura!= null){                

                per.setNombre(lectura);
                lis.add(per);
                lectura=entrada.readLine();
                per = new ClsPersona();
                
                NoLinea++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException ex){
            System.out.println("Hay otro tipo de problema");
        } 
       
    }

    @Override
    public void guardar_información(String archivo) {
        File archivos = new File("prueba2.txt");
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivos,true));
            String contenido = archivo;
            salida.println(contenido);
            salida.close();
            
        } catch (IOException e) {
            System.out.println("Hubo un error al abrir o grabar el archivo");
        }
        
    }
         
}
