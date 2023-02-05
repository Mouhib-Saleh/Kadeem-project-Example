package tn.esprit.kadeem.services.Etudiant;

import tn.esprit.kadeem.entities.Etudiant;

import java.util.List;

public interface EtudiantInt {
    public List<Etudiant> retrieveAllEtudiant () throws Exception;
    public Etudiant addEtudiant (Etudiant E) throws Exception;
    public Etudiant updateEtudiant (Etudiant E) throws Exception;
    public Etudiant retrieveEtudiant (long idEtudiant) throws Exception;
    public void assignEtudiantToDepartement (long etudiantid , long departementid);
    public List<Etudiant> getEtudiantByDepartement(long idDepartement);

}
