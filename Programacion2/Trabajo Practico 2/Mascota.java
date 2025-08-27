
package holamundo;



public class Mascota {
    
    private String nombre="Elias",especie="Pastor Aleman";
    private int edad=7;
    
    void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nEspecie: "+especie+"\nEdad: "+edad);
        
    }
    void cumplirAnios (int anios) {
        if (anios>0);
            edad+=anios;
        
    }  
}
