package holamundo;

public class TrabajoPractico2 {

    //Ejercicio1
    public static void main(String[] args) {
        Estudiantes p1 = new Estudiantes();

        p1.mostrarInfo();
        p1.subirCalificacion(9);
        p1.mostrarInfo();
        p1.bajarCalificacion(2);
        p1.mostrarInfo();

    }
    //Ejercicio2

    public static void main(String[] args) {
        Mascota p2 = new Mascota();

        p2.mostrarInfo();
        p2.cumplirAnios(2);
        p2.mostrarInfo();

    }

    //Ejercicio3
    public static void main(String[] args) {
        Libro p3 = new Libro();
        p3.mostrarInfo();
        p3.setAnioPublicacion(-150);
        p3.mostrarInfo();
        p3.setAnioPublicacion(1965);
        p3.mostrarInfo();
    }

    //Ejercicio4
    public static void main(String[] args) {
        Gallinas p4 = new Gallinas();
        p4.setIdGallina("AAA");
        p4.edad(2);
        p4.huevosPuesto(18);
        p4.mostrarEstado();
        p4.edad(4);
        p4.huevosPuesto(30);
        p4.mostrarEstado();
        Gallinas p5 = new Gallinas();
        p5.setIdGallina("AAB");
        p5.edad(1);
        p5.huevosPuesto(9);
        p5.mostrarEstado();
        p5.edad(3);
        p5.huevosPuesto(24);
        p5.mostrarEstado();
    }

    //Ejercicio5
    public static void main(String[] args) {
        Nave p6 = new Nave();
        p6.mostrarEstado();
        p6.despegar(1);
        p6.avanzar(50);
        p6.recargarCombustible(50);
        p6.mostrarEstado();
        p6.avanzar(50);
        p6.mostrarEstado();

    }
}
