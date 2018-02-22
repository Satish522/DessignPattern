package org.factory.framwork;

public abstract class QueryExecutor {
	String config;
	String conn;
	String SQL;
	public abstract void handle(String resultSet);
}
