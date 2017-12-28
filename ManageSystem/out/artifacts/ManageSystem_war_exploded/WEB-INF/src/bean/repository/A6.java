package bean.repository;

import java.sql.Date;

public class A6 {
    private int a61;
    private String a62,a63;
    private int a64;
    private double a65;
    private Date a66;

    public A6(int a61, String a62, String a63, int a64, double a65, Date a66) {
        this.a61 = a61;
        this.a62 = a62;
        this.a63 = a63;
        this.a64 = a64;
        this.a65 = a65;
        this.a66 = a66;
    }

    public A6(String a62, String a63, int a64, double a65, Date a66) {
        this.a62 = a62;
        this.a63 = a63;
        this.a64 = a64;
        this.a65 = a65;
        this.a66 = a66;
    }

    public A6(String a62, String a63, int a64) {
        this.a62 = a62;
        this.a63 = a63;
        this.a64 = a64;
    }

    public A6(int a61, String a62, String a63) {
        this.a61 = a61;
        this.a62 = a62;
        this.a63 = a63;
    }

    public A6(String a62, String a63) {
        this.a62 = a62;
        this.a63 = a63;
    }

    @Override
    public String toString() {
        return "A6{" +
                "a61=" + a61 +
                ", a62='" + a62 + '\'' +
                ", a63='" + a63 + '\'' +
                ", a64=" + a64 +
                ", a65=" + a65 +
                ", a66=" + a66 +
                '}';
    }

    public int getA61() {
        return a61;
    }

    public void setA61(int a61) {
        this.a61 = a61;
    }

    public String getA62() {
        return a62;
    }

    public void setA62(String a62) {
        this.a62 = a62;
    }

    public String getA63() {
        return a63;
    }

    public void setA63(String a63) {
        this.a63 = a63;
    }

    public int getA64() {
        return a64;
    }

    public void setA64(int a64) {
        this.a64 = a64;
    }

    public double getA65() {
        return a65;
    }

    public void setA65(double a65) {
        this.a65 = a65;
    }

    public Date getA66() {
        return a66;
    }

    public void setA66(Date a66) {
        this.a66 = a66;
    }
}
