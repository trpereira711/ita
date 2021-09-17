
public class Paciente {
	
	private double peso;
	
	private double altura;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calculaIMC() {
		return peso / (altura * altura);
	}
	
	public String diagnostico() {
		return ResultadoEnum.apresentar(calculaIMC()) ;
	}
}
