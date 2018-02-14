/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.garanhuns.ifpe.controladores;

import br.edu.garanhuns.ifpe.entidades.Cliente;
import br.edu.garanhuns.ifpe.model.dao.ManagerDao;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author esdra
 */
@ManagedBean(name = "cCliente")
@SessionScoped
public class ClienteController {

    public void insert(Cliente a) {
        ManagerDao.getCurrentInstance().insert(a);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("O Cliente foi cadastrado"));
    }

    public void update(Cliente a) {
        ManagerDao.getCurrentInstance().update(a);
    }

    public void deletar(Cliente a) {
        ManagerDao.getCurrentInstance().delete(a);
    }

    public Cliente read(String nome) {
        try {
            return (Cliente) ManagerDao.getCurrentInstance()
                    .read("select a from Cliente a where a.id=" + nome, Cliente.class).get(0);
        } catch (ArrayIndexOutOfBoundsException arr) {
            return null;
        }
    }

}
