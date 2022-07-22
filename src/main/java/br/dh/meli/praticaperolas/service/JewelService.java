package br.dh.meli.praticaperolas.service;

import br.dh.meli.praticaperolas.model.Jewelry;
import br.dh.meli.praticaperolas.repository.IJewelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JewelService {

    @Autowired
    private IJewelRepo jewelRepo;

    public Jewelry registerJewelry(Jewelry jewelry){
        jewelRepo.save(jewelry);
        return jewelry;
    }

    public List<Jewelry> getAllJewelry(){
        return (List<Jewelry>) jewelRepo.findAll();
    }

    public void deleteJewelry(Long id){
        jewelRepo.deleteById(id);
    }


}
