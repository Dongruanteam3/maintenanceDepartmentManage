package bean.repository;

public class NameTypeNumber {
    private String  name;
    private String type;
    private int number;

    public NameTypeNumber(String name, String type, int number) {
        this.name = name;
        this.type = type;
        this.number = number;
    }

    public NameTypeNumber() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NameTypeNumber{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}
