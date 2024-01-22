package Personal;

public abstract class Personal {
    private Integer numeroLegajo;

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Personal(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public abstract void setNumeroLegajo(Integer numeroLegajo);


}