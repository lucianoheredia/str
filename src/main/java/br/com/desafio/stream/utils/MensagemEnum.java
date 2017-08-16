package br.com.desafio.stream.utils;

public enum MensagemEnum {

	MSM_ERRO_CONS(1, "Infelizmente não foi possivel identificar a vogal!"),
	MSM_SUCESS_CONS(2, "A vogal encontrada é: ");

	private Integer id;
	private String desc;

	MensagemEnum(Integer id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public String getDescricao() {
		return this.desc;
	}

	public Integer getId() {
		return this.id;
	}

}
