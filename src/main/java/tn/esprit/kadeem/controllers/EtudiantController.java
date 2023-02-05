package tn.esprit.kadeem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.kadeem.entities.Etudiant;
import tn.esprit.kadeem.services.Etudiant.EtudiantImp;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
    EtudiantImp service;
    @RequestMapping(value = "/addEtudiant",method = RequestMethod.POST)
    public Etudiant AjouterEtudiant(@RequestBody Etudiant etudiant) throws Exception {
        try {
            return service.addEtudiant(etudiant);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @RequestMapping(value = "/assignEtudiantToDepartement",method = RequestMethod.POST)
    public void assignEtudiantToDepartement( long etudiantid, long departementid) throws Exception {
        try {
           service.assignEtudiantToDepartement(etudiantid,departementid);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @RequestMapping(value = "/getEtudiantByDepartement",method = RequestMethod.GET)
    public List<Etudiant> getEtudiantByDepartement(long departementid) throws Exception {
        try {
           return service.getEtudiantByDepartement(departementid);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Scheduled(fixedRate = 100000)
    public String count() throws Exception {
        System.out.println("hello");
        return ("hi");
    }
}
