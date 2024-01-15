package EjerciciodeIA.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private List<String> tareas;

    public ListaTareas(){
        tareas = new ArrayList<>();
    }
    public void agregar(String tarea){
        tareas.add(tarea);
    }
    public void eliminar(String tarea){
        tareas.remove(tarea);
    }
    public void mostrarTareas(){
        for (String tarea: tareas){
            System.out.println(tarea);
        }
    }

}
