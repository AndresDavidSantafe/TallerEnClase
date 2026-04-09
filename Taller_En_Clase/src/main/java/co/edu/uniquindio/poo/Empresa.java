package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Empresa {

    private String nit;
    private String nombre;

    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<EmpleadoPlanta> listEmpleadosPlanta;
    private ArrayList<EmpleadoVentas> listEmpleadosVenta;
    private ArrayList<EmpleadoTemporal> listEmpleadoTemporal;

    public Empresa(String nit, ArrayList<Empleado> listEmpleadosPlanta, String nombre, ArrayList<Empleado> listEmpleadosVenta, ArrayList<Empleado> listEmpleadoTemporal) {
        this.nit = nit;
        this.nombre = nombre;
        listEmpleadosPlanta = new ArrayList<>();
        listEmpleadosVenta = new ArrayList<>();
        listEmpleadoTemporal = new ArrayList<>();
    }

    public Empresa(String nit, String nombre, ArrayList<Empleado> listEmpleados) {
        this.nit = nit;
        this.nombre = nombre;
        this.listEmpleadosPlanta = listEmpleadosPlanta;
    }

    public boolean buscarEmpleadoByDocumento(String documento){
        for(Empleado empleado:listaEmpleados){
            if(empleado.getDocumento().equals(documento)){
                return true;
            }
        }
        return false;
    }

    public boolean agregarEmpleado() {

            if(){

        }
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<EmpleadoPlanta> getListEmpleadosPlanta() {
        return listEmpleadosPlanta;
    }

    public void setListEmpleadosPlanta(ArrayList<EmpleadoPlanta> listEmpleadosPlanta) {
        this.listEmpleadosPlanta = listEmpleadosPlanta;
    }

    public ArrayList<EmpleadoVentas> getListEmpleadosVenta() {
        return listEmpleadosVenta;
    }

    public void setListEmpleadosVenta(ArrayList<EmpleadoVentas> listEmpleadosVenta) {
        this.listEmpleadosVenta = listEmpleadosVenta;
    }

    public ArrayList<EmpleadoTemporal> getListEmpleadoTemporal() {
        return listEmpleadoTemporal;
    }

    public void setListEmpleadoTemporal(ArrayList<EmpleadoTemporal> listEmpleadoTemporal) {
        this.listEmpleadoTemporal = listEmpleadoTemporal;
    }
}
