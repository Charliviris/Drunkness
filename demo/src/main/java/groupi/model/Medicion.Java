package GroupI.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Medicion {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private double nivelAlcohol;
private double peso;
private String sexo;


private LocalDateTime fechaHora;


public Medicion() {}


public Medicion(double nivelAlcohol, double peso, String sexo) {
this.nivelAlcohol = nivelAlcohol;
this.peso = peso;
this.sexo = sexo;
this.fechaHora = LocalDateTime.now();
}


public Long getId() { return id; }

public double getNivelAlcohol() { return nivelAlcohol; }
public void setNivelAlcohol(double nivelAlcohol) { this.nivelAlcohol = nivelAlcohol; }

public double getPeso() { return peso; }
public void setPeso(double peso) { this.peso = peso; }

public String getSexo() { return sexo; }
public void setSexo(String sexo) { this.sexo = sexo; }

public LocalDateTime getFechaHora() { return fechaHora; }
}