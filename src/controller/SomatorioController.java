package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}
	
	public int somatorio(int n) {
		// Condição de parada: Quando N for menor ou igual a 0, desta forma, irá parar sua execução quando N chegar em 0 ou se o número inicial for negativo/0
		if (n <= 0) {
			return 0;
		}
		// Relação de chamada dos passos: Somar elemento atual com a chamada da função de seu anterior -> N + N-1 + N-2 + ... + 0 (Condição de parada)
		return n + somatorio(n - 1);
	}

}
