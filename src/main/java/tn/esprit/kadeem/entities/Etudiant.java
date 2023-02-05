package tn.esprit.kadeem.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long idEtudiant;
    private String prenomE ;
    private String nomE ;
    @Enumerated(EnumType.ORDINAL)
    private Domaine domaine;
    @ManyToOne(cascade =CascadeType.ALL)
    @JsonIgnore
    private Departement departement;
}
