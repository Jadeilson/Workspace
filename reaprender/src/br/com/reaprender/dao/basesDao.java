package br.com.reaprender.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.reaprender.conections.ConnectionFactory;

public class basesDao  {

public ArrayList<String> teste () throws SQLException{	
	
	new ConnectionFactory();
	Connection con = ConnectionFactory.getConnection("sicop","postgres" , "t5p3y7t7");
	String consulta = "select basecliente from clientes order by basecliente";
	PreparedStatement stmt = con.prepareStatement(consulta);
	
	ResultSet rs = stmt.executeQuery();
	
	ArrayList<String> bases = new ArrayList<>();

	while (rs.next()){

		bases.add(rs.getString("basecliente"));
	}
	
	
	rs.close();
	stmt.close();
	con.close();

	return bases;
}
}
