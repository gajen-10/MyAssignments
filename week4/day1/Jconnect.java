package org.testleaf.week4.day1;

public class Jconnect extends MySqlConnection{

    @Override
    public void connect() {
        System.out.println("Connection established Successfully");
    }

    @Override
    public void disconnect() {
        System.out.println("Connection disconnected Successfully");
    }

    @Override
    public void excuteUpdate() {
          System.out.println("Execute the update command:"+" "+" update Test_Login set id=1, name=Test ");
    }
    public static void main(String[] args) {
        Jconnect jc=new Jconnect();
        jc.connect();
        jc.excuteUpdate();
        jc.executeQuery("Select * from Test_Login");
        jc.disconnect();
    }

}
