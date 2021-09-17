
public enum ResultadoEnum {
	
	BAIXO_MUITO_GRAVE("Baixo peso muito grave = IMC abaixo de 16 kg/m²"),
	BAIXO_GRAVE("Baixo peso grave = IMC entre 16 e 16,99 kg/m²"),
	BAIXO("Baixo peso = IMC entre 17 e 18,49 kg/m²"),
	NORMAL("Peso normal = IMC entre 18,50 e 24,99 kg/m²"),
	SOBRE_PESO("Sobrepeso = IMC entre 25 e 29,99 kg/m²"),
	OBESIDADE_GRAU_UM("Obesidade grau I = IMC entre 30 e 34,99 kg/m²"),
	OBESIDADE_GRAU_DOIS("Obesidade grau II = IMC entre 35 e 39,99 kg/m²"),
	OBESIDADE_GRAU_TRES("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
	
	private String descricao;
	
	private ResultadoEnum(String descricao) {
		this.descricao = descricao;
	}
	
	
	public static String apresentar(double imc) {
		if (imc < 16) {
			return "CALCULADO: " + imc + " - " + BAIXO_MUITO_GRAVE.descricao;
		} else if (imc >= 16 && imc <= 16.99) {
			return "CALCULADO: " + imc + " - " + BAIXO_GRAVE.descricao;
		} else if (imc >= 17 && imc <= 18.49) {
			return "CALCULADO: " + imc + " - " + BAIXO.descricao;
		} else if (imc >= 18.50 && imc <=24.99) {
			return "CALCULADO: " + imc + " - " + NORMAL.descricao;
		} else if (imc >= 25 && imc <= 29.99) {
			return "CALCULADO: " + imc + " - " + SOBRE_PESO.descricao;
		} else if (imc >= 30 && imc <= 34.99) {
			return "CALCULADO: " + imc + " - " + OBESIDADE_GRAU_UM.descricao;
		} else if (imc >= 35 && imc <= 39.99) {
			return "CALCULADO: " + imc + " - " + OBESIDADE_GRAU_DOIS.descricao;
		} else {
			return "CALCULADO: " + imc + " - " + OBESIDADE_GRAU_TRES.descricao;
		}
	}
}
