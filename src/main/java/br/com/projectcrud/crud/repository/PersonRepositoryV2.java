package br.com.projectcrud.crud.repository;

import br.com.projectcrud.crud.model.PersonModelV2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositoryV2 extends JpaRepository<PersonModelV2, Long> {

}

