package org.testleaf.week4.day1;

public abstract class MySqlConnection implements DbConnect{
    public void executeQuery(String query){
        System.out.println("Execute the Query: "+query);
    }

}
