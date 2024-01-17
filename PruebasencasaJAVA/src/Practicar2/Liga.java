package Practicar2;

import java.util.ArrayList;
import java.util.List;

public class Liga {
    List<Partido> partidos;

    public Liga(){
        partidos = new ArrayList<>();
    }

    public void anadirPartido(Partido partido){
        partidos.add(partido);
    }

    public void mostrarPartido(){
        for (Partido partido : partidos){
            System.out.println(partido);
        }
    }
}
