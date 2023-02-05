package tn.esprit.kadeem.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Departement implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long idDepartement;
    private String nomDepartement ;

    @OneToMany(mappedBy="departement",cascade =CascadeType.ALL)
    private List<Etudiant> etudiant;
}
