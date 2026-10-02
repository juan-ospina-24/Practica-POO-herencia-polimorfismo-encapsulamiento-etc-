public class Docente extends Persona {
    private double Salario;

    public Docente(int id, String nombres, String apellidos, String correo, double salario) {
        super(id, nombres, apellidos, correo);
        Salario = salario;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
    
    @Override 
    public String obtenerRol() {
        return "Docente";
    }

    @Override 
    public void mostrarDatosEspecificos() {
        System.out.println("Salario " + Salario);
    
    }
}
