package Adapter3;

//This is the client class.
public class Client {
    public static void main(String args[]){
        ICreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}//End of the BankCustomer class.