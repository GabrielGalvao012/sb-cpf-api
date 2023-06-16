package br.edu.fema.sbcpfapi.adapter.in.api;


import br.edu.fema.sbcpfapi.service.CPFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cpf")
public class CpfController {


    @Autowired
    private CPFService service;

    @GetMapping("/{cpf}")
    public String cpf(@PathVariable("cpf") String cpf){
        final String message = service.validar(cpf);
        return message;
    }
}
