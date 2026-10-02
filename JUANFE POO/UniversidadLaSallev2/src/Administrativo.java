public class Administrativo extends Persona {
    private String ciudad;

    public Administrativo(int id, String nombres, String apellidos, String correo, String ciudad) {
        super(id, nombres, apellidos, correo);
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override 
    public String obtenerRol() {
        return "Administrativo";
    }
    
    @Override 
    public void mostrarDatosEspecificos() {
        System.out.println("Ciudad " + ciudad);
    }
    
}
