package bean.repository;

public class A7 {
    private int a71;
    private String a72, a73, a77;
    private double a74;
    private int a75;
    private int a76;
    /**
    * @Description: 构造器 全有和只有三个必填
    **/
    public A7(String a72, String a73, double a74, int a75, int a76, String a77) {
        this.a71 = a71;
        this.a72 = a72;
        this.a73 = a73;
        this.a77 = a77;
        this.a74 = a74;
        this.a75 = a75;
        this.a76 = a76;
    }
    public A7(int a71, String a72, String a73, double a74, int a75, int a76, String a77) {
        this.a71 = a71;
        this.a72 = a72;
        this.a73 = a73;
        this.a77 = a77;
        this.a74 = a74;
        this.a75 = a75;
        this.a76 = a76;
    }

    public A7(String a72, String a73, int a75) {
        this.a72 = a72;
        this.a73 = a73;
        this.a75 = a75;
    }

    public A7(String a72, String a73) {
        this.a71 = a71;
        this.a72 = a72;
        this.a73 = a73;
    }
    public A7(int a71, String a72, String a73) {
        this.a71 = a71;
        this.a72 = a72;
        this.a73 = a73;
    }

    @Override
    public String toString() {
        return "A7{" +
                "a71='" + a71 +
                ", a72='" + a72 + '\'' +
                ", a73='" + a73 + '\'' +
                ", a74=" + a74 +
                ", a75=" + a75 +
                ", a76=" + a76 +
                ", a77='" + a77 + '\'' +
                '}';
    }

    /**
    * @Description: set get
    **/
    public int getA71() {
        return a71;
    }

    public void setA71(int a71) {
        this.a71 = a71;
    }

    public String getA72() {
        return a72;
    }

    public void setA72(String a72) {
        this.a72 = a72;
    }

    public String getA73() {
        return a73;
    }

    public void setA73(String a73) {
        this.a73 = a73;
    }

    public String getA77() {
        return a77;
    }

    public void setA77(String a77) {
        this.a77 = a77;
    }

    public double getA74() {
        return a74;
    }

    public void setA74(double a74) {
        this.a74 = a74;
    }

    public int getA75() {
        return a75;
    }

    public void setA75(int a75) {
        this.a75 = a75;
    }

    public int getA76() {
        return a76;
    }

    public void setA76(int a76) {
        this.a76 = a76;
    }
}

