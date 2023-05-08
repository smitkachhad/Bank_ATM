package Banking_Project_Smit;
public class Account_Details {
    private String Customer_Name;
    private String Account_Number;
    private String Email;
    private double Account_Balance;
    private String Phone_Number;


    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(String account_Number) {
        Account_Number = account_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public double getAccount_Balance() {
        return Account_Balance;
    }

    public void setAccount_Balance(double account_Balance) {
        Account_Balance = account_Balance;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    //parameterized constructor
    public Account_Details(String customer_Name, String account_Number, String email, double account_Balance, String phone_Number) {
        Customer_Name = customer_Name;
        Account_Number = account_Number;
        Email = email;
        Account_Balance = account_Balance;
        Phone_Number = phone_Number;
    }

    public void DepositMoney(double DepositedMoney)
    {
            this.Account_Balance+=DepositedMoney;
            System.out.println("Deposit successfully added to account! Total balance is " + this.Account_Balance);
    }
    public void WithdrawMoney(double WithdrawedMoney)
    {
        if (this.Account_Balance-WithdrawedMoney < 0)
        {
            System.out.println("Withdraw Unsuccessful!! Because only "+this.Account_Balance+"Rs. in your account");

        }
        else {
            this.Account_Balance-=WithdrawedMoney;
            System.out.println(WithdrawedMoney+" Rs. successfully Withdraw from your account! Total balance is: "+this.Account_Balance);

        }
    }
}
