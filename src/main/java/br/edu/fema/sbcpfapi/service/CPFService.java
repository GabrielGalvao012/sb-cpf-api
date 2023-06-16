package br.edu.fema.sbcpfapi.service;

import org.springframework.stereotype.Service;

@Service
public class CPFService {
    public String validar(String cpf){


        return cpf + " validado";
    }
}
