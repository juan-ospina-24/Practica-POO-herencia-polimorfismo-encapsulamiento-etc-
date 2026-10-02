public class Main {
    
    public static void main(String[] args) {
        
    Estudiante e1 = new Estudiante(101, "Juan", "Fe", "j@gmail.com", 4.5f);
    e1.MostrarDatos();

    Estudiante e2 = new Estudiante(121, "Petro", "Gustavo", "pg@gmail.com", 3.0f);
    e2.MostrarDatos();

    Docente d1 = new Docente(001, "Mary", "Luz", "maryl@unisalle", 1100.98d);
    d1.InformacionDocente();
    
    Docente d2 = new Docente(002, "Patria", "Milagro", "ae@unisalle", 22200.56d);
    d2.InformacionDocente();

    Administrativo a1 = new Administrativo(20, "Samuel", "Santander", "ss@petroespriella", 108907.78d);
    a1.InformacionAdmin();
    }

}
