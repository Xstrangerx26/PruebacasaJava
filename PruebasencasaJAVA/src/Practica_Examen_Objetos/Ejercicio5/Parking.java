package Practica_Examen_Objetos.Ejercicio5;


import java.util.ArrayList;
import java.util.Collections;

public class Parking {
    private final ArrayList<String> matriculas;

    private final String nombre;

    public Parking(String nombre, int plazas) {
        this.nombre = nombre;
        matriculas = new ArrayList<>(Collections.nCopies(plazas, null));
    }

    public String getNombre() {
        return nombre;
    }

    public void entrada(String matricula, int plaza) throws ParkingException {
        if (matricula == null || matricula.length() < 4)
            throw new ParkingException("Matricula incorrecta", matricula);

        if (matriculas.get(plaza) != null)
            throw new ParkingException("Paza ocupada", matricula);

        if (matriculas.contains(matricula))
            throw new ParkingException("Matricula repetida", matricula);

        if (plaza >= matriculas.size() || plaza < 0){
            throw new ParkingException("PLaza inexistente", matricula);
        }
        matriculas.set(plaza, matricula);
    }

    public int salida(String matricula) throws ParkingException {
        if (!matriculas.contains(matricula))
            throw new ParkingException("Matricula no existente", matricula);
        int plaza = matriculas.indexOf(matricula);
        matriculas.set(plaza, null);
        return plaza;
    }

    public int getPlazasTotales() {
        return matriculas.size();
    }

    public int getPlazasOcupadas() {
        return getPlazasTotales() - getPlazasLibres();
    }

    public int getPlazasLibres() {
        /* int p1 = 0;*/
        /*for (int i = 0; i < matriculas.size(); i++){
            if (matriculas.get(i)==null){
                p1++;
            }
        }
        return p1;*/

       /* for (String matricula : matriculas){
            if (matricula == null){
                p1++;
            }
        }
        return  p1;*/
        return Collections.frequency(matriculas, null);
    }

    @Override
    public String toString() {
        String cadena = "Parking " + nombre + "\n";
        cadena += "------------------------\n";
        for (int i = 0; i < matriculas.size(); i++) {
            cadena += "plaza" + i + ": ";
            cadena += (matriculas.get(i) == null) ? "(vacio)" : matriculas.get(i);
            cadena += "\n";
        }
        cadena += "-------------------------\n";
        return cadena;
    }
}
