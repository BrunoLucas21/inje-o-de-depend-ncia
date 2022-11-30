package br.com.algaworks.di;

import br.com.algaworks.di.model.Client;
import br.com.algaworks.di.notificacao.Notificador;
import br.com.algaworks.di.notificacao.NotificadorSMS;
import br.com.algaworks.di.service.AtivacaoClientService;

public class Main {

	public static void main(String[] args) {
		Client joao = new Client("João", "joão@xyz.com", "(89) 97777-8888");
		Client maria = new Client("Maria", "maria@xyz.com", "(89) 99999-6666");
		
		Notificador notificador = new NotificadorSMS();
		
		AtivacaoClientService ativacaoClient = new AtivacaoClientService(notificador);
		ativacaoClient.ativar(joao);
		ativacaoClient.ativar(maria);
		
		
	}

}
