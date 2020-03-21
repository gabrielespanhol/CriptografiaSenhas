
public class PilhaChar {
	public final int  N = 25;

	char dados[] = new char[N];
	int topo;

	public void init() {
		topo = 0;
	}

	public boolean isFull() {
		if (topo == N)
			return true;
		else
			return false;
	}
	
	public void push(char elem) {
		if (!isFull()) {
			dados[topo]=elem;
			topo++;
		}
		else
			System.out.println("stack overflow");
	}
	
	public boolean isEmpty() {
		if (topo ==0)
			return true;
		else
			return false;
	}
	
	public static class RetornoChar{
		char elem;
		boolean sucesso;
	}
	
	public RetornoChar pop() {
		RetornoChar saida = new RetornoChar();
		if (!isEmpty()) {
			topo--;
			saida.elem= dados[topo];
			saida.sucesso = true;
			}
		else {
			
			saida.sucesso = false;
			}
		return saida;
	}
	
	public RetornoChar top() {
		RetornoChar saida = new RetornoChar();
		if (!isEmpty()) {
			saida.elem= dados[topo-1];
			saida.sucesso = true;
			}
		else {
			
			saida.sucesso = false;
			}
		return saida;
	}
	
	public String esvazia() {
		String aux = "";
		RetornoChar res = new RetornoChar();
		if (!isEmpty())
			res = pop();
			while (res.sucesso) {
				aux += res.elem;
				res = pop();
			}
		return aux;
	}
}
