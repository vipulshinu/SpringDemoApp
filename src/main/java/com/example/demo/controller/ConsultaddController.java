package com.example.demo.controller;


import com.example.demo.model.Consultadd;
import com.example.demo.service.ConsultaddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ConsultaddController {

    @Autowired
    private ConsultaddService consultaddService;



    @GetMapping("/call")
    public List<Consultadd> getCall(){
        List<Consultadd> l = getName();
        return l;
    }

    @GetMapping("/name")
    public List<Consultadd> getName()
    {
            return  consultaddService.getName();
    }
    @PostMapping("/name")
    public String addName(@Valid @RequestBody Consultadd consultadd)
    {
        consultaddService.addName(consultadd);
        return  "Post Data Successfully";
    }

    @GetMapping("/name/{id}")
    public Consultadd getById(@PathVariable(value="id")long id)
    {
        return consultaddService.getById(id);
    }

    @PutMapping("/update/{id}")
    public String updateConsultant(@PathVariable(value="id")long id,@Valid @RequestBody Consultadd consultadd )
    {
        consultaddService.updateConsultant(id,consultadd);
        return "yes";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable(value="id")long id)
    {
        consultaddService.delete(id);
        return "yes";
    }


}
