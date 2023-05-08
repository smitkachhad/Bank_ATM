package Banking_Project_Smit;

//field ==> Customer name,account number,email,balance,phone number.
//Functionality ==> deposit money, withdraw money.



public class Main_Class {
    public static void main(String[] args) {

        Account_Details smit=new Account_Details("smit kachhad","8562358962","smit@gmail.com",500,"7567114141");


        smit.DepositMoney(100);
        System.out.println("-------------------------------------------------------------");

        smit.WithdrawMoney(700);
        System.out.println("-------------------------------------------------------------");

        smit.DepositMoney(200);
        System.out.println("-------------------------------------------------------------");

        smit.WithdrawMoney(100);
        System.out.println("-------------------------------------------------------------");



    }
}
