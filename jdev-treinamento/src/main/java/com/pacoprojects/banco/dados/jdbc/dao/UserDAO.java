package com.pacoprojects.banco.dados.jdbc.dao;

import com.pacoprojects.banco.dados.jdbc.connection.SingleConnection;
import com.pacoprojects.banco.dados.jdbc.model.User;
import com.pacoprojects.banco.dados.jdbc.model.UserTelefoneInnerJoin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

	private Connection connection;

	public UserDAO() {
		connection = SingleConnection.getConnection();
	}

	public void salvar(User user) {
		try {

			String sql = "insert into userjdbc (nome,email) values(?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);

			insert.setString(1, user.getNome());
			insert.setString(2, user.getEmail());

			insert.execute(); /* EXECUTA PREPARACAO DO SQL */
			connection.commit(); /* SALVA NO BANCO */

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback(); /* REVERTE OPERACAO */
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	public List<User> listarUsuarios() {
		List<User> lista = new ArrayList<User>();

		try {
			String sql = "select * from userjdbc";
			PreparedStatement select = connection.prepareStatement(sql);

			ResultSet resultado = select.executeQuery();

			while (resultado.next()) {

				User user = new User();

				user.setId(resultado.getLong("id"));
				user.setNome(resultado.getString("nome"));
				user.setEmail(resultado.getString("email"));

				lista.add(user);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public User pesquisaUser(Long id) {

		User user = new User();
		try {

			String sql = "select * from userjdbc where id = " + id;
			PreparedStatement pesquisa = connection.prepareStatement(sql);
			ResultSet resultado = pesquisa.executeQuery();

			while (resultado.next()) { /* VAI RETORNAR APENAS 1 USUARIO OU NENHUM */

				user.setId(resultado.getLong("id"));
				user.setNome(resultado.getString("nome"));
				user.setEmail(resultado.getString("email"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	public void updateUser(User user) {

		try {

			String sql = "update userjdbc set nome=?,email=? where id=" + user.getId();
			PreparedStatement updateStatement = connection.prepareStatement(sql);
			updateStatement.setString(1, user.getNome());
			updateStatement.setString(2, user.getEmail());

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
	
	public void deleteUser(Long id) {
		
		try {
			
			String sql = "delete from userjdbc where id =" + id;
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
	
	public List<UserTelefoneInnerJoin> listaInnerJoinUserFone(Long id){
		
		List<UserTelefoneInnerJoin> list = new ArrayList<UserTelefoneInnerJoin>();
		
		try {
			
			String sql = " SELECT userj.nome,fone.numero,userj.email from telefoneuser as fone ";
			sql += " inner join userjdbc as userj ";
			sql += " on fone.usuariopessoa = userj.id ";
			sql += "where userj.id = " +id;
			
			PreparedStatement listaInnerJoinStatement = connection.prepareStatement(sql);
			ResultSet resultSet = listaInnerJoinStatement.executeQuery();
			
			while (resultSet.next()) {

				UserTelefoneInnerJoin beanUserFoneInnerJoin = new UserTelefoneInnerJoin();
				
				beanUserFoneInnerJoin.setNome(resultSet.getString("nome"));
				beanUserFoneInnerJoin.setNumero(resultSet.getString("numero"));
				beanUserFoneInnerJoin.setEmail(resultSet.getString("email"));
				
				list.add(beanUserFoneInnerJoin);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	public void deleteTelefoneUserRelacional(Long id) {
		
		try {
			
			String sqlFone = " delete from telefoneuser where usuariopessoa = " + id;
			PreparedStatement deleteFoneStatement = connection.prepareStatement(sqlFone);
			
			/* RETORNA BOOLEAN ENTAO DA PRA SABER SE FOI DELETADO COM SUCESSO OU NAO */
			deleteFoneStatement.execute();
			connection.commit();
			
			/* nao precisava, mas por seguranca eu preferi usar um try em cada consulta */
			try {
				
				String sqlUser = " delete from userjdbc where id = " + id;
				PreparedStatement deleteUserStatement = connection.prepareStatement(sqlUser);
				
				/* NAO RETORNA NADA, NORMALMENTE USADO PARA INSERT, UPDATE, DELETE OU DDL */
				deleteUserStatement.executeUpdate();
				connection.commit();
				deleteUserStatement.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				connection.rollback();
			}
			
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
