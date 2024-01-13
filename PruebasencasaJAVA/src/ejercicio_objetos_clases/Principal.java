package ejercicio_objetos_clases;

public class Principal {
    public static void main(String[] args) {
        Superheroe1 sup1 = new Superheroe1("Iker");
        sup1.setNombre("Hombre araña");
        sup1.setDescripcion("Hola esto es una pruena");
        System.out.println(sup1);
        Superheroe1 sup2 = new Superheroe1("Manuel");
        sup2.setNombre("Doctor");
        sup2.setDescripcion("No se que poner");
        System.out.println(sup2);

        Dimension Dimpeq = new Dimension(); // altura = 0, ancho = 0, profundidad = 0
        Dimension Dimgra = new Dimension(30, 20, 11);

        Dimpeq.setAlto(90);
        Dimpeq.setAncho(60);
        Dimpeq.setProfundidad(10);
        // altura = 90, ancho = 60, profundidad = 10
        System.out.println(Dimpeq);
        System.out.println(Dimgra);
        System.out.println("El volumen de la dimensión pequeña es: " + Dimpeq.getVolumen());

        Figura fig1 = new Figura("5959", 23, sup2,Dimgra);
        System.out.println(fig1);
        //Recuerda que tienes que poner otra ves un sout, fig1, para que se actualice del precio anterior que era 23 a la siguiente cantidad que hemos puesto qu es 60, en total 83.
        fig1.subirPrecio(60);
        System.out.println(fig1);

        Coleccion c1 = new Coleccion("Super");
        c1.añadirFigura(fig1);

        Figura fi1 = new Figura("6978",43, sup2, Dimpeq );
        System.out.println(c1.conCapa());
        //corregir minuto 26:36

    }
}
