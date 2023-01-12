package com.devs.sistriagem4web.model;

public class SisPaciente {
    private int id;
    private String nomePaciente;
    private String cpf;
    private String sexo;
    private String dataNascimento;
    private SisEndereco enderecoId;
    private SisContato contatoId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public SisEndereco getEnderecoId() {
        return enderecoId;
    }

    public void setEnderecoId(SisEndereco enderecoId) {
        this.enderecoId = enderecoId;
    }

    public SisContato getContatoId() {
        return contatoId;
    }

    public void setContatoId(SisContato contatoId) {
        this.contatoId = contatoId;
    }
}
