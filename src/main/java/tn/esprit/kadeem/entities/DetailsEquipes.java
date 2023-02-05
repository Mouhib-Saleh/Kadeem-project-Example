package tn.esprit.kadeem.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailsEquipes implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long idDetailsEquipes;
    private int Salle ;
    private String thematique;
    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;

}
