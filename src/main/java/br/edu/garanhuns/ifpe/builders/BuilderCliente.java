/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.garanhuns.ifpe.builders;

import br.edu.garanhuns.ifpe.entidades.Cliente;
import br.edu.garanhuns.ifpe.entidades.Dependente;
import br.edu.garanhuns.ifpe.entidades.Filme;
import java.util.List;

/**
 *
 * @author esdra
 */
public class BuilderCliente {

    private String nome;
    private int cpf;
    private String telefone;
    private String endereco;
    private boolean pendencia;
    private List<Dependente> dependentes;
    private List<Filme> historicoDealugueis;

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

    public boolean isPendencia() {
        return pendencia;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public List<Filme> getHistoricoDealugueis() {
        return historicoDealugueis;
    }

    public void setHistoricoDealugueis(List<Filme> historicoDealugueis) {
        this.historicoDealugueis = historicoDealugueis;
    }
     public Cliente criarCliente (){
        return new Cliente(nome, cpf, endereco,pendencia);
    }

}
