package freelas;

public class BackEnd extends freelancers {

	private String linkedin;

	public BackEnd(int numero, String nome, String celular, int areaAtuacao, float valor, String carta,
			String linkedin) {
		super(numero, nome, celular, areaAtuacao, valor, carta, linkedin);
		linkedin = linkedin;

	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		linkedin = linkedin;
	}

}
