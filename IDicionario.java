package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IDicionario extends Remote{
	
	
	public String buscar(String palavra) throws RemoteException;
	public void inserir(String palavra, String significado) throws RemoteException;
	
	
	

}
