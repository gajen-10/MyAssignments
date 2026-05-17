package org.testleaf.week4.day1;

public class JavaConnection implements DatabaseConnection{

    @Override
    public void connect() {
        
      System.out.println("Database connection established successfully");
    }

    @Override
    public void disconnect() {
        
        System.out.println("Database connection got disconnected successfully");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Execute the update command:"+" "+" update Test_Login set id=1, name=Test ");
    }

    public static void main(String[] args) {
        JavaConnection jc=new JavaConnection();
        jc.connect();
        jc.executeUpdate();
        jc.disconnect();
    }
}
