package br.com.fernando;

import java.sql.Connection;

public class BasicoDAO {
	public Connection getConnection() {
		return FabricaDeConexoes.getInstance().getConnection();
		
	}
	

}



