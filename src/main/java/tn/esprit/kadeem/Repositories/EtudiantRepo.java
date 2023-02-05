package tn.esprit.kadeem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kadeem.entities.Departement;
import tn.esprit.kadeem.entities.Equipe;
import tn.esprit.kadeem.entities.Etudiant;

import java.util.List;

public interface EtudiantRepo extends JpaRepository<Etudiant, Long> {

    public List<Etudiant> getEtudiantsByDepartement(Departement D);


}
