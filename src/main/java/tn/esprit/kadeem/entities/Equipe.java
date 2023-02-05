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

public class Equipe implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long idEquipe;
    private String nomEquipe ;
    @Enumerated(EnumType.ORDINAL)
    private Niveau Niveau;
    @OneToOne(cascade =CascadeType.ALL)
    private DetailsEquipes detailEquipe;
}
