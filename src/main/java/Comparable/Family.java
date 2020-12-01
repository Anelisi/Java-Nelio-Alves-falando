package Comparable;

public class Family implements Comparable <Family> {

    private String name;
    private Integer number;

    public Family() {    }

    public Family(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public int compareTo(Family o) {
        // return name.compareTo(o.getName()); // para ordenar por nome
        //return number.compareTo(o.getNumber()); // para ordenar por number
        return -number.compareTo(o.getNumber());// para ordem decrescente
    }
}
