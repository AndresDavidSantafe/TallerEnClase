package co.edu.uniquindio.poo;

public class EmpleadoVentas extends Empleado {

    private float totalVentas;
    private float porcentajeComision;


    public EmpleadoVentas(String nombre, String documento, int edad, float descuentoSalud, float salarioBase, float descuentoPension, float totalVentas, float porcentajeComision) {
        super(nombre, documento, edad, descuentoSalud, salarioBase, descuentoPension);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }
    @Override
    public float calcularSalarioBruto() {
        float total;
        total=salarioBase+calcularBonificacionCategoria()+(totalVentas*(porcentajeComision/100));
        return total;
    }
    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "EmpleadoVentas{" +
                "totalVentas=" + totalVentas +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }
}
