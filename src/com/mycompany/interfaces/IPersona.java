/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author robyn
 */
public interface IPersona {
    
    public String getNombre();
    public void setNombre(String nombre); 
    public void llenar_informacion();
    public void Cargar_información(String archivo);
    public void guardar_información(String archivo);
       
}
