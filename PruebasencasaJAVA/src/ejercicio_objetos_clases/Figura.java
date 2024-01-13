package ejercicio_objetos_clases;

public class Figura {
    private String Codigo;
    private double Precio;
    private Superheroe1 superheroe;
    private Dimension dimensiones;

    public Figura(String codigo, double precio, Superheroe1 superheroe, Dimension dimensiones) {
        Codigo = codigo;
        Precio = precio;
        this.superheroe = superheroe;
        this.dimensiones = dimensiones;
    }

    public double getPrecio() {
        return Precio;
    }



    public void setPrecio(double precio) {
        Precio = precio;
    }

    public Superheroe1 getSuperheroe() {
        return superheroe;
    }

    public void setSuperheroe(Superheroe1 superheroe) {
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    @Override
    public String toString() {
        return "Figura: \n{" +
                "Codigo='" + Codigo + '\'' +
                ", Precio=" + Precio +
                ", \n" + superheroe +
                ", \n" + dimensiones +
                '}';
    }
    public void subirPrecio(double cantidad){
        Precio += cantidad;
    }


}
