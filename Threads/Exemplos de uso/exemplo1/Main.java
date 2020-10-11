public class Main {
	public static void main(String[] args) {
		
		TarefaParalela p1 = new TarefaParalela();
		p1.setId(1);
		
		Thread t1 = new Thread(p1);
		t1.start();
		
		TarefaParalela p2 = new TarefaParalela();
		p2.setId(2);
				
		Thread t2 = new Thread(p2);
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("t2.join: so vamos continuar executando essa thread principal "
				+ "quando a thread 2 terminar a sua execuçao.");

	}
}

//Ao rodar o programa percebemos a alternancia entre as duas threads. 
//O processador executa um pouco de cada uma delas alternando entre a thread
//principal, a thread1 e a thread2. Também não ha regra em relaçao a quanto
//tempo de processador cada thread recebe (note que esse tempo varia
//a todo momento - quen define esse tempo de processador é o SO e não
//temos controle sobre isso).

/*exemplo de saida:
	programa: 1 valor: 0
	programa: 1 valor: 1
	programa: 1 valor: 2
	programa: 1 valor: 3
	programa: 1 valor: 4
	programa: 1 valor: 5
	programa: 1 valor: 6
	programa: 1 valor: 7
	programa: 1 valor: 8
	programa: 1 valor: 9
	programa: 1 valor: 10
	programa: 1 valor: 11
	programa: 1 valor: 12
	programa: 1 valor: 13
	programa: 1 valor: 14
	programa: 1 valor: 15
	programa: 1 valor: 16
	programa: 1 valor: 17
	programa: 2 valor: 0
	programa: 2 valor: 1
	programa: 2 valor: 2
	programa: 2 valor: 3
	programa: 2 valor: 4
	programa: 2 valor: 5
	programa: 2 valor: 6
	programa: 2 valor: 7
	programa: 2 valor: 8
	programa: 2 valor: 9
	programa: 2 valor: 10
	programa: 2 valor: 11
	programa: 2 valor: 12
	programa: 2 valor: 13
	programa: 2 valor: 14
	programa: 2 valor: 15
	programa: 2 valor: 16
	programa: 2 valor: 17
	programa: 2 valor: 18
	programa: 2 valor: 19
	programa: 2 valor: 20
	programa: 2 valor: 21
	programa: 2 valor: 22
	programa: 2 valor: 23
	programa: 2 valor: 24
	programa: 2 valor: 25
	programa: 2 valor: 26
	programa: 2 valor: 27
	programa: 2 valor: 28
	programa: 2 valor: 29
	programa: 2 valor: 30
	programa: 2 valor: 31
	programa: 2 valor: 32
	programa: 2 valor: 33
	programa: 2 valor: 34
	programa: 2 valor: 35
	programa: 2 valor: 36
	programa: 2 valor: 37
	programa: 2 valor: 38
	programa: 2 valor: 39
	programa: 2 valor: 40
	programa: 2 valor: 41
	programa: 2 valor: 42
	programa: 2 valor: 43
	programa: 2 valor: 44
	programa: 2 valor: 45
	programa: 2 valor: 46
	programa: 2 valor: 47
	programa: 2 valor: 48
	programa: 2 valor: 49
	programa: 2 valor: 50
	programa: 2 valor: 51
	programa: 2 valor: 52
	programa: 2 valor: 53
	programa: 2 valor: 54
	programa: 2 valor: 55
	programa: 2 valor: 56
	programa: 2 valor: 57
	programa: 2 valor: 58
	programa: 2 valor: 59
	programa: 2 valor: 60
	programa: 2 valor: 61
	programa: 2 valor: 62
	programa: 2 valor: 63
	programa: 2 valor: 64
	programa: 2 valor: 65
	programa: 2 valor: 66
	programa: 2 valor: 67
	programa: 2 valor: 68
	programa: 2 valor: 69
	programa: 2 valor: 70
	programa: 2 valor: 71
	programa: 2 valor: 72
	programa: 2 valor: 73
	programa: 2 valor: 74
	programa: 2 valor: 75
	programa: 2 valor: 76
	programa: 2 valor: 77
	programa: 1 valor: 18
	programa: 2 valor: 78
	programa: 1 valor: 19
	programa: 1 valor: 20
	programa: 1 valor: 21
	programa: 2 valor: 79
	programa: 1 valor: 22
	programa: 2 valor: 80
	programa: 2 valor: 81
	programa: 2 valor: 82
	programa: 2 valor: 83
	programa: 2 valor: 84
	programa: 1 valor: 23
	programa: 2 valor: 85
	programa: 1 valor: 24
	programa: 2 valor: 86
	programa: 1 valor: 25
	programa: 2 valor: 87
	programa: 1 valor: 26
	programa: 1 valor: 27
	programa: 1 valor: 28
	programa: 2 valor: 88
	programa: 1 valor: 29
	programa: 2 valor: 89
	programa: 1 valor: 30
	programa: 1 valor: 31
	programa: 1 valor: 32
	programa: 2 valor: 90
	programa: 1 valor: 33
	programa: 1 valor: 34
	programa: 1 valor: 35
	programa: 1 valor: 36
	programa: 1 valor: 37
	programa: 1 valor: 38
	programa: 1 valor: 39
	programa: 1 valor: 40
	programa: 1 valor: 41
	programa: 1 valor: 42
	programa: 1 valor: 43
	programa: 2 valor: 91
	programa: 1 valor: 44
	programa: 1 valor: 45
	programa: 1 valor: 46
	programa: 1 valor: 47
	programa: 1 valor: 48
	programa: 1 valor: 49
	programa: 2 valor: 92
	programa: 1 valor: 50
	programa: 2 valor: 93
	programa: 1 valor: 51
	programa: 2 valor: 94
	programa: 1 valor: 52
	programa: 2 valor: 95
	programa: 1 valor: 53
	programa: 2 valor: 96
	programa: 1 valor: 54
	programa: 1 valor: 55
	programa: 1 valor: 56
	programa: 1 valor: 57
	programa: 1 valor: 58
	programa: 1 valor: 59
	programa: 1 valor: 60
	programa: 1 valor: 61
	programa: 1 valor: 62
	programa: 1 valor: 63
	programa: 1 valor: 64
	programa: 1 valor: 65
	programa: 1 valor: 66
	programa: 1 valor: 67
	programa: 1 valor: 68
	programa: 1 valor: 69
	programa: 1 valor: 70
	programa: 2 valor: 97
	programa: 1 valor: 71
	programa: 1 valor: 72
	programa: 1 valor: 73
	programa: 1 valor: 74
	programa: 1 valor: 75
	programa: 1 valor: 76
	programa: 1 valor: 77
	programa: 1 valor: 78
	programa: 1 valor: 79
	programa: 1 valor: 80
	programa: 1 valor: 81
	programa: 1 valor: 82
	programa: 1 valor: 83
	programa: 1 valor: 84
	programa: 1 valor: 85
	programa: 1 valor: 86
	programa: 1 valor: 87
	programa: 1 valor: 88
	programa: 1 valor: 89
	programa: 1 valor: 90
	programa: 1 valor: 91
	programa: 1 valor: 92
	programa: 1 valor: 93
	programa: 1 valor: 94
	programa: 1 valor: 95
	programa: 1 valor: 96
	programa: 1 valor: 97
	programa: 1 valor: 98
	programa: 1 valor: 99
	programa: 2 valor: 98
	programa: 2 valor: 99
*/