package org.example.persona.entities;

import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;
import org.hibernate.envers.Audited;


import java.util.Date;

@Entity
@Table(name="libro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited


public class Libro extends Base{
@Column(name = "titulo")
private String titulo;

@Column(name = "fecha")
private int fecha;

@Column(name = "genero")
private String genero;

@Column(name = "paginas")
    private int paginas;


 @ManyToMany(cascade= CascadeType.REFRESH)
 private List<Autor> autores;

}


