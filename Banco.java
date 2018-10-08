/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guilherme
 */
public class Banco {

    private String nome;
    private String email;
    private String senha;
    private String Id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String Id() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String salvar() {

        try {
            FileWriter fw = new FileWriter("clientes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: " + this.nome);
            pw.println("Email: " + this.email);
            pw.println("Senha: " + this.senha);
            pw.println("ID: " + this.Id);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastro com sucesso!";
    }

}
