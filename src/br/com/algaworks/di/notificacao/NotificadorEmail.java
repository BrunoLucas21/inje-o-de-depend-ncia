package br.com.algaworks.di.notificacao;

import br.com.algaworks.di.model.Client;

public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Client client, String mensagem) { 
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				client.getName(), client.getEmail(), mensagem);
	}
}
