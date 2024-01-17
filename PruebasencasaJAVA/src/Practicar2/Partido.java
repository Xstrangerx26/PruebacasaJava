package Practicar2;

public class Partido {
    private int jornada;
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocales;
    private int golesVisitante;
    private char resultadoQuiniela;

    public Partido(int jornada, String equipoLocal, String equipoVisitante, int golesLocales, int golesVisitante, char resultadoQuiniela) {
        this.jornada = jornada;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocales = golesLocales;
        this.golesVisitante = golesVisitante;
        this.resultadoQuiniela = resultadoQuiniela;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesLocales() {
        return golesLocales;
    }

    public void setGolesLocales(int golesLocales) {
        this.golesLocales = golesLocales;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public char getResultadoQuiniela() {
        return resultadoQuiniela;
    }

    public void setResultadoQuiniela(char resultadoQuiniela) {
        this.resultadoQuiniela = resultadoQuiniela;
    }

    public void ponerResultado(String resultado) throws Exception{
        if (equipoLocal.equals(equipoVisitante)){
            throw new Exception("Los equipos deben ser diferentes");
        }
        String[] goles = resultado.split("-");
        golesLocales = Integer.parseInt(goles[0]);
        golesVisitante = Integer.parseInt(goles[1]);
        resultadoQuiniela = golesLocales > golesVisitante ? '1' : golesLocales == golesVisitante ? 'X' : '2';
    }
    @Override
    public String toString(){
        if(resultadoQuiniela == '\0'){
            return "Partido entre equipo local " + equipoLocal + " y equipo visitante " + equipoVisitante + " todavía no se ha jugado";
        }else {
            return "Partido entre local "+ equipoLocal + " y el equipo visitante " + equipoVisitante + " ha finalizado con " + golesLocales + " goles de equipo local y " + golesVisitante + " goles de equipo visitante. Resultado quiniela " + resultadoQuiniela;        }
    }
}
