package ve.com.olibersystem.ia.iacomerce.event;

import java.util.EventListener;

import ve.com.olibersystem.ia.iacomerce.base.Valores;

public interface IValoresListener extends EventListener{
	
	public void OnCambioPrecio( Valores symbol);

}
