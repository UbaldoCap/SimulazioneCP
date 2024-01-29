public class Head extends Employee{
    private Integer yearsAsHead;

    public Head(Integer id, String name, Float efficiencyIndex, Integer yearsAsHead) {
        super(id, name, efficiencyIndex);
        this.yearsAsHead = yearsAsHead;
    }

    public Integer getYearsAsHead() {
        return yearsAsHead;
    }

    public void setYearsAsHead(Integer yearsAsHead) {
        this.yearsAsHead = yearsAsHead;
    }

    @Override
    public boolean canApplyForPromotion() {
        return false;
    }

    @Override
    public boolean mayBeDemoted() {
        return yearsAsHead < 10 && getEfficiencyIndex() > 0.5;
    }

    @Override
    public String toString() {
        return "Head{" +
                "yearsAsHead=" + yearsAsHead +
                '}';
    }
    public void stampaDettagli() {
        System.out.println(getId() + " " + getName());
    }
}
