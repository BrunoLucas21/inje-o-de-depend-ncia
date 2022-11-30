package br.com.algaworks.di.service;

import br.com.algaworks.di.model.Client;
import br.com.algaworks.di.model.Product;
import br.com.algaworks.di.notificacao.NotificadorSMS;

public class EmissaoNotaFiscalService {

	public void emitir(Client client, Product product) {
		// TODO emite a nota fiscal aqui...
		
		NotificadorSMS notificated = new NotificadorSMS();
		notificated.notificar(client, "Nota fiscal do produto " + product.getName() + " foi emitida!");
	}
}
