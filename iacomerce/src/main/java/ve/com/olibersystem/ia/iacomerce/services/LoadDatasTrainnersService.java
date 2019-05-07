package ve.com.olibersystem.ia.iacomerce.services;

public interface LoadDatasTrainnersService {

	/**
	 * hace el monitoreo de las operaciones de yahoo
	 */
	void executeAsynchronouslYahoo();
	/**
	 * hace el monitoreo de las operaciones de etoro
	 */
	void executeAsynchronouslyEtoro();

	/**
	 * Se encarga de leer los datos base de los traininers y cargarlos a la bd
	 */
	void executeLoadData();

}
