/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author X870
 */
class Triangle {

    private final double[] boki = new double[3];
    private short znanyKat;

    public Triangle(double a, double b, double c) throws InstantiationException {
        if (a + b < c || a + c < b || b + c < a) {
            throw new InstantiationException("Z podanych odcinków nie da się"
                    + " stworzyć trójkąta!");
        }
        boki[0] = a;
        boki[1] = b;
        boki[2] = c;
    }

    public Triangle(double a, double b, short angle) throws InstantiationException {
        if (angle >= 180) {
            throw new InstantiationException("Nie można stworzyć trójkąta"
                    + " o podanym kącie!");
        }
        boki[0] = a;
        boki[1] = b;
        znanyKat = angle;
    }

    public int whichIsLongest() {
        int longest = 0;
        for (int i = 1; i < boki.length; i++) {
            if (boki[i] > boki[i - 1]) {
                longest = i;
            }
        }
        System.out.println("Longest index " + longest);
        return longest;
    }

    public double[] getBoki() {
        return boki;
    }

    public short getZnanyKat() {
        return znanyKat;
    }

    public double brakujacyBok() {
        double[] znaneBoki = this.getBoki();
        double a2 = Math.pow(znaneBoki[0], 2);
        double b2 = Math.pow(znaneBoki[1], 2);
        double cos = Math.cos(Math.toRadians(this.getZnanyKat()));
        System.out.println("a2 " + a2 + " b2 " + b2 + " cos " + cos);
        double bok = Math.sqrt(a2 + b2 - (2 * znaneBoki[0] * znaneBoki[1] * cos));
        System.out.println(bok);
        return bok;
    }
}
