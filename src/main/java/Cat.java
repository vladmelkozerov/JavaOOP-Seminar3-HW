public class Cat implements Comparable<Cat> {
    protected String name;
    protected Double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Cat(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Кличка= " + name  +
                ", Вес= " + weight + " кг.";
    }

    @Override
    public int compareTo(Cat cat) {
        if (weight == cat.weight) return 0;
        else if (weight > cat.weight) return 1;
        else return -1;
    }
}

