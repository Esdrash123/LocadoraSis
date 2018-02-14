/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.garanhuns.ifpe.builders;

import br.edu.garanhuns.ifpe.entidades.Cliente;
import br.edu.garanhuns.ifpe.entidades.Dependente;

/**
 *
 * @author esdra
 */
public class BuilderDependente {
    
    private Cliente cliente;
    private String nome;
    private int cpf;
    private String telefone;
    private String endereco;
    private boolean pendencia;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public boolean isPendencia() {
        return pendencia;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }
    
     public Dependente criarDependente (){
        return new Dependente( cliente, nome,cpf, telefone,endereco,pendencia);
    }
}
