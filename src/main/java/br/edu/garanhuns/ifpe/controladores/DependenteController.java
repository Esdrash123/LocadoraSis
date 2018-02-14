/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.garanhuns.ifpe.controladores;

import br.edu.garanhuns.ifpe.entidades.Cliente;
import br.edu.garanhuns.ifpe.entidades.Dependente;
import br.edu.garanhuns.ifpe.model.dao.ManagerDao;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author esdra
 */
@ManagedBean(name = "cDependente")
@SessionScoped

public class DependenteController {

    public void insert(Dependente a) {
        ManagerDao.getCurrentInstance().insert(a);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O aluno foi cadastrado"));
    }

    public void update(Dependente a) {
        ManagerDao.getCurrentInstance().update(a);
    }

    public void deletar(Dependente a) {
        ManagerDao.getCurrentInstance().delete(a);
    }

    public Dependente read(Cliente cliente) {
        try {
            return (Dependente) ManagerDao.getCurrentInstance()
                    .read("select a from Dependente a where a.id=" + cliente, Dependente.class).get(0);
        } catch (ArrayIndexOutOfBoundsException arr) {
            return null;
        }
    }
}
