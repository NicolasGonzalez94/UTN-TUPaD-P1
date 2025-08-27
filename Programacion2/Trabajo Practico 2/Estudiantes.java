
package holamundo;



public class Estudiantes {
    
    private String nombre="Elias",apellido="Carulla",curso="2°año";
    private double calificacion;
    
    void mostrarInfo(){
    System.out.println("Nombre: "+nombre+"\nApellido: "+ apellido+"\n Curso: "+ curso);
    }
    void subirCalificacion(double puntos) {
        if(puntos>0)
            calificacion += puntos;
        System.out.println("La calificacion es: "+calificacion);
    }
    void bajarCalificacion (double puntos){
        if (puntos>0 && puntos<calificacion)
            calificacion -= puntos;
        System.out.println("La calificacion es: "+calificacion);    
    }
    }
    
