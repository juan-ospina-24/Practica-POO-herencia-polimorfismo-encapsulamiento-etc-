public abstract class Persona {
    private int id;
    private String nombres, apellidos, correo;

    
    public Persona(int id, String nombres, String apellidos, String correo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public abstract String obtenerRol();

    public abstract void mostrarDatosEspecificos();


    public void mostrarDatos () {
        System.out.println(obtenerRol());
        System.out.println("Id " + getId());
        System.out.println("Nombres " + getNombres());
        System.out.println("Apellidos " + getApellidos());
        System.out.println("Correo " + getCorreo());
        mostrarDatosEspecificos();
        System.out.println("________________________________________");
    }
}
