/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.garanhuns.ifpe.builders;

import br.edu.garanhuns.ifpe.entidades.Filme;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author esdra
 */

@ManagedBean(name="bFilme")
@ViewScoped

public class BuilderFilme {
    private String titulo;
    private String sinopse;
    private Date dataLancamento;
    private int faixaIndicativa;
    private boolean disponivel;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getFaixaIndicativa() {
        return faixaIndicativa;
    }

    public void setFaixaIndicativa(int faixaIndicativa) {
        this.faixaIndicativa = faixaIndicativa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

 public Filme criarFilme (){
        return new Filme(titulo, sinopse,dataLancamento,faixaIndicativa);
    }
}
