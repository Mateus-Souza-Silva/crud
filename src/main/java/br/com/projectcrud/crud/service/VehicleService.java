package br.com.projectcrud.crud.service;


import br.com.projectcrud.crud.model.PersonModel;
import br.com.projectcrud.crud.model.VehicleModel;
import br.com.projectcrud.crud.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class VehicleService {

    @Autowired
    private VehicleRepository repository;

    public VehicleModel findById(long id) throws Exception{
        return repository.findById(id).orElseThrow(() -> new Exception("Não encontrado"));
    }
    public List<VehicleModel> findAll(){return repository.findAll();}

    public VehicleModel save (VehicleModel vehicle){ return repository.save(vehicle);}
    public VehicleModel update(VehicleModel vehicle) throws Exception{
        VehicleModel v = findById(vehicle.getId());
        v.setCarModel(vehicle.getCarModel());
        v.setCarBrand(vehicle.getCarBrand());
        v.setCarColor(vehicle.getCarColor());
        return repository.save(v);
    }
    public void delete(long id) throws Exception{
        VehicleModel v = findById(id);
        repository.delete(v);
    }
}
