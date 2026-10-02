public class Main {
    public static void main(String[] args) {
        
    Persona[] comunidad = {
        new Estudiante(0, null, null, null, 0),
        new Docente(0, null, null, null, 0),
        new Administrativo(0, null, null, null, null)
    };

    for (Persona persona : comunidad){
        persona.mostrarDatos();
    }
  } 
}
