package main;

import java.util.Calendar;


public class Main
{

    public static void main(String args[])
    {
        Payment payment = new Payment();

        Controller controller = new Controller();

        payment.setAmount(1);
        payment.setPack("Pacote Básico");
        payment.setPhoneNumber("258848131298");
        payment.setReference("sdhsdsfs");

        if (controller.doPayment(payment.getPhoneNumber(), Double.toString(payment.getAmount()), payment.getPack(), payment.getReference()) == true)
        {
            System.out.println("Sucesso \n" + Calendar.getInstance().getTimeInMillis());

        }

    }
}
