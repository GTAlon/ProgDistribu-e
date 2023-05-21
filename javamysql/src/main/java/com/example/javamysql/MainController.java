package com.example.javamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private VehiculeRepository vehiculeRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewVehicule (@RequestParam String marque,
    		@RequestParam String modele, @RequestParam int puissance,
    		@RequestParam String couleur,@RequestParam int siege,@RequestParam float prix) {
        Vehicule v = new Vehicule();
        v.setMarque(marque);
        v.setModele(modele);
        v.setPuissance(puissance);
        v.setCouleur(couleur);
        v.setSiege(siege);
        v.setPrix(prix);
        VehiculeRepository.save(v);
        return "Saved";
    }

    @DeleteMapping(path="/delete")
    public void deleteVehicule  (@RequestParam Integer id) {
        List<Vehicule> vehicules = vehiculeRepository.findById(id);
        if(vehicules.size() != 0){
            Vehicule v = vehicules.get(0);
            vehiculeRepository.delete(v);
        }
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return vehiculeRepository.findAll();
    }
}
