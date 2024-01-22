package Personal;

public class Profesor extends Personal{
    private Integer numeroLegajo;
    private String titulo;
    private Integer aniosDeAntiguedad;

    public Profesor(Integer numeroLegajo) {
        super(numeroLegajo);
        this.numeroLegajo=numeroLegajo;


    }

    public void darClases(){
        System.out.println("Dictan clases");
    }


    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    @Override
    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAniosDeAntiguedad() {
        return aniosDeAntiguedad;
    }

    public void setAniosDeAntiguedad(Integer aniosDeAntiguedad) {
        this.aniosDeAntiguedad = aniosDeAntiguedad;
    }
}

