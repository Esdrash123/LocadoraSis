/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.garanhuns.ifpe.controladores;

import br.edu.garanhuns.ifpe.entidades.Filme;
import br.edu.garanhuns.ifpe.model.dao.ManagerDao;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author esdra
 */
@ManagedBean(name = "cFilme")
@SessionScoped

public class FilmeController {

    public void insert(Filme a) {
        ManagerDao.getCurrentInstance().insert(a);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Filme foi cadastrado"));
    }

    public void update(Filme a) {
        ManagerDao.getCurrentInstance().update(a);
    }

    public void deletar(Filme a) {
        ManagerDao.getCurrentInstance().delete(a);
    }

    public Filme read(String titulo) {
        try {
            return (Filme) ManagerDao.getCurrentInstance()
                    .read("select a from Filme a where a.id=" + titulo, Filme.class).get(0);
        } catch (ArrayIndexOutOfBoundsException arr) {
            return null;
        }
    }
}
