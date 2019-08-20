/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Flor;
/**
 *
 * @author Administrador
 */
public class DaoFlor {
     public static boolean inserir(Flor objeto) {
        String sql = "INSERT INTO flor (nomepopular, nomecientifico, ano, tampetala, tamsepala) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNomepopular());
            ps.setString(2, objeto.getNomecientifico());
            ps.setInt(3, objeto.getAno());
            ps.setDouble(4, objeto.getTampetala());
            ps.setDouble(5, objeto.getTamsepala());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     
   public static void main(String[] args) {
        Flor objeto = new Flor();
        objeto.setNomepopular("Rosa");
        objeto.setNomecientifico("Rosa");
        objeto.setAno(2018);
        objeto.setTampetala(4.2);
        objeto.setTamsepala(2.1);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }   
   
   public static boolean alterar(Flor objeto) {
        String sql = "UPDATE flor SET nomepopular = ?, nomecientifico = ?, ano = ?, tampetala = ?, tamsepala = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNomepopular()); 
            ps.setString(2, objeto.getNomecientifico());
            ps.setInt(3, objeto.getAno());
            ps.setDouble(4, objeto.getTampetala());
            ps.setDouble(5, objeto.getTamsepala());
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
   
     public static boolean excluir(Flor objeto) {
        String sql = "DELETE FROM flor WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
 
}
