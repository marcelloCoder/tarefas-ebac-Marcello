package br.com.ebac.primeiro.testes2;

public class ClienteService {
	
	private IClienteDao clienteDao;
	
	public ClienteService(IClienteDao clienteDao) {
		//clienteDao = new ClienteDao();
		//clienteDao = new ClienteDaoMock();
		this.clienteDao = clienteDao;
	}
	
	public String salvar() {
		clienteDao.salvar();
		return "Sucesso";
	}

}
