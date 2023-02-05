package tn.esprit.kadeem.services.Equipe;

import tn.esprit.kadeem.entities.Equipe;

import java.util.List;

public interface EquipeInterface {
    public List<Equipe> retrieveAllEquipes () throws Exception;
    public Equipe addEquipe (Equipe E) throws Exception;
    public Equipe updateEquipe (Equipe E) throws Exception;
    public Equipe retrieveEquipe (long idEquipe) throws Exception;

}
