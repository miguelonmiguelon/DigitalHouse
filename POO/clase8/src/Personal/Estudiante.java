package Personal;

public class Estudiante extends Personal{
    private Integer numeroLegajo;

    public void estudiar(){
        System.out.println("Los estudiantes se dedican a estudiar");
    }

    public Estudiante(Integer numeroLegajo) {
        super(numeroLegajo);
        this.numeroLegajo = numeroLegajo;
    }
    @Override
    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }


    public String getCargo() {
        return null;
    }


    public void setCargo(String cargo) {

    }
}
