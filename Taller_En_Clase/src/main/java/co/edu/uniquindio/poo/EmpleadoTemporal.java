package co.edu.uniquindio.poo;

public class EmpleadoTemporal extends Empleado{
    private int diasTrabajados;
    private float valorDia;

    public EmpleadoTemporal(String nombre, String documento, int edad, float descuentoSalud, float salarioBase, float descuentoPension, int diasTrabajados, float valorDia) {
        super(nombre, documento, edad, descuentoSalud, salarioBase, descuentoPension);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }

    @Override
    public float calcularSalarioBruto() {
        float total;
        total=(diasTrabajados*valorDia)+calcularBonificacionCategoria();
        return total;
    }
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }


}
