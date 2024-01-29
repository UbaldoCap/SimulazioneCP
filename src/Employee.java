public abstract class Employee {
    private Integer id;
    private String name;
    private Float efficiencyIndex;

    public Employee(Integer id, String name, Float efficiencyIndex) {
        this.id = id;
        this.name = name;
        this.efficiencyIndex = efficiencyIndex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getEfficiencyIndex() {
        return efficiencyIndex;
    }

    public void setEfficiencyIndex(Float efficiencyIndex) {
        this.efficiencyIndex = efficiencyIndex;
    }

    public abstract boolean canApplyForPromotion();
    public abstract boolean mayBeDemoted();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", efficiencyIndex=" + efficiencyIndex +
                '}';
    }
}
