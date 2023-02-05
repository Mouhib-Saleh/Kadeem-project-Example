package tn.esprit.kadeem.services.Etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kadeem.Repositories.DepartementRepo;
import tn.esprit.kadeem.Repositories.EquipeRepo;
import tn.esprit.kadeem.Repositories.EtudiantRepo;
import tn.esprit.kadeem.entities.Departement;
import tn.esprit.kadeem.entities.Etudiant;
import tn.esprit.kadeem.services.Equipe.EquipeInterface;

import java.util.List;

@Service
public class EtudiantImp implements EtudiantInt {
    @Autowired
    EtudiantRepo repo;
    @Autowired
    DepartementRepo repoDep;

    @Override
    public List<Etudiant> retrieveAllEtudiant() throws Exception {
        return repo.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant E) throws Exception {
        return repo.save(E);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant E) throws Exception {
        return repo.save(E);
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) throws Exception {
        return repo.findById(idEtudiant).get();
    }

    @Override
    public void assignEtudiantToDepartement(long etudiantid, long departementid) {
        Etudiant ed = repo.findById(etudiantid).get();
        Departement dep = repoDep.findById(departementid).get();
        ed.setDepartement(dep);
        repo.save(ed);
    }

    @Override
    public List<Etudiant> getEtudiantByDepartement(long idDepartement) {
      Departement dep = repoDep.findById(idDepartement).get() ;
      return repo.getEtudiantsByDepartement(dep);

    }
}
