/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provedor;

/**
 *
 * @author madel
 */
public class Provedor_ {
    private int codigo; 
    private String nombre; 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo constructor de la clase provedor 
 * @param codigo Codigo del provedor
 * @param nombre Codigo del nombre 
 */
  
    public Provedor_(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

   
}
