package br.dh.meli.praticaperolas.controller;

import br.dh.meli.praticaperolas.model.Jewelry;
import br.dh.meli.praticaperolas.service.JewelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jewelry")
public class JewelController {

    @Autowired
    private JewelService jewelService;

//    @PostMapping("/register")
//    public ResponseEntity<Property> registerProperty(@RequestBody @Valid PropertyRequest property){
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(propertyService.createProperty(property));
//    }

    @PostMapping("/register")
    public ResponseEntity<Jewelry> registerJewelry(@RequestBody Jewelry jewelry){
        return ResponseEntity.status(HttpStatus.CREATED).body(jewelService.registerJewelry(jewelry));
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<Jewelry>> getAllJewelry(){
        List<Jewelry> listJewelry = jewelService.getAllJewelry();

        return ResponseEntity.ok(listJewelry);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteJewelry(@PathVariable Long id){
        jewelService.deleteJewelry(id);

    }


    //@PutMapping


}
