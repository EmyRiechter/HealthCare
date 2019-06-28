package br.edu.uniopet.healthcare.services;

import br.edu.uniopet.healthcare.model.Paciente;
import br.edu.uniopet.healthcare.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PacienteService {


    @Autowired //autoriza a usar a repository
    private PacienteRepository pacienteRepository;
    private Paciente p = new Paciente();

    //salvar paciente
    public Paciente createPaciente(Paciente paciente){
        if(paciente != null){
            p = pacienteRepository.save(paciente);
        }
        return p;
    }

    //retornar lista de pacientes
    public List<Paciente> findAll(){
        return pacienteRepository.findAll();
    }

    //buscar paciente por Id
    public Paciente getById(Integer id){
        if(id != null && id > 0){
            p = pacienteRepository.findById(id).orElseThrow(null); //se ele não existe ou retorna null
        }
        return p;
    }

    //buscar pelo nome do paciente
    public Paciente findByFirstName(String firstName){
        if(firstName != null){
            p = pacienteRepository.findByFirstName(firstName);
        }
        return p;
    }

    //buscar pelo ultimo nome
    public Paciente findByLastName(String lastName){
        if(lastName != null){
            p = pacienteRepository.findByLastName(lastName);
        }
        return p;
    }

    //buscar pela data de nascimento
    public Paciente findByDataNasc(Date dataNasc){
        if(dataNasc != null){
            p = pacienteRepository.findByDataNasc(dataNasc);
        }
        return p;
    }

    //buscar pelo convenio
    public Paciente findByConvenio(String convenio){
        if(convenio != null){
            p = pacienteRepository.findByConvenio(convenio);
        }
        return p;
    }

}
