package co.edu.uniquindio.poo;

public class EmpleadoPlanta extends Empleado{

    private String cargo;
    private int horasExtra;
    private float valorHoraExtra;
    private float auxilioTransporte;

    private Empleado tipoEmpleado;

    public EmpleadoPlanta(String nombre, String documento, int edad, float descuentoSalud, float salarioBase, float descuentoPension, String cargo, int horasExtra, float valorHoraExtra, float auxilioTransporte) {
        super(nombre, documento, edad, descuentoSalud, salarioBase, descuentoPension);
        this.cargo = cargo;
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;
        this.auxilioTransporte = auxilioTransporrte;
    }
    @Override
    public float calcularSalarioBruto(){
        float total;
        total= salarioBase+calcularBonificacionCategoria()+(horasExtra*valorHoraExtra)+auxilioTransporte;
    return total;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public float getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(float auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public float getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(float valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "EmpleadoPlanta{" +
                "cargo='" + cargo + '\'' +
                ", horasExtra=" + horasExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                ", auxilioTransporte=" + auxilioTransporte +
                ", tipoEmpleado=" + tipoEmpleado +
                '}';
    }
}
