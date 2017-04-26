package br.com.senacrs.TO;

public class Client  implements java.io.Serializable {


     private Integer idClient;
     private String nameClient;
     private String cpfClient;
     private String contactClient;

    public Client() {
    }

	
    public Client(String nameClient, String cpfClient) {
        this.nameClient = nameClient;
        this.cpfClient = cpfClient;
    }
    public Client(String nameClient, String cpfClient, String contactClient) {
       this.nameClient = nameClient;
       this.cpfClient = cpfClient;
       this.contactClient = contactClient;
    }
   
    public Integer getIdClient() {
        return this.idClient;
    }
    
    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }
    public String getNameClient() {
        return this.nameClient;
    }
    
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    public String getCpfClient() {
        return this.cpfClient;
    }
    
    public void setCpfClient(String cpfClient) {
        this.cpfClient = cpfClient;
    }
    public String getContactClient() {
        return this.contactClient;
    }
    
    public void setContactClient(String contactClient) {
        this.contactClient = contactClient;
    }




}


