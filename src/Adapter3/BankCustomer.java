package Adapter3;

// This is the adapter class
//banka müsterisi sınıfı banka detay modelini extends kredi kart interfacesini implement eder.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BankCustomer extends BankDetails implements ICreditCard {
    public void giveBankDetails(){
        try{
           // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Scanner giris=new Scanner(System.in);

            System.out.print("Enter the account holder name :");
           // String customername=br.readLine();
            String customername=giris.nextLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            //long accno=Long.parseLong(br.readLine());
            long accno=giris.nextLong();
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            //String bankname=br.readLine();
            String bankname=giris.next();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String getCreditCard() {
        long accno=getAccNumber();
        String accholdername=getAccHolderName();
        String bname=getBankName();

        return ("The Account number "+accno+" of "+accholdername+" in "+bname
                + " bank is valid and authenticated for issuing the credit card. ");
    }
}//End of the BankCustomer class.