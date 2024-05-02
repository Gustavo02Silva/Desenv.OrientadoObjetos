package Model;

import java.util.Date;

public class Jornada {
    private Date dataInicial;
    private Date dataFinal;
    private int cargaHoraria;
    
    public Jornada(Date dataInicial, Date dataFinal, int cargaHoraria){
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cargaHoraria = cargaHoraria;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString(){
        return "Hora Inicial: " + this.dataInicial + "\n Hora Final: " + this.dataFinal + "\nCarga Horária: " + this.cargaHoraria;
    }
}
