package com.hrzn.commondb;

public class Implement {

	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		SQL sql = new SQL();
		
		
		oracle.connect();
		oracle.disconnect();
		sql.connect();
		sql.disconnect();

	}

}
