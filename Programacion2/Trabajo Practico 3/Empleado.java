
package holamundo;


public class Empleado {
    
    private int id; 
    private String nombre, puesto;
    private double salario;
    public static int totalEmpleados;
    
    public Empleado(int id, String nombre, String puesto,double salario){
        this.id= id;
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
        totalEmpleados ++;
    }
    
    public Empleado(String nombre, String puesto){
        this.id= 0;
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario= 2000;
        totalEmpleados ++;
    }
    public void actualizarSalario(int porcentaje){
        this.salario = this.salario + (this.salario*(porcentaje/100.0));
    }
    public void actualizarSalario(double fijo){
        this.salario = this.salario + fijo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
}
