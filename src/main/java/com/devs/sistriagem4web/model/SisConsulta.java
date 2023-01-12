package com.devs.sistriagem4web.model;

import java.util.Date;

public class SisConsulta {
    private int id;
    private SisPaciente pacienteId;
    private SisMedico medicoId;
    private String nomeConsulta;
    private int cid;

    private Date horario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SisPaciente getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(SisPaciente pacienteId) {
        this.pacienteId = pacienteId;
    }

    public SisMedico getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(SisMedico medicoId) {
        this.medicoId = medicoId;
    }

    public String getNomeConsulta() {
        return nomeConsulta;
    }

    public void setNomeConsulta(String nomeConsulta) {
        this.nomeConsulta = nomeConsulta;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
}
