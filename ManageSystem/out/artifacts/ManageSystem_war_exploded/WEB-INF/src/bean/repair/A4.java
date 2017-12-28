package bean.repair;

import java.sql.Date;

public class A4 {
    private int a41, a42;
    private String a43, a44;
    private Date a45;
    private int a46;
    private String a47 , a48,a49;

    public A4(int a41, String a48) {
        this.a41 = a41;
        this.a48 = a48;
    }

    public A4(int a41, int a42, String a43, String a44, Date a45, int a46, String a47, String a48, String a49) {
        this.a41 = a41;
        this.a42 = a42;
        this.a43 = a43;
        this.a44 = a44;
        this.a45 = a45;
        this.a46 = a46;
        this.a47 = a47;
        this.a48 = a48;
        this.a49 = a49;
    }

    public int getA41() {
        return a41;
    }

    public void setA41(int a41) {
        this.a41 = a41;
    }

    public int getA42() {
        return a42;
    }

    public void setA42(int a42) {
        this.a42 = a42;
    }

    public String getA43() {
        return a43;
    }

    public void setA43(String a43) {
        this.a43 = a43;
    }

    public String getA44() {
        return a44;
    }

    public void setA44(String a44) {
        this.a44 = a44;
    }

    public Date getA45() {
        return a45;
    }

    public void setA45(Date a45) {
        this.a45 = a45;
    }

    public int getA46() {
        return a46;
    }

    public void setA46(int a46) {
        this.a46 = a46;
    }

    public String getA47() {
        return a47;
    }

    public void setA47(String a47) {
        this.a47 = a47;
    }

    public String getA48() {
        return a48;
    }

    public void setA48(String a48) {
        this.a48 = a48;
    }

    public String getA49() {
        return a49;
    }

    public void setA49(String a49) {
        this.a49 = a49;
    }

    @Override
    public String toString() {
        return "A4{" +
                "a41=" + a41 +
                ", a42=" + a42 +
                ", a43='" + a43 + '\'' +
                ", a44='" + a44 + '\'' +
                ", a45=" + a45 +
                ", a46=" + a46 +
                ", a47='" + a47 + '\'' +
                ", a48='" + a48 + '\'' +
                ", a49='" + a49 + '\'' +
                '}';
    }
}
