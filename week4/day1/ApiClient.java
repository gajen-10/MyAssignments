package org.testleaf.week4.day1;

public class ApiClient {

    public void sendRequest(String endPoint){
        System.out.println("Create request needs to be triggered for the endpoint: "+endPoint);
    }
    public void sendRequest(String endpoint, String requestBody, String requestStatus){
        System.out.println("Request triggered for the endpoint "+endpoint);
        System.out.println("Request Body: " +requestBody);
        if(requestStatus=="200"){
            System.out.println("Success Response");
        }
        else{
        System.out.println("Error Response");
        }
    }
public static void main(String[] args) {
    ApiClient ac= new ApiClient();
    ac.sendRequest("http://leaftaps.com/opentaps/");
    ac.sendRequest("http://leaftaps.com/opentaps/","{\r\n" + //
                "    \"userId\": 1,\r\n" + //
                "    \"id\": 1,\r\n" + //
                "    \"title\": \"sunt aut facere \",\r\n" + //
                "    \"body\": \"quia et suscipit\"\r\n" + //
                "  ","200");
}
}
