package application;

import java.sql.Connection;

public class Main {
	static Connection conn = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conn = DBModel.openDB("database.sqlite");
	}

}
