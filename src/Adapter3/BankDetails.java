package Adapter3;
//model classımız
public class BankDetails {
    private String bankName;//bankanın adı
    private String accHolderName;//hesap sahibi adı
    private long accNumber;//hesap numarası
    //getter setter metodları
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) { this.accHolderName = accHolderName; }
    public long getAccNumber() {
        return accNumber;
    }
    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }
}// End of the BankDetails class.
