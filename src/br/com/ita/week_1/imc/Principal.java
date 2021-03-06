/**
 * <p>Implemente no Eclipse uma classe chamada Paciente que possui um construtor que recebe 
 * o seu peso em quilos e sua altura em metros, ambos utilizando o tipo double. </p>
 * 
 * <p>Crie um método chamado calcularIMC() que calcula o índice de Massa Corporal 
 * de acordo com a fórmula IMC = peso (quilos) / (altura * altura (metros)).</p>
 * 
 * <p>Crie também um método chamado diagnostico() que utiliza o método calcularIMC() e 
 * retorna uma String de acordo com as seguintes faixas de valor:</p>
 * 
 * <ul>
 * 	<li>Baixo peso muito grave = IMC abaixo de 16 kg/m²</li>
 * 	<li>Baixo peso grave = IMC entre 16 e 16,99 kg/m²</li>
 * 	<li>Baixo peso = IMC entre 17 e 18,49 kg/m²</li>
 * 	<li>Peso normal = IMC entre 18,50 e 24,99 kg/m²</li>
 * 	<li>Sobrepeso = IMC entre 25 e 29,99 kg/m²</li>
 * 	<li>Obesidade grau I = IMC entre 30 e 34,99 kg/m²</li>
 * 	<li>Obesidade grau II = IMC entre 35 e 39,99 kg/m²</li>
 * 	<li>Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²</li>
 * </ul>
 * 
 * @author thiago.pereira
 *
 */
public class Principal {
	public static void main(String[] args) {
		System.out.println(new Paciente(78, 1.77).diagnostico());
		System.out.println(new Paciente(45, 1.68).diagnostico());
		System.out.println(new Paciente(100, 1.90).diagnostico());
	}
}
