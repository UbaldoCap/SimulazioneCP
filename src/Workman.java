public class Workman extends Employee{
    private Integer weeklyWorkingHours;

    public Workman(Integer id, String name, Float efficiencyIndex, Integer weeklyWorkingHours) {
        super(id, name, efficiencyIndex);
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    public Integer getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    public void setWeeklyWorkingHours(Integer weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    @Override
    public boolean canApplyForPromotion() {
        return weeklyWorkingHours > 35 && getEfficiencyIndex() > 0.65;
    }

    @Override
    public boolean mayBeDemoted() {
        return false;
    }

    @Override
    public String toString() {
        return "Workman{" +
                "weeklyWorkingHours=" + weeklyWorkingHours +
                '}';
    }
    public void stampaDettagli() {
        System.out.println(getId() + " " + getName());
    }
}
