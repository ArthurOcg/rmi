package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class Dicionario extends UnicastRemoteObject implements IDicionario{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, String> dicionario = new HashMap<>();

	protected Dicionario() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String buscar(String palavra) throws RemoteException {
		if(dicionario.containsKey(palavra)) {
			return (String) dicionario.get(palavra);
		}else throw new RemoteException("Não existe a palavra buscada!");
	}

	@Override
	public void inserir(String palavra, String significado) throws RemoteException {
		dicionario.put(palavra, significado);
		
	}

}
