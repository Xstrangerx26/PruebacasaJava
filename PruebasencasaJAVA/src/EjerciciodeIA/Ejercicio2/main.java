package EjerciciodeIA.Ejercicio2;

public class main {
    public static void main(String[] args) {
        ListaTareas l1 = new ListaTareas();
        l1.agregar("Hacer la compra");
        System.out.println("Todas las tareas:");
        l1.mostrarTareas();
    }
}
