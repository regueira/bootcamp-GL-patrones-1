package gl.bootcamp.example2.productos;

public abstract class Disco {
 
    public abstract String getCapacidad();
 
    public abstract String getNombre();
 
    public abstract String getPrecio();
 
    @Override
    public String toString() {
            return getNombre() + " (" + getCapacidad() + ")";
    }
}