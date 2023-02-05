package tn.esprit.kadeem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.kadeem.entities.Departement;
import tn.esprit.kadeem.entities.Equipe;
import tn.esprit.kadeem.services.Departement.DepartementImp;
import tn.esprit.kadeem.services.Equipe.EquipeImp;

@RestController
@AllArgsConstructor
@RequestMapping("/Departement")
public class DepartementController {
    @Autowired
    DepartementImp service;
    @RequestMapping(value = "/addDepartement",method = RequestMethod.POST)
    public Departement AjouterEquipe(@RequestBody Departement Departement) throws Exception {
        try {
            return service.addDepartement(Departement);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
