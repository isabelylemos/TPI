/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Empresa {
    private int CNPJ;
    private String nomeEmpresa;
    private String endereco;
    
    Conexao con = new Conexao();

    public Empresa() {
        this(0,"","");
    }

    public Empresa(int CNPJ, String nomeEmpresa, String endereco) {
        this.CNPJ = CNPJ;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void gravar(){
        String sql;
        sql = "Insert into empresas (CNPJ, nomeEmpresa, endereco) values"+
                "("+getCNPJ()+", '"+getNomeEmpresa()+"', '"+getEndereco()+"')";
        con.executeSQL(sql);
        JOptionPane.showInputDialog("Registro gravado com sucesso!");
    }
    
    public ResultSet listarEmpresas(){
        ResultSet = tabela;
        tabela = null;
        
        String sql = "Select * from empresas";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
