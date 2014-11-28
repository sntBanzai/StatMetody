import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author X870
 */
public class StatMetody {

    public static Grupa zadanie1() {
        Grupa[] tab = new Grupa[5];
        for (int i = 0; i < 5; i++) {
            int realIndex = i + 1;
            tab[i] = new Grupa("Grupa " + realIndex);
        }
        int highestUId = 0;
        Grupa toReturn = null;
        for (Grupa g : tab) {
            if (g.uid > highestUId) {
                highestUId = g.uid;
                toReturn = g;
            }
        }
        return toReturn;
    }

    public static boolean czyPitagorejski(Triangle t) {
        double[] boki = t.getBoki();
        if (boki[2] == 0.0) {
            boki[2] = t.brakujacyBok();
        }
        int index = t.whichIsLongest();
        double przekatna = Math.round(boki[0]);
        double prost1 = Math.round(boki[1]);
        double prost2 = Math.round(boki[2]);
        if (index == 1) {
            przekatna = Math.round(boki[1]);
            prost1 = Math.round(boki[0]);
            prost2 = Math.round(boki[2]);
        } else if (index == 2) {
            przekatna = Math.round(boki[2]);
            prost1 = Math.round(boki[0]);
            prost2 = Math.round(boki[1]);
        }
        return Math.pow(przekatna, 2) == Math.pow(prost1, 2) + Math.pow(prost2, 2);
    }

    static int[] tabLosowych(int maxIndex) {
        Random r = new Random();
        int[] toReturn = new int[maxIndex];
        for (int i = 0; i < maxIndex; i++) {
            toReturn[i] = r.nextInt();
            System.out.println("Wartość " + i + " = " + toReturn[i]);
        }
        return toReturn;
    }

    static int getMax(int[] tab) {
        int toReturn = tab[0];
        for (int i = 1; i < tab.length; i++) {
            toReturn = Math.max(tab[i], toReturn);
        }
        return toReturn;
    }

    static int getMin(int[] tab) {
        int toReturn = tab[0];
        for (int i = 1; i < tab.length; i++) {
            toReturn = Math.min(tab[i], toReturn);
        }
        return toReturn;
    }

    static int getAvg(int[] tab) {
        int sum = 0;
        int avg;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        avg = sum / tab.length;
        return avg;
    }

    static long getSum(int[] tab) {
        long sum = 0L;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }

    static int[] getAbs(int[] tab) {
        int[] toReturn = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            toReturn[i] = Math.abs(tab[i]);
        }
        return toReturn;
    }

    static String obliczPole(Triangle t) {
        double[] boki = t.getBoki();
        double a = boki[0];
        double b = boki[1];
        if (boki[2] == 0.0) {
            boki[2] = t.brakujacyBok();
        }
        double c = boki[2];
        double p = 0.5 * (a + b + c);
        return "Pole wynosi " + Math.sqrt((p * (p - a) * (p - b) * (p - c))) + "cm2";
    }
    
    static String wyliczPierw(double a, double b, double c){
        String output;
        double delta = Math.pow(b, 2)-(4*a*c);
        if(delta<+0.0){
            output = "Wynik nie mieści się w obszarze liczb rzeczywistych.";
        }
        else if(delta==+0.0){
            double pierw = (-1*b)/(2*a);
            output = "Dla niniejszego równania występuje jeden pierwiastek, "
                    + "mianowicie " + pierw ;
        }
        else{
            double pierw1= ((-1*b)-Math.sqrt(delta))/(2*a);
            double pierw2= ((-1*b)+Math.sqrt(delta))/(2*a);
            output = "Niniejsze równanie posiada dwa pierwiastki o wartościach"
                    + " odpowiednio "+pierw1+" oraz "+pierw2;
        }
        return output;
    }
    
}

