
public class Main {
	public static void main(String[] args) {
		try {
			someMethod();

		}catch(Exception exc) {
			exc.printStackTrace();
			
			StackTraceElement[] stackTraceElements = exc.getStackTrace();
			
			System.out.printf("%nImprimindo a stackTrace de maneira customizada:%n%n");
			System.out.println("Classe\tArquivo\t\tLinha\tMetodo");
			
	        for (StackTraceElement element : stackTraceElements) {
	            System.out.printf("%s\t", element.getClassName());
	            System.out.printf("%s\t", element.getFileName());
	            System.out.printf("%s\t", element.getLineNumber());
	            System.out.printf("%s%n", element.getMethodName());
	        } 
		}
	}
	
	private static void someMethod() throws Exception {
		try {
			someMethod2();
			
		}catch(Exception exc) {
			throw new Exception("Excecao gerada no metodo someMethod", exc);
		}
	}
	
	private static void someMethod2() throws Exception {
		throw new Exception("Excecao gerada no metodo someMethod2.");
	}
}