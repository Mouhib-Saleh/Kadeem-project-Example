package tn.esprit.kadeem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kadeem.entities.Departement;
import tn.esprit.kadeem.entities.Equipe;

public interface DepartementRepo extends JpaRepository<Departement, Long> {

}
