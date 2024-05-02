package Model;

import java.time.LocalDateTime;

public class Consulta {
    private int id;
    private Atendimento atendimento;
    private Medico medico;
    private LocalDateTime dataHoraConsulta;
    private String anamnese;
    private String diagnostico;
    private String prescricao;
    private String observacoes;
    private String status;

    public Consulta(String anamnese, Atendimento atendimento, String diagnostico, int id, Medico medico, String observacoes, String prescricao, String status) {
        this.anamnese = anamnese;
        this.atendimento = atendimento;
        this.dataHoraConsulta = LocalDateTime.now();
        this.diagnostico = diagnostico;
        this.id = id;
        this.medico = medico;
        this.observacoes = observacoes;
        this.prescricao = prescricao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public void setDataHoraConsulta(LocalDateTime dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public String getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(String anamnese) {
        this.anamnese = anamnese;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
    return "ID: " + this.id +
            "     Atendimento: " + this.atendimento.getId() +
            "     " + this.dataHoraConsulta +
            "\nMédico: " + this.medico +
            "\nAnamnese: " + this.anamnese +
            "\nDiagnóstico: " + this.diagnostico +
            "\nPrescrição: " + this.prescricao +
            "\nObservações: " + this.observacoes +
            "\nStatus: " + this.status;
}

    
}
