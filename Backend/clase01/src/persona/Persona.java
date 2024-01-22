package persona;

import java.time.LocalDate;



public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private Integer edad = 18;
    private LocalDate fechaActual = LocalDate.now();
    private LocalDate fechaDeNacimiento;

    public Persona(String apellido, String nombre) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public Persona(Integer edad, LocalDate fechaActual, LocalDate fechaDeNacimiento) {
        this.edad = edad;
        this.fechaActual = fechaActual;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public LocalDate getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        this.fechaActual = fechaActual;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   public boolean esNombreCompleto(){
     String nombreCompleto = getApellido() + getNombre();
     return this.esNombreCompleto();
   }
    public boolean esMayorDeEdad(){
        return this.edad > 18 && this.fechaActual.equals(LocalDate.now()) && this.fechaDeNacimiento.isBefore(LocalDate.of(2006,1,17));
    }

}
