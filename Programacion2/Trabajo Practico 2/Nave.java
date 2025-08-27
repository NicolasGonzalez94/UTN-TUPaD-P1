
package holamundo;



public class Nave {
    
    private String nombre="Halcon";
    private double combustible=0;
    
    void mostrarEstado(){
       System.out.println("Nombre: "+nombre+"\nCombustible: "+combustible);
}
    void despegar(int arrancar){
        if(arrancar==1){
        System.out.println("La nave a despegado");
        }
        else{
        System.out.println("La nave no a despegado");
        }
        }
    void avanzar(double distancia){
        if (combustible>=distancia){
        combustible-=distancia;
        System.out.println("La distancia recorrida es: "+distancia);
        }
        else{
        System.out.println("La nave necesita recargar para avanzar");
        }
    }
    void recargarCombustible(double cantidad){
        if (combustible>0 && combustible<50);
        combustible+=cantidad;
    }
}

