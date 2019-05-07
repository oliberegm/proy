package ar.com.redlink.configurador.dao;

import org.springframework.data.repository.CrudRepository;

import ar.com.redlink.configurador.entities.Entidad;

public interface EntidadDAO extends CrudRepository<Entidad, Long> {
	
}
