/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author aluno
 */
public class LutaDAOJDBC {
Connection conexao = null;

StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder
                .append("INSERT INTO luta(nome) ")
                .append("VALUES (?, ?)");
}

