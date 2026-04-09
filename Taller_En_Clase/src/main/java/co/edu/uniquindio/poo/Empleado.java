package co.edu.uniquindio.poo;

public abstract class Empleado {
    protected String documento;
    protected String nombre;
    protected int edad;
    protected float salarioBase;

    protected CategoriaEmpleado categoriaEmpleado;
    protected float descuentoSalud;
    protected float descuentoPension;

    public Empleado(String nombre, String documento, int edad, float descuentoSalud, float salarioBase, float descuentoPension) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.descuentoSalud = descuentoSalud;
        this.salarioBase = salarioBase;
        this.descuentoPension = descuentoPension;
    }


        public float calcularSalarioBruto(float calcularBonificacionCategoria){
        float total=calcularBonificacionCategoria;
        return 0;
    }

    public float  calcularBonificacionCategoria(){
         float total=0;
        if(categoriaEmpleado.SENIOR == getCategoriaEmpleado()){
            total=(float)(salarioBase-(salarioBase*0.05));
        }
        if(categoriaEmpleado.SEMI_SENIOR == getCategoriaEmpleado()){
            total=(float)(salarioBase-(salarioBase*0.1));
        }
        if(categoriaEmpleado.JUNIOR == getCategoriaEmpleado()){
            total=(float)(salarioBase-(salarioBase*0.15));
        }
        return total;
    }

    public float calcularDescuentos(){
        float total;
        float descSalud;
        float descPension;
        descSalud=calcularSalarioBruto()*(descuentoSalud/100);
        descPension=calcularSalarioBruto()*(descuentoPension/100);
        total=descSalud+descPension;
        return total;
    }

    public float calcularSalarioNeto(){
        float total;
        total=calcularSalarioBruto()-calcularDescuentos();
        return total;
    }

    public String mostrarInformacion(){
        return "0";
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float isSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getDescuentoPension() {
        return descuentoPension;
    }

    public void setDescuentoPension(float descuentoPension) {
        this.descuentoPension = descuentoPension;
    }

    public float getDescuentoSalud() {
        return descuentoSalud;
    }

    public void setDescuentoSalud(float descuentoSalud) {
        this.descuentoSalud = descuentoSalud;
    }

    public CategoriaEmpleado getCategoriaEmpleado() {
        return categoriaEmpleado;
    }

    public void setCategoriaEmpleado(CategoriaEmpleado categoriaEmpleado) {
        this.categoriaEmpleado = categoriaEmpleado;
    }

    public abstract float calcularSalarioBruto();
}
