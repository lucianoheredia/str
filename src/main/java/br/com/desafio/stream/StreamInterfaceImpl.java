package br.com.desafio.stream;

public class StreamInterfaceImpl implements StreamInterface{
	
	static final String VOGAIS = "A|E|I|O|U";
	private String inputStream;
	
	private String vogalElegivel;
	private int iContador;
	
	public StreamInterfaceImpl(String inputStream){
		this.inputStream = inputStream;
	}
	
	@Override
	public char firstChar(StreamInterfaceImpl input) {
		return AppStreamExecute.firstChar(input);
	}
	
	@Override
	public char getNext() {
		return this.inputStream.charAt(iContador++);
	}

	@Override
	public boolean hasNext() {
		return (this.inputStream.length() > iContador);
	}

	
	public String getVogalElegivel() {
		return vogalElegivel;
	}

	public void setVogalElegivel(String vogalElegivel) {
		this.vogalElegivel = vogalElegivel;
	}

	public String getInputStream() {
		return inputStream;
	}

	public void setInputStream(String inputStream) {
		this.inputStream = inputStream;
	}

}
