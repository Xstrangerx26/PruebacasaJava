package Ejercicio3;

public class Principal {
    public static void main(String[] args) {

        //Nombre de la empresa
        Empresa emp1 = new Empresa("Isla");
        //Agregar empleados
        Empleado ep1 = new Empleado("Iker", 2000);
        emp1.agregarEmpleado(ep1);

        //Calcular saladio promedio
        double salarioPromedio = emp1.calcularSalarioPromedio();
        System.out.println("Salario promedio: " + salarioPromedio);

        //Mostrar información del empleado
        emp1.mostrarInformacionEmpleados();
    }


}
