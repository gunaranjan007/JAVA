class Indianmoney {
    private int rupee, anna, paisa;

    Indianmoney(int rupee, int anna, int paisa) {
        this.rupee = rupee;
        this.anna = anna;
        this.paisa = paisa;
    }                        
    public int toPaisa()
	{ // Convert the rupee,anna,paisa to  total paisa
        int totalpaisa=(rupee * 16 * 12) + anna * 12 + paisa;
		
		return(totalpaisa);
    }
	public Indianmoney moneyconversion(int dtotalpaisa)
	{	
        int  totalrupee=(int)(dtotalpaisa/(12*16)); //410/192=2.(something)
		int remainingmoney=dtotalpaisa-(totalrupee*192);//410-2*192=26
		int totalanna=(int)(remainingmoney /12);//26/2=2
		int finalpaisa=dtotalpaisa-(totalrupee*192)-(totalanna*12);//410-192*2-2*12=2
		
		
		return new Indianmoney(totalrupee,totalanna,finalpaisa);

	}
    public static Indianmoney addition(Indianmoney piggy1, Indianmoney piggy2)
	{//getting parameter (function) 
		
        int totalpaisa = piggy1.toPaisa() + piggy2.toPaisa();
		
		Indianmoney temp = new Indianmoney(0,0,0);//Creating temperory object and then reassign with obtainig values

        Indianmoney finalpiggy =temp.moneyconversion(totalpaisa);
		
		return(finalpiggy);

    }
	public  void printmoney()//only to print the money 
	{
		System.out.print("THE TOTAL ADDED MONEY ARE "+rupee+" Rupees "+anna+" Anna "+paisa+" Paisa ");
	}

}//class Indianmoney ends

public class rupeeaddition {
    public static void main(String[] args) {

        Indianmoney piggy1 = new Indianmoney(55, 103, 78);
        Indianmoney piggy2 = new Indianmoney(52, 974, 98);

       Indianmoney piggy3= Indianmoney.addition(piggy1, piggy2);
	   
	   piggy3.printmoney();
	   
	   
	
    }
}//public class ends