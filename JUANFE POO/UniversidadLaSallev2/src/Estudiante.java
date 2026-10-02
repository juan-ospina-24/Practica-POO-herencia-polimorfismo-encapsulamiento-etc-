public class Estudiante extends Persona {
    private float promedio;

    public Estudiante(int id, String nombres, String apellidos, String correo, float promedio) {
        super(id, nombres, apellidos, correo);
        this.promedio = promedio;
    }

    
    

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override 
    public String obtenerRol() {
        return "Estudiante";
    }

    @Override 
    public void mostrarDatosEspecificos() {
        System.out.println("Promedio " + promedio);
    }

}
