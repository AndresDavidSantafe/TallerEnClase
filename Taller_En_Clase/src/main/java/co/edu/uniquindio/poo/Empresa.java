package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Empresa {

    private String nit;
    private String nombre;

    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<EmpleadoPlanta> listEmpleadosPlanta;
    private ArrayList<EmpleadoVentas> listEmpleadosVentas;
    private ArrayList<EmpleadoTemporal> listEmpleadoTemporal;

    public Empresa(String nit, ArrayList<Empleado> listEmpleadosPlanta, String nombre, ArrayList<Empleado> listEmpleadosVenta, ArrayList<Empleado> listEmpleadoTemporal) {
        this.nit = nit;
        this.nombre = nombre;
        listEmpleadosPlanta = new ArrayList<>();
        listEmpleadosVenta = new ArrayList<>();
        listEmpleadoTemporal = new ArrayList<>();
        listaEmpleados= new ArrayList<>();
    }

    public Empresa() {

    }

    public boolean buscarEmpleadoByDocumento(String documento){
        for(Empleado empleado:listaEmpleados){
            if(empleado.getDocumento().equals(documento)){
                return true;
            }
        }
        return false;
    }
    public boolean agregarEmpleadoPlanta(String nombre, String documento, int edad, float descuentoSalud, float salarioBase, float descuentoPension, String cargo, int horasExtra, float valorHoraExtra, float auxilioTransporte) {
        EmpleadoPlanta newEmpleadoPlanta= new EmpleadoPlanta(nombre, documento, edad, descuentoSalud, salarioBase, descuentoPension, cargo, horasExtra, valorHoraExtra, auxilioTransporte);

        if(buscarEmpleadoByDocumento(documento)==false){
            listEmpleadosPlanta.add(newEmpleadoPlanta);
            listaEmpleados.add(newEmpleadoPlanta);
            return true;
        }
        return false;
    }
    public boolean agregarEmpleadoVentas(String nombre, String documento, int edad, float descuentoSalud, float salarioBase, float descuentoPension, float totalVentas, float porcentajeComision) {
        EmpleadoVentas newEmpleadoVentas= new EmpleadoVentas(nombre, documento, edad, descuentoSalud, salarioBase, descuentoPension, totalVentas, porcentajeComision);

        if(buscarEmpleadoByDocumento(documento)==false){
            listEmpleadosVentas.add(newEmpleadoVentas);
            listaEmpleados.add(newEmpleadoVentas);
            return true;
        }
        return false;
    }

    public boolean agregarEmpleadoTemporal(String nombre, String documento, int edad, float descuentoSalud, float salarioBase, float descuentoPension, int diasTrabajados, float valorDia) {
        EmpleadoTemporal newEmpleadoTemporal= new EmpleadoTemporal(nombre, documento, edad, descuentoSalud, salarioBase, descuentoPension, diasTrabajados, valorDia);

        if(buscarEmpleadoByDocumento(documento)==false){
            listEmpleadoTemporal.add(newEmpleadoTemporal);
            listaEmpleados.add(newEmpleadoTemporal);
            return true;
        }
        return false;
    }



    public boolean agregarEmpleado(Empleado newEmpleado) {
        if(buscarEmpleadoByDocumento(newEmpleado.getDocumento())==false){
            listaEmpleados.add(newEmpleado);
            if(newEmpleado instanceof EmpleadoPlanta){
                listEmpleadosPlanta.add((EmpleadoPlanta)newEmpleado);
            }else if(newEmpleado instanceof EmpleadoVentas){
                listEmpleadosVentas.add((EmpleadoVentas)newEmpleado);
            }else{
                listEmpleadoTemporal.add((EmpleadoTemporal)newEmpleado);
            }
            return true;
        }
        return false;
    }

    public String mostrarEmpleados(){
        String mensaje="";
        for(Empleado empleado: listaEmpleados){
            mensaje+=empleado+"\n";
        }
        return mensaje;
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

    @java.lang.Override
    public java.lang.String toString() {
        return "Empresa{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEmpleados=" + listaEmpleados +
                ", listEmpleadosPlanta=" + listEmpleadosPlanta +
                ", listEmpleadosVentas=" + listEmpleadosVentas +
                ", listEmpleadoTemporal=" + listEmpleadoTemporal +
                '}';
    }
}
