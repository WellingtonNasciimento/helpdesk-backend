package com.wdsystems.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wdsystems.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
