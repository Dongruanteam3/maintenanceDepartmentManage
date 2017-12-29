package bean.repository;

import java.sql.Date;

public class A5 {
    private int a51;
    private String a52,a53;
    private int a54;
    private int a55;
    private double a56;
    private Date a57;

    public A5(String a52, String a53, int a54, int a55, double a56, Date a57) {
        this.a52 = a52;
        this.a53 = a53;
        this.a54 = a54;
        this.a55 = a55;
        this.a56 = a56;
        this.a57 = a57;
    }

    @Override
    public String toString() {
        return "A5{" +
                "a51=" + a51 +
                ", a52='" + a52 + '\'' +
                ", a53='" + a53 + '\'' +
                ", a54=" + a54 +
                ", a55=" + a55 +
                ", a56=" + a56 +
                ", a57=" + a57 +
                '}';
    }

    public int getA51() {
        return a51;
    }

    public void setA51(int a51) {
        this.a51 = a51;
    }

    public String getA52() {
        return a52;
    }

    public void setA52(String a52) {
        this.a52 = a52;
    }

    public String getA53() {
        return a53;
    }

    public void setA53(String a53) {
        this.a53 = a53;
    }

    public int getA54() {
        return a54;
    }

    public void setA54(int a54) {
        this.a54 = a54;
    }

    public int getA55() {
        return a55;
    }

    public void setA55(int a55) {
        this.a55 = a55;
    }

    public double getA56() {
        return a56;
    }

    public void setA56(double a56) {
        this.a56 = a56;
    }

    public Date getA57() {
        return a57;
    }

    public void setA57(Date a57) {
        this.a57 = a57;
    }
}
