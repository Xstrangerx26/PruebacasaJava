package ejercicio_objetos_clases;

public class Superheroe1 {
    private String Nombre;
    private String Descripcion;
    private boolean Capa;

    public Superheroe1(String nombre) {
        Nombre = nombre;
        Descripcion = "";
        Capa = false;
    }

    //El metodo Set sirve para cambiar la propiedad(public, private) de la clase.
    //El metodo Get es un metodo que te sirve para obtener la caracteristicas del objeto.
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public boolean isCapa() {
        return Capa;
    }

    public void setCapa(boolean capa) {
        Capa = capa;
    }

    @Override
    public String toString() {
        return "Superheroe1{" +
                "Nombre='" + Nombre + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Capa=" + Capa +
                '}';
    }
}

