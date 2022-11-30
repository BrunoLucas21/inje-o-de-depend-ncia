package br.com.algaworks.di.notificacao;

import br.com.algaworks.di.model.Client;

public interface Notificador {

	public void notificar(Client client, String mensagem);
}
