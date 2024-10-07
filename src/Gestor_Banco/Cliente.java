/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor_Banco;

/**
 *
 * @author Camilo Gallego B
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private String nombreRepresentante;
    private String apellidoRepresentante;
    private int edadRepresentante;
    private String documentoRepresentante;
    
    
    public Cliente(String nombre, String apellido, int edad, String documento,
                   String nombreRepresentante, String apellidoRepresentante,
                   String documentoRepresentante, int edadRepresentante){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.nombreRepresentante = nombreRepresentante;
        this.apellidoRepresentante = apellidoRepresentante;
        this.documentoRepresentante = documentoRepresentante;
        this.edadRepresentante = edadRepresentante;
    }
    public Cliente(String nombre, String apellido, int edad, String documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public void setapellido(String apellido){
        this.apellido = apellido;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad = edad;
    }
    public String getdocumento(){
        return documento;
    }
    public void setdocumento(String documento){
        this.documento = documento;
    }
    public String getNombreRepresentante() {
        return nombreRepresentante;
    }
    
    public void setNombreRepresentante(String nombreRepresentante) {
        this.nombreRepresentante = nombreRepresentante;
    }
    
    public String getApellidoRepresentante() {
        return apellidoRepresentante;
    }
    
    public void setApellidoRepresentante(String apellidoRepresentante) {
        this.apellidoRepresentante = apellidoRepresentante;
    }
    
    public String getDocumentoRepresentante() {
        return documentoRepresentante;
    }
    
    public void setDocumentoRepresentante(String documentoRepresentante) {
        this.documentoRepresentante = documentoRepresentante;
    }
    
    public int getEdadRepresentante() {
        return edadRepresentante;
    }
    
    public void setEdadRepresentante(int edadRepresentante) {
        this.edadRepresentante = edadRepresentante;
    }
}
