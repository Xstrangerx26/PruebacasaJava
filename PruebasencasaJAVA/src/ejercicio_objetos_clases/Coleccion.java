package ejercicio_objetos_clases;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;

    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        listaFiguras = new ArrayList<>();

    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    public void añadirFigura(Figura fig){
        listaFiguras.add(fig);
    }

    public void subirPrecio(double cantidad, String id){
        for(Figura f: listaFiguras){
            if (f.getCodigo().equals(id)){
                f.subirPrecio(cantidad);
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "Colecciones" + nombreColeccion +"\n";
        for (Figura f:listaFiguras ){
            cadena += f+"\n";
        }
        return cadena;
    }

    public String conCapa(){
        String  cadena = "Figuras del superheroe con capa "+"\n";
        for (Figura f: listaFiguras){
            if (f.getSuperheroe().isCapa()){
                cadena += f+ "\n";
            }
        }
        return cadena;
    }
}
