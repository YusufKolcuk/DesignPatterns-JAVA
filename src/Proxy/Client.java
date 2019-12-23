package Proxy;

//https://www.javatpoint.com/proxy-pattern
public class Client {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}
