public class Docente {
     // Atributos
    int id;
    String nombre, apellido, correo;
    double salario;


    public Docente(int id, String nombre, String apellido, String correo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.salario = salario;
    }

    public void InformacionDocente () {
        System.out.println("-------------Docente-------------");
        System.out.println("Id " + id);
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("Correo " + correo);
        System.out.println("Salario " + salario);
    }

    
}
