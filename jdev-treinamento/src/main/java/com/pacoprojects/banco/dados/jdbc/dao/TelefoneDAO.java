package com.pacoprojects.banco.dados.jdbc.dao;

import com.pacoprojects.banco.dados.jdbc.connection.SingleConnection;
import com.pacoprojects.banco.dados.jdbc.model.TelefoneUser;
import com.pacoprojects.banco.dados.jdbc.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelefoneDAO {

	private Connection connection;
	
	
	public TelefoneDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void insertTelefone(TelefoneUser telefoneUser) {
		
		try {
			
			String sql = "insert into telefoneuser (numero,tipo,usuariopessoa) values(?,?,?)";
			PreparedStatement registerStatement = connection.prepareStatement(sql);
			registerStatement.setString(1, telefoneUser.getNumero());
			registerStatement.setString(2, telefoneUser.getTipo());
			registerStatement.setLong(3, telefoneUser.getUser().getId());
			
			registerStatement.execute();
			connection.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	public List<TelefoneUser> listarTelefones() {
		
		List<TelefoneUser> list = new ArrayList<TelefoneUser>();
		try {
			
			String sql = "select * from telefoneuser";
			PreparedStatement listarStatement = connection.prepareStatement(sql);
			ResultSet resultado = listarStatement.executeQuery();
			
			while (resultado.next()) {
				
				TelefoneUser telefoneUser = new TelefoneUser();
				User user = new User();
				
				telefoneUser.setId(resultado.getLong("id"));
				telefoneUser.setNumero(resultado.getString("numero"));
				telefoneUser.setTipo(resultado.getString("tipo"));
				
				user.setId(resultado.getLong("usuariopessoa"));
				user = new UserDAO().pesquisaUser(user.getId());
				telefoneUser.setUser(user);
				
				list.add(telefoneUser);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public TelefoneUser buscaTelefoneUser(Long id) {
			TelefoneUser telefoneUser = new TelefoneUser();;
		try {
			
			String sql = "select * from telefoneuser where id="+ id;
			PreparedStatement buscaStatement = connection.prepareStatement(sql);
			ResultSet resultado = buscaStatement.executeQuery();
			
			while (resultado.next()) {
				
				telefoneUser.setId(resultado.getLong("id"));
				telefoneUser.setNumero(resultado.getString("numero"));
				telefoneUser.setTipo(resultado.getString("tipo"));
				telefoneUser.getUser().setId(resultado.getLong("usuariopessoa"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return telefoneUser;
	}
	
	public void updateTelefoneUser(TelefoneUser telefoneUser) {
		
		try {
			
			String sql = "update telefoneuser set numero = ?,tipo = ? where id = "+ telefoneUser.getId();
			PreparedStatement updateStatement = connection.prepareStatement(sql);
			updateStatement.setString(1, telefoneUser.getNumero());
			updateStatement.setString(2, telefoneUser.getTipo());
			
			updateStatement.execute();
			connection.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public void deleteTelefone(Long id) {
		
		try {
			
			String sql = "delete from telefoneuser where id ="+ id;
			PreparedStatement deleStatement = connection.prepareStatement(sql);
			
			deleStatement.execute();
			connection.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
}
