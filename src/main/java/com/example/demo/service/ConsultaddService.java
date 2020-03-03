package com.example.demo.service;

import com.example.demo.model.Consultadd;
import com.example.demo.repository.ConsultaddRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ConsultaddService {

    @Autowired
    ConsultaddRepository consultaddRepository;


    public void addName(Consultadd consultadd) {
        consultaddRepository.save(consultadd);
    }

    public List<Consultadd> getName() {
        return  consultaddRepository.findAll();
    }

    public Consultadd getById(long id) {
            return consultaddRepository.findById(id).get();
    }

    public void updateConsultant(long id,Consultadd consultaddDetail) {
        Consultadd consultadd = consultaddRepository.findById(id).get();
        consultadd = consultaddDetail;
    }

    public void delete(long id) {
        consultaddRepository.deleteById(id);
    }

    public Object retrivealldata(Consultadd consultadd) {
        addName(consultadd);
        return consultadd;
    }
}
