package E4;
public class empleados {

    private String nombre;
    private int horas;
    private double tarifa;

    public empleados(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSueldoBruto() {
        double sueldo = 0;

        if (horas <= 40) {
            sueldo = horas * tarifa;
        }else {
            sueldo = 40 * tarifa;
            int diferencia = horas - 40;
            sueldo += diferencia * (tarifa * 1.5);
        }
        
        return sueldo;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f","Sueldo Bruto del trabajador",getNombre(),calcularSueldoBruto());
    }
    
    
}
