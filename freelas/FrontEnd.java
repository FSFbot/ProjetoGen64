package freelas;

public class FrontEnd extends freelancers{
	private String linkedin;

	public FrontEnd(int numero, String nome, String celular, int areaAtuacao, float valor,String carta, String linkedin) {
		super(numero, nome, celular, areaAtuacao, valor, carta);
		linkedin = linkedin;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		linkedin = linkedin;
	}
	
	public void visualizarF() {
		System.out.println("\nLinkedIn: " + this.linkedin);
	}
	
}