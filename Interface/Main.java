//Interface: padroniza o comportamento basico de classes que implementam esta interface. Se precisarmos mudar a implementacao dos metodos da classe não afetaremos quem ja usa ela, pois, a assinatura dos metodos nao muda. (a classe é obrigada a manter a assinatura presente na interface que ela implementa)

//Uma interface define um contrato entre a classe e o mundo externo que usará a classe. (A classe deve fornecer os metodos especificados pela interface e quem for usar esses metodos sabe que suas assinaturas nunca mudarao)


//ex - interface:
    public interface ContaBancaria {

        public void sacar(BigDecimal valor);
    }

    //obs: assinatura de metodos em uma interface sao sempre public, nao podemos colocar private ou protected. Nem é necessario escrever public, pois, o compilador sabe que deve ser public.
    //obs: interfaces nao tem atributos de instancia (nao podemos instanciar uma interface!). Porem ela pode ter atributos que sejam static e final.
    //obs: uma interface deve estar em seu arquivo proprio (.java).
	
//implementando a interface de uma maneira:

    public class ContaCorrente implements ContaBancaria {
    
        public void sacar(BigDecimal valor) {
            if(this.limite.add(this.saldo.subtract(valor)).compareTo(BigDecimal.ZERO) == -1) {
                
                System.out.printf("Não foi possivel efetuar o saque de R$%.2f.%n"
                        + "Saldo da conta: R$%.2f.%n"
                        + "Limite: %.2f%n", valor, saldo, limite);
                return;
                
            }
            
            this.saldo = this.saldo.subtract(valor);
            System.out.printf("Saque de R$%.2f efetuado com sucesso.%n"
                    + "Novo saldo: %.2f.%n"
                    + "Limite: %.2f%n", valor, saldo, limite);
        
        }
    }

//implementando de outra maneira:

    public class ContaPoupanca implements ContaBancaria {

        public void sacar(BigDecimal valor) {
            if(this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) == -1) {
                System.out.printf("Cliente: %s , Conta: %s.%n"
                        + "Não foi possivel efetuar o saque de R$%.2f.%n"
                        + "Saldo da conta: R$%.2f.%n", cliente, numeroDaConta, valor, saldo);
                return;
                
            }
            
            this.saldo = this.saldo.subtract(valor);
            System.out.printf("Cliente: %s , Conta: %s.%n"
                    + "Saque de R$%.2f efetuado com sucesso.%n"
                    + "Novo saldo: %.2f.%n", cliente, numeroDaConta, valor, saldo);
        
        }
    }

//Usando essas implementacoes:

    ContaBancaria contaC = new ContaCorrente();
    ContaBancaria contaP = new ContaPoupanca();

    contaC.sacar(BigDecimal.valueOf(100.00)); //chama o sarcar() implementado pela classe ContaCorrente.
    contaP.sacar(BigDecimal.valueOf(150.00)); //chama o sarcar() implementado pela classe ContaPoupanca.


//Podemos passar como parâmetro do tipo ContaBancaria qualquer objeto cuja classe implementa ContaBancaria: (facilida mantenção e escalabilidade do software)

    sacar(contaC);
    sacar(ContaP);

    public void sacar(ContaBancaria conta){
        conta.sacar(); //chama o sacar implementado pela classe do objeto passado.
    }

    //Se futuramente criarmos novas implementacoes de ContaBancaria metodos como esse, que funcionam para qualquer implementacao de ContaBancaria, nao precisam mudar.


//Uma classe pode implementar varias interfaces. Assim, essa classe deve implementar os metodos presentes em todas as interfaces.

    public interface Interface1 {
        int constant = 10;
        void method1();
        void method2();
    }

    public interface Interface2 {
        int method3();
    }

    public class Class1 implements Interface1, Interface2 {
        
        void method1(){
            System.out.println("hello");
        }
        void method2(){
            System.out.println("hello guys!");
        }
        void method3(){
            return 20;
        }
    }

//Uma interface pode herdar assinatura de metodos de outra interface:
    
    public interface Interface1 {
        void method1();
        void method2();
    }

    public interface Interface2 extends Interface1 {
        int method3();
    }

    //ja que a Interface2 herda todas as assinaturas de metodos da Interface1 a Classe1 deve implementar todos esses metodos.
    public class Class1 implements Interface2 {
        
        void method1(){
            System.out.println("hello girls!");
        }
        void method2(){
            System.out.println("hello boys!");
        }
        void method3(){
            return 50;
        }
    }
