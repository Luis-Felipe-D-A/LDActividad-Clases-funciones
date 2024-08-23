/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clientesjava;

/**
 *
 * @author Biblioteca
 */
public class ClientesJava {
    private String nombre;
    private String correo;
    private String apellido;
    private int cedula;
    private int telefono;
    private String fecha_nacimiento;
    private String direccion;

    public ClientesJava(String nombre, String apellido, String correo, int cedula, int telefono, int par2, String fecha_nacimiento) {
        this.nombre = nombre;
        this.correo = correo;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.fecha_nacimiento = fecha_nacimiento;
        this.direccion = direccion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
/**
 * @return la fecha_nacimiento
 */
public String getFecha_nacimiento() {
    return fecha_nacimiento;
}

/**
 * @param fecha_nacimiento la fecha_nacimiento a establecer (formato "aaaa/mm/dd")
 */
public void setFecha_nacimiento(String fecha_nacimiento) {
    this.fecha_nacimiento = fecha_nacimiento;
}

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
  
    }

    public String imprimir_datos() {
         return ("el nombre es:" +getNombre()+ "el apellido es;"+ getApellido() + "la cedula es:"+ getCedula() + "el correo es:"+ getCorreo()+ "la direccion"+ getDireccion()+ "fecha de nacimiento"+getFecha_nacimiento() );
}
}