/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.controller;

import br.com.senacrs.DAO.ClientDAO;
import br.com.senacrs.TO.Client;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author angelodaluz
 */
@ManagedBean
@SessionScoped
public class ClientController implements Serializable{
    private static final long serialVersionUID = 1L;
    private Client cliente = new Client();
    
    
    
    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }
    
    public void salvar(){
        ClientDAO client = new ClientDAO();
        client.salvar(cliente);
        cliente = new Client();
    }
    public List<Client> listar(){
        ClientDAO client = new ClientDAO();
        return client.listar();
    }
    public void remover(Client cliente){
        ClientDAO client = new ClientDAO();
        client.remover(cliente);
    }
    
}
