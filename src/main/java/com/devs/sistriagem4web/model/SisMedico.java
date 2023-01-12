package com.devs.sistriagem4web.model;

public class SisMedico {
    private int id;
    private String nome;
    private String especialidade;
    private String crm;
    private String uf_Crm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getUf_Crm() {
        return uf_Crm;
    }

    public void setUf_Crm(String uf_Crm) {
        this.uf_Crm = uf_Crm;
    }
}
