import java.time.LocalTime;

public class Cliente {
	private String nome;
	private LocalTime horaDeChegada;
	private int idade;
	private String servico;
	private boolean preferencial;
	
	public Cliente(String nome, LocalTime horaDeChegada, int idade, String servico) {
		this.nome = nome;
		this.horaDeChegada = horaDeChegada;
		this.idade = idade;
		this.servico = servico;
		if(idade >= 65) {
			this.preferencial = true;
		}else {
			this.preferencial = false;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public LocalTime getHoraDeChegada() {
		return horaDeChegada;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getServico() {
		return servico;
	}
	
	public boolean ePreferencial() {
		return preferencial;
	}
}