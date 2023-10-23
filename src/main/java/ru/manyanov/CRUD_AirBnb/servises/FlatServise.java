package ru.manyanov.CRUD_AirBnb.servises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.manyanov.CRUD_AirBnb.models.Flat;
import ru.manyanov.CRUD_AirBnb.repositories.FlatRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FlatServise {
    private final FlatRepository flatRepository;

    @Autowired
    public FlatServise(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public List<Flat> findAll(){
        List<Flat> flats = flatRepository.findAll();
        return flats;
    }

    public Flat findById(int id){
       Optional<Flat> flat =  flatRepository.findById(id);
       return flat.orElse(null);
    }

    public void save(Flat flat) {

        flatRepository.save(flat);
    }

    public void delete(int id){
        flatRepository.deleteById(id);
    }

}
