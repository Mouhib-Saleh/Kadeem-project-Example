package tn.esprit.kadeem.services.Departement;

import tn.esprit.kadeem.entities.Departement;
import tn.esprit.kadeem.entities.Equipe;

import java.util.List;

public interface DepartementInt {
    public List<Departement> retrieveAllDepartement () throws Exception;
    public Departement addDepartement (Departement E) throws Exception;
    public Departement updateDepartement (Departement E) throws Exception;
    public Departement retrieveDepartement (long idDepartement) throws Exception;

}
