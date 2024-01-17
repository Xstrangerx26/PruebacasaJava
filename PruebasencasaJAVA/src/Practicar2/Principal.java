package Practicar2;

public class Principal {
    public static void main(String[] args) {
       Liga liga = new Liga();
        try {
            Partido partido1 = new Partido(1, "Equipo1", "Equipo2",2,2, '2');
            partido1.ponerResultado("2-1");
            liga.anadirPartido(partido1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Partido partido2 = new Partido(2, "Equipo3", "Equipo4",1,2, '2');
            partido2.ponerResultado("0-0");
            liga.anadirPartido(partido2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Partido partido3 = new Partido(3, "Equipo5", "Equipo6", 2,3, '2');
            partido3.ponerResultado("1-2");
            liga.anadirPartido(partido3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        liga.mostrarPartido();
    }
}
