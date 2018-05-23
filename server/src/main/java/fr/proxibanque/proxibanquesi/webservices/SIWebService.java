package fr.proxibanque.proxibanquesi.webservices;

import java.util.List;

import fr.proxibanque.proxibanquesi.exceptions.ServiceException;
import fr.proxibanque.proxibanquesi.model.Client;

public interface SIWebService {

	public void VirementCompteACompte(long numCompteDepart, long numCompteArrivee, double montantTransfere) throws ServiceException;
	
	public void CrediterCompte(long numeroCompte, double montant);

	List<Client> auditerAgence();

}
