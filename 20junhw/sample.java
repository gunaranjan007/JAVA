class Indianmoney {
    private int rupee, anna, paisa;

    Indianmoney(int rupee, int anna, int paisa) {
        this.rupee = rupee;
        this.anna = anna;
        this.paisa = paisa;
    }

    public int toPaisa() {
        return (rupee * 16 * 12) + (anna * 12) + paisa;
    }

    public static Indianmoney addition(Indianmoney piggy1, Indianmoney piggy2) {

        int totalPaisa = piggy1.toPaisa() + piggy2.toPaisa();

        int totalrupee = totalPaisa / 192;
        int remainingmoney = totalPaisa % 192;
        int totalanna = remainingmoney / 12;
        int finalpaisa = remainingmoney % 12;

       Indianmoney finalpiggy=new Indianmoney(totalrupee,totalanna,finalpaisa);
		return(finalpiggy);
    }

    public void printMoney() {
        System.out.println("The total Money is "
                + rupee + " Rupees "
                + anna + " Anna "
                + paisa + " Paisa");
    }
}

public class sample {
    public static void main(String[] args) {
        Indianmoney piggy1 = new Indianmoney(55, 103, 78);
        Indianmoney piggy2 = new Indianmoney(52, 974, 98);

        Indianmoney result = Indianmoney.addition(piggy1, piggy2);

        result.printMoney();
    }
}