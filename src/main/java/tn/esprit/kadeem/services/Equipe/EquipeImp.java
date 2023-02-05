package tn.esprit.kadeem.services.Equipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.kadeem.Repositories.EquipeRepo;
import tn.esprit.kadeem.entities.Equipe;

import java.util.List;
@Service
public class EquipeImp implements EquipeInterface{
    @Autowired
    EquipeRepo repo;

    @Override
    public List<Equipe> retrieveAllEquipes() throws Exception {
        return repo.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe E) throws Exception {
        return repo.save(E);
    }

    @Override
    public Equipe updateEquipe(Equipe E) throws Exception {
        return repo.save(E);
    }

    @Override
    public Equipe retrieveEquipe(long idEquipe) throws Exception {
        return repo.findById(idEquipe).get();
    }
}
