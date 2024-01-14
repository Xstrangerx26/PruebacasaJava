public class CancionNavidad {

        public static void main(String[] args) {
            String estribillo = "Feliz Navidad, Feliz Navidad";

            StringBuilder cancion = new StringBuilder(estribillo);
            //append Combina filas de dos o más marcos de datos en un único marco de datos anexando un marco de datos al final del otro marco de datos
            cancion.append("\nEl módulo de programación quiero aprobar.");
            cancion.append("\nA mi profesor favorito tendré que sobornar.");
            cancion.append("\nJamón y gambas tendré que comprar.");
            cancion.append("\nPorque si no me tocará pringar.");
            cancion.append("\nY el año que viene el doble tendré que pagar.");

            String cancionCompleta = cancion.toString();
            cancionCompleta = cancionCompleta.replace("\n", "\n" + estribillo + "\n");

            System.out.println(cancionCompleta);
        }


}
