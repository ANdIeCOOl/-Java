class ContactEmployee extends Employee{
    final private static double hourlyPay = 100.00;
    private int contactHour;
    
	
    //implement the constructor
    public ContactEmployee(String nm2, long adh2, int cont){
        super(nm2, adh2,  cont*hourlyPay);
        this.contactHour = cont;
        
        
        
    }
}