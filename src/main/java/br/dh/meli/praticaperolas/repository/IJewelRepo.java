package br.dh.meli.praticaperolas.repository;

import br.dh.meli.praticaperolas.model.Jewelry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJewelRepo extends CrudRepository<Jewelry, Long> {
}
