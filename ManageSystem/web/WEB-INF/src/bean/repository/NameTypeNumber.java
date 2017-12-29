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
        return name+" "+type+"*"+number+";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NameTypeNumber)) return false;

        NameTypeNumber that = (NameTypeNumber) o;

        if (getNumber() != that.getNumber()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getType() != null ? getType().equals(that.getType()) : that.getType() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + getNumber();
        return result;
    }
}
