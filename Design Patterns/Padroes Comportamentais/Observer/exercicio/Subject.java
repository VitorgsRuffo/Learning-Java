
public interface Subject {
	//Adiciona o Observador passado na estrutura de dados que contem os observadores de Subject. (Tornando-se um subscriber do publisher)
	void attach(Observer observer);
	//Remove o Obserador passado da estrutura de dados. (cancelando a assinatura com o publisher)
	void detach(Observer observer);
	//Notifica todos os observadores da mudança de estado de Subject (invoca receiveSubjectUpdate).
	void notifyObservers();
}