package Personal;

public class PersonalAdministrativo extends Personal {
    private Integer numeroLegajo;
    private String cargo;

    public void realizarActividades(){
        System.out.println("Realizando alguna actividad administrativa");
    }

    public PersonalAdministrativo(Integer numeroLegajo, String cargo) {
        super(numeroLegajo);
        this.numeroLegajo = numeroLegajo;
        this.cargo = cargo;
    }
    @Override
    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }
    @Override
    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
