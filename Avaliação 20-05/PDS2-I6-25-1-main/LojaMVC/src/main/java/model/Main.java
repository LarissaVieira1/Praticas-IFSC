package model;

import java.sql.Date;

public class Main {
    public static void main(String[] args){
        ClienteDAO clienteDAO = new ClienteDAO();
        
        //Criar novo cliente 
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Felipe Wanderherz");
        novoCliente.setTelefone("(47) 98765-4312");
        novoCliente.setEndereco("Bairro: Margem Esquerda, Rua: Portugal, Número: 81");
        novoCliente.setDataNascimento(Date.valueOf("2007-03-28"));
        
        //Inserir no banco
        clienteDAO.inserirCliente(novoCliente);
        
        //Listar todos os clientes
        clienteDAO.listarClientes();
    }
}
