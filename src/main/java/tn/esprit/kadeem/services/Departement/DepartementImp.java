package tn.esprit.kadeem.services.Departement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kadeem.Repositories.DepartementRepo;
import tn.esprit.kadeem.Repositories.EquipeRepo;
import tn.esprit.kadeem.entities.Departement;
import tn.esprit.kadeem.services.Equipe.EquipeInterface;

import java.util.List;

@Service
public class DepartementImp implements DepartementInt {
    @Autowired
    DepartementRepo repo;

    @Override
    public List<Departement> retrieveAllDepartement() throws Exception {
        return repo.findAll();
    }

    @Override
    public Departement addDepartement(Departement E) throws Exception {
        return repo.save(E);
    }

    @Override
    public Departement updateDepartement(Departement E) throws Exception {
        return repo.save(E);
    }

    @Override
    public Departement retrieveDepartement(long idDepartement) throws Exception {
        return repo.findById(idDepartement).get();
    }
}
