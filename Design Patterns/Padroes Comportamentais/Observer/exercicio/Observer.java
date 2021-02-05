
public interface Observer {
	//Metodo que sera chamado pelo Subject para todos os seus Observadores. (O Subject passa a si mesmo como parametro) 
	//O Observador (dentro deste metodo) recebe o subject como parametro (cujo estado atualizou) e entao ele executa comandos para fazer uso desse novo estado do subjetc.
	void receiveSubjectUpdate(Subject subject);
}