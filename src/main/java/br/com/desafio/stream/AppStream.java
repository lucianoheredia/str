package br.com.desafio.stream;

import br.com.desafio.stream.utils.MensagemEnum;

public class AppStream {
	

	public static void main(String[] args) {
		
		StreamInterfaceImpl novo = new StreamInterfaceImpl("aAbBABacafe");
		
		char value = AppStreamExecute.firstChar(novo);
		
		if("Z".equals(String.valueOf(value))){
			System.out.println(MensagemEnum.MSM_ERRO_CONS.getDescricao());
		}else {
			System.out.println(MensagemEnum.MSM_SUCESS_CONS.getDescricao() + "'" + value + "'");
		}
		
	}
}
