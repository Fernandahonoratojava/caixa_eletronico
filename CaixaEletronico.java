import java.util.Scanner;

public class CaixaEletronico {
	 
public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, Digite o seu nome:");
		nome = teclado.nextLine();
		if (nome == ""){
			System.out.println("Digite um nome v�lido");
			nome = teclado.nextLine();
		}
		else{
			System.out.println("*****Ol� "+ nome +", � um prazer ter voc� por aqui!*****");
		
			System.out.println("Selecione uma op��o 1.) Saldo 2.) Extrato 3.) Saque 4.) Dep�sito 5.) Tranfer�ncia 6.) Sair");
		    int escolha = teclado.nextInt();
		switch (escolha){
		case 1: 
			validar_senha();
			ver_saldo();
			break;
		case 2:
			validar_senha();
			ver_extrato();
			break;
		case 3:
			validar_senha();
			fazer_saque();
			break;
		case 4:
			fazer_deposito();
			break;
		case 5:
			validar_senha();
			fazer_transferencia();
			break;
		case 6:
			sair();
			break;
		default:
			erro();
		}
}
		teclado.close();
}
		static String nome;
		public static void inicio() {
			
		System.out.println("Selecione uma op��o 1.) Saldo 2.) Extrato 3.) Saque 4.) Dep�sito 5.) Tranfer�ncia 6.) Sair");
	 	Scanner teclado = new Scanner(System.in);
	    int escolha = teclado.nextInt();

	    switch (escolha){
		case 1: 
			validar_senha();
			ver_saldo();
			break;
		case 2:
			validar_senha();
			ver_extrato();
			break;
		case 3:
			validar_senha();
			fazer_saque();
			break;
		case 4:
			fazer_deposito();
			break;
		case 5:
			validar_senha();
			fazer_transferencia();
			break;
		case 6:
			sair();
			break;
		default:
			erro();
		}
		
		teclado.close();
		
}
	    private static void fazer_transferencia() {
	    	Scanner teclado = new Scanner(System.in);
	    	Double conta;
	    	Double transferencia;
	    	System.out.println("Digite o n�mero da conta:");
	    	conta = teclado.nextDouble();
	    	if(conta <=0 ) {
				System.out.println("Por favor, informe um n�mero v�lido.");
				fazer_transferencia();
			}
	    	else  {
	    		System.out.println("Digite o valor da transfer�ncia:");
		    	transferencia = teclado.nextDouble();
		    	 if ( transferencia <= 0 || transferencia > saldo) {
		    	      System.out.println("Saldo indispon�vel, tente novamente:");
		    	      fazer_transferencia();
		    	      inicio();
		    	    }
		    	 else {  	 
		    	saldo -= transferencia;
				System.out.println("Tranfer�ncia realizada com sucesso!");
				ver_saldo();
				inicio();
		    	 }
		    	    }
	    	teclado.close();
	    	} 
		private static void ver_extrato() {
	System.out.println("         **********LAN�AMENTOS********** \n"+
			  "1/07/2022   	compra lojas americanas     -R$50,00 \n" +
			  "20/06/2022   compra mercado joao         -R$200,00 \n"+
			  "22/05/2022   dep�sito maria aparecida    +R$250,00 \n"+
			  "10/05/2022   pix joana ferreira          +R$200,00 \n" +
			  "01/05/2055   transferencia               -R$50,00 \n" );
			  inicio();
		}
		private static void validar_senha() {
	    	Scanner teclado = new Scanner(System.in);
	    	int senha = 3589;
	    System.out.println("Por favor, Digite sua senha");
	    senha = teclado.nextInt();
	    
	    if (senha != 3589) {
	    	System.out.println("Por favor, informe uma senha v�lida.");
	    	validar_senha();
	    }
	    else {
	    	System.out.println("Senha validada.");
	    }
	    teclado.close();
}
		static double saldo = 100;

	    /*  Um m�todo simples que s� exibe uma mensagem ao usu�rio e em seguida chama a fun��o principal. */
	    public static void ver_saldo() {
	      System.out.println("Seu saldo atual �: " + saldo);
	      inicio();
	      }
	      public static void fazer_deposito() {

	    	    System.out.println("Qual o valor a ser depositado?");
	    	    Scanner teclado = new Scanner(System.in);
	    	    Double deposito = teclado.nextDouble();


	    	    if ( deposito <= 0) {
	    	      System.out.println("Por favor, informe um n�mero v�lido:");
	    	      fazer_deposito();
	    	    } else {
	    	      saldo += deposito;
	    	      ver_saldo();
	    	      inicio();
	    	    }

	    	    teclado.close();
	      }
	    	    public static void fazer_saque() {
	    	        System.out.println("Qual o valor para saque?");
	    	        Scanner teclado = new Scanner(System.in);
	    	        Double saque = teclado.nextDouble();  

	    	        if (saque <=0 || saque > saldo) {
	    	          System.out.println("Saldo indispon�vel, tente novamente:");
	    	          fazer_saque();
	    	        } else {
	    	          saldo -= saque;
	    	          ver_saldo();
	    	          inicio();

	    	        }
	    	        teclado.close();
	    	      }
	    	        public static void sair() {
	    	            System.out.println("Voc� deseja sair? S/N");

	    	            Scanner teclado = new Scanner(System.in);
	    	            String escolha = teclado.nextLine();

	    	            if (escolha.equals("S")) {
	    	              System.out.println(nome +", foi um prazer ter voc� por aqui!");
	    	              System.exit(0);
	    	            } else if (escolha.equals("N")) {
	    	              inicio();
	    	              
	    	            } else {
	    	              System.out.println("Desculpe, mas n�o compreendi.");
	    	              sair();
	    	            }
	    	            teclado.close();
	    	        }
	    	        
	    	            public static void erro() {
	    	                System.out.println("Por favor, informe um n�mero entre 1 e 6");
	    	                main(null);
	    	              }
	    	            
		
	}


