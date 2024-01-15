package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
       empleados = new  ArrayList<>();
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public double calcularSalarioPromedio(){
        double sumaSalario = 0;
        for (Empleado empleado : empleados){
            sumaSalario += empleado.getSalario();
        }
        return sumaSalario / empleados.size();
    }

    public void mostrarInformacionEmpleados(){
        for (Empleado empleado : empleados){
            System.out.println(empleado.getNombre()+ " - " + empleado.getSalario());
        }
    }
}
