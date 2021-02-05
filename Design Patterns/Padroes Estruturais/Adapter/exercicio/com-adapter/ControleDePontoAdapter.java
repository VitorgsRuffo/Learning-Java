	
//O adapter é uma subclasse da classe antiga que matem um atributo do 
//tipo da nova classe. Ele sobreescreve os metodos da classe antiga que 
//sofreram mudança. Dentro desses metodos ele chama o metodo equivalente
//da classe atualizada. 
public class ControleDePontoAdapter extends ControleDePonto {
	
	private ControleDePontoNovo controleDePonto;
	
	ControleDePontoAdapter(){
		this.controleDePonto = new ControleDePontoNovo();
	}
	
	@Override
	public void registrarEntrada(Funcionario f) {
		this.controleDePonto.registrar(f, true);
	}
	
	@Override
	public void registrarSaida(Funcionario f) {
		this.controleDePonto.registrar(f, false);
	}
	
}