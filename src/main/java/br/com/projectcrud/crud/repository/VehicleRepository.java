package br.com.projectcrud.crud.repository;

import br.com.projectcrud.crud.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Long> {



}
