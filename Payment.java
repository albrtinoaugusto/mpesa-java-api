package main;

public class Payment
{

    // A referencia deve ser diferente para cada 
    private String pack;
    private String phoneNumber;
    private String reference;   
    private double amount;

    public Payment(){}

    public Payment(String pack, String phoneNumber, String reference, double amount)
    {
        this.pack = pack;
        this.phoneNumber = phoneNumber;
        this.reference = reference;
        this.amount = amount;
    }

    
    public String getPack()
    {
        return pack;
    }

    
    public void setPack(String pack)
    {
        this.pack = pack;
    }
    

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    
    public String getReference()
    {
        return reference;
    }

    
    public void setReference(String reference)
    {
        this.reference = reference;
    }

    
    public double getAmount()
    {
        return amount;
    }

    
    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    

    @Override
    public String toString()
    {
        return "Pack="      + this.pack + "\n "
             + "Phone="     + this.phoneNumber + "\n"
             + "Reference=" + this.reference + "\n"
             + "Amount="    + amount;
    }

}
