package co.edu.uniquindio.poo;

public record ResumenPago(String documento, String nombre, Empleado tipoEmpleado, int SalarioBruto) {

    @Override
    public String documento() {
        return documento;
    }

    @Override
    public Empleado tipoEmpleado() {
        return tipoEmpleado;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int SalarioBruto() {
        return SalarioBruto;
    }
}
