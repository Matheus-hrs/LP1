/**
 * 
 */
import java.util.Scanner;

/**
 * @author Matheus Henrique Ribeiro Silva
 *
 */
public class Produto {
	
	//atribuos
	
	private String Nome;
	private int preco;
	private String Parcelamento;

	//metodos de acesso

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public String getParcelamento() {
		return Parcelamento;
	}

	public void setParcelamento(String parcelamento) {
		Parcelamento = parcelamento;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	private boolean disponivel;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner ent = new Scanner(System.in);
        
        double num, soma = 0;
        int cont = 0;
        
        do{
            System.out.println("Digite uma avalia��o");
            num = ent.nextDouble(); // usuario digita um n�mero
            
            if(num >= 0){ // se o n�mero digitado for MAIOR que zero, executa a conta
                soma = num + soma; // soma o valor digitado AGORA com o digitado ANTES
                cont++; // conta quantas vezes o usu�rio digitou um n�mero
            }
        } while(num >= 0); // se o n�mero digitado for MAIOR que zero, faz o LOOP novamente
        
        System.out.println("Total da soma das avalia��es " + soma); // soma
        System.out.println("A quantidade de avalia��es digitadas foi " + cont); // quantidade
        System.out.println("A m�dia � " + soma / cont); // m�dia
    }
	
}


