
package holamundo;


public class Libro {
    
    private String Titulo="LOTR", Autor="Tolkien";
    private int anioPublicacion;

    void mostrarInfo(){
        System.out.println("Titulo: "+Titulo+"\nAutor: "+Autor+"\nAnio de publicacion: "+anioPublicacion);
    }
            
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion>0)
        this.anioPublicacion = anioPublicacion;
    }
    
    
}    
