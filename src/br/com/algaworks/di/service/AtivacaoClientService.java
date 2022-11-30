package br.com.algaworks.di.service;

import br.com.algaworks.di.model.Client;
import br.com.algaworks.di.notificacao.Notificador;

public class AtivacaoClientService {
	
	private Notificador notificador;
	
	public AtivacaoClientService(Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Client client) {
		client.ativar();
		
		notificador.notificar(client, "Seu cadastro no sistema está ativo!");
	}
}
