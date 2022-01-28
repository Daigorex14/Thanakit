package nvc.bcit.icefactory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.bcit.icefactory.model.Factory;
import nvc.bcit.icefactory.repository.FactoryRepositoy;

@Service
public class FactoryService {

    @Autowired
    FactoryRepositoy factoryRepositoy;

    public List<Factory> findAll(){
        return factoryRepositoy.findAll();
    }

    public Factory getById(int id){
        return factoryRepositoy.getById(id);
    }
}
