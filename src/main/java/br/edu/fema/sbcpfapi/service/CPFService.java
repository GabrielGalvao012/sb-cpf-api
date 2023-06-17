package br.edu.fema.sbcpfapi.service;

import org.springframework.stereotype.Service;

@Service
public class CPFService {
    public String validar(String cpf) {
        if (cpf.length() == 11) {


        int soma = 0;
        int soma2 = 0;
        int primeiroDigito;
        int segundoDigito;
        for (int i = 0; i < 9; i++) {
            int number = Integer.parseInt(cpf.substring(i, i + 1));
            number = number * (10 - i);
            soma = soma + number;
        }

        for (int i = 0; i < 10; i++) {
            int number2 = Integer.parseInt(cpf.substring(i, i + 1));
            number2 = number2 * (11 - i);
            soma2 = soma2 + number2;
        }


        if (soma % 11 < 2) {
            primeiroDigito = 0;
        } else primeiroDigito = 11 - (soma % 11);

        if (soma2 % 11 < 2) {
            segundoDigito = 0;
        } else segundoDigito = 11 - (soma2 % 11);

        return cpf + " validado";
        } else return " Tamanho Invalido";
    }

    public static void main(String[] args) {
        new CPFService().validar("49316806828");

    }
}
