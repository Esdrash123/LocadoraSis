/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.garanhuns.ifpe.entidades;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author esdra
 */
@Entity
@Table(name = "Cliente")
public class Cliente {

    @Id
    @GeneratedValue
    private int id;
    @Column(length = 30, nullable = false)
    private String nome;
    @Column(length = 11, nullable = false)
    private int cpf;
    @Column(length = 12, nullable = false)
    private String telefone;
    @Column(length = 100, nullable = false)
    private String endereco;
    @Column(length = 100, nullable = false)
    private boolean pendencia;
    @Column(length = 1000, nullable = false)
    private List<Dependente> dependentes;
 

    public Cliente(String nome, int cpf, String endereco, boolean pendencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.pendencia = pendencia;
    }

    public Cliente() {
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public boolean isPendencia() {
        return pendencia;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }
}
