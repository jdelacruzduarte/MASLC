/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author JesusMini
 */
public class Empleado {
    String NSS, Nombre, Apellido, Cedula, Telefono, Celular, TipoRemuneracion, Sexo, Estado,Nomina;
    Date Fecha;
    double Salario;

    public Empleado(String NSS, String Nombre, String Apellido, String Cedula, String Telefono, String Celular, String TipoRemuneracion, String Sexo, String Estado, String Nomina, Date Fecha, double Salario) {
        this.NSS = NSS;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.TipoRemuneracion = TipoRemuneracion;
        this.Sexo = Sexo;
        this.Estado = Estado;
        this.Nomina = Nomina;
        this.Fecha = Fecha;
        this.Salario = Salario;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getTipoRemuneracion() {
        return TipoRemuneracion;
    }

    public void setTipoRemuneracion(String TipoRemuneracion) {
        this.TipoRemuneracion = TipoRemuneracion;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNomina() {
        return Nomina;
    }

    public void setNomina(String Nomina) {
        this.Nomina = Nomina;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
            
     
            
           
}
