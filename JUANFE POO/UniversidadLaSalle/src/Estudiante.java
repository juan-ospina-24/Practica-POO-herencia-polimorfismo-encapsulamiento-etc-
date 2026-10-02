public class Estudiante {
    
    // Atributos
    int id;
    String nombre, apellido, correo;
    float promedio;

    public Estudiante(int id, String nombre, String apellido, String correo, float promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.promedio = promedio;
    }

    public void MostrarDatos(){
        System.out.println("-------------Estudiante-------------");
        System.out.println("Id: " + id);
        System.out.println("Nombres: " + nombre);
        System.out.println("Apellidos " + apellido);
        System.out.println("Correo " + correo);
        System.out.println("Promedio " + promedio);
    }
    
}
