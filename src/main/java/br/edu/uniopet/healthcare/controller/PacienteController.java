package br.edu.uniopet.healthcare.controller;

import br.edu.uniopet.healthcare.model.Paciente;
import br.edu.uniopet.healthcare.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class PacienteController {

    @Autowired //autorizar a controller usar a service
    private PacienteService pacienteService;

    @PostMapping("/paciente/create")
    public Paciente create(@RequestBody Paciente paciente){
        return pacienteService.createPaciente(paciente);
    }

    @GetMapping("/paciente/lista")
    public List<Paciente> findByLista(){
        return pacienteService.findAll();
    }

    @GetMapping("/paciente/{id}")
    public Paciente findById(@PathVariable Integer id){ //camimnho da variavel, no caso o id
        return  pacienteService.getById(id);
    }

    @PostMapping("/paciente/nome")
    public Paciente findByFisrtName(@RequestBody String firstName){
        return pacienteService.findByFirstName(firstName);
    }

    @PostMapping("/paciente/sobrenome")
    public Paciente findByLastName(@RequestBody String lastName){
        return pacienteService.findByLastName(lastName);
    }

    @PostMapping("/paciente/nascimento")
    public Paciente findByDataNasc(@RequestBody Date dataNasc){
        return pacienteService.findByDataNasc(dataNasc);
    }

    @PostMapping("paciente/convenio")
    public Paciente findByConvenio(@RequestBody String convenio){
        return pacienteService.findByConvenio(convenio);
    }

}
