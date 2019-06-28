package br.edu.uniopet.healthcare.repository;

import br.edu.uniopet.healthcare.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository //repository é a dao, faz conexao com o banco
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    //busca pelo primeiro nome
    Paciente findByFirstName(String firstName);

    Paciente findByLastName(String lastName);

    Paciente findByDataNasc(Date dataNasc);

    Paciente findByConvenio(String convenio);


}
