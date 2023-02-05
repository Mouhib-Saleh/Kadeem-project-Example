package tn.esprit.kadeem.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.kadeem.entities.Equipe;
import tn.esprit.kadeem.services.Equipe.EquipeImp;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipe")
public class EquipeController {
    @Autowired
    EquipeImp service;
    @RequestMapping(value = "/addEquipe",method = RequestMethod.POST)
    public Equipe AjouterEquipe(@RequestBody Equipe equipe) throws Exception {
        try {
            return service.addEquipe(equipe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
