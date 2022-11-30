package br.com.algaworks.di.notificacao;

import br.com.algaworks.di.model.Client;

public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Client client, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", 
				client.getName(), client.getPhone(), mensagem);
	}
}
