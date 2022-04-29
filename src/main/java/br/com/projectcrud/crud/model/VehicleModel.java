package br.com.projectcrud.crud.model;

import javax.persistence.*;

@Entity
//entidade do banco de dados - persistente vai gravar dados

@Table( name = "vehicle")

public class VehicleModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "Modelo", nullable = false, length = 40)
    private String CarModel;
    @Column(name = "Marca", nullable = false, length = 40)
    private String CarBrand;
    @Column(name = "Cor", nullable = false, length = 40)
    private String CarColor;

    public VehicleModel() {
    }

    public VehicleModel(long id, String carModel, String carBrand, String carColor) {
        this.id = id;
        CarModel = carModel;
        CarBrand = carBrand;
        CarColor = carColor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }
}
