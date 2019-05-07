package ar.com.redlink.configurador.service.impl;

import java.util.ArrayList;
import java.util.List;

import ar.com.redlink.configurador.dto.EntidadDTO;
import ar.com.redlink.configurador.service.EntidadesService;

public class EntidadesServiceImpl implements EntidadesService {

	@Override
	public EntidadDTO listadoEntidades() {
		try {
			List<EntidadDTO> entidadesDTO = new ArrayList<EntidadDTO>();
			List<Entidad> entidades = this.entidadDAO.getEntidades();
			for(Entidad entidad : entidades) {
				EntidadDTO dto = ManualMapper.entidadMapper(entidad);
				entidadesDTO.add(dto);
			}
			return entidadesDTO;
		}
		catch(Exception e) {
			RedLinkServiceException ex = new RedLinkServiceException("Hubo un error en la obtencion de las entidades habilitadas", e);
			LOGGER.error("Hubo un error en la obtencion de las entidades habilitadas", ex);
			throw ex;
		}
	}

}
