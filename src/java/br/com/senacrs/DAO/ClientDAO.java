/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senacrs.DAO;

import br.com.senacrs.TO.Client;
import br.com.senacrs.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author angelodaluz
 */
public class ClientDAO {
    Session session;

    public ClientDAO() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public void salvar(Client cliente){
        session.beginTransaction();
        session.saveOrUpdate(cliente);
        session.getTransaction().commit();
        session.close();
        
    }
    public List<Client> listar(){
        List<Client> client = session.createCriteria(Client.class).list();
        session.close();
        return client;
    }
    public void remover(Object cliente){
        session.beginTransaction();
        session.delete(cliente);
        session.getTransaction().commit();
        session.close();
    }
    
}
