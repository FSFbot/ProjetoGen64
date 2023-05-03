package freelas;

import java.text.NumberFormat;
import java.util.Locale;

public class FullStack extends freelancers {

	private String linkedin;

	public FullStack(int numero, String nome, String celular, int areaAtuacao, float valor, String carta,
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
