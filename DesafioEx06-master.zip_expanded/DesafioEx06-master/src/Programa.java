
import java.util.Random;

public class Programa {

	public DynamicQueue<Integer> fila1;
	public DynamicQueue<Integer> fila2;
	public DynamicQueue<Integer> fila3;
	public DynamicQueue<Integer> fila4;
	public DynamicQueue<Integer> fila5;

	private int caixa1; 
	private int caixa2;
	private int caixa3;
	private int caixa4;
	private int caixa5;
	
	private double time1,time2,time3,time4,time5;
	

	public Programa(DynamicQueue fila1, DynamicQueue fila2, DynamicQueue fila3, DynamicQueue fila4,
			DynamicQueue fila5) {
		this.fila1 = fila1;
		this.fila2 = fila2;
		this.fila3 = fila3;
		this.fila4 = fila4;
		this.fila5 = fila5;
	}

	/**
	 * 
	 * @return retorna o maior valor encontrado no vetor de caixas
	 */
	public int maiorTempo() {

		int[] vCaixas = { caixa1, caixa2, caixa3, caixa4, caixa5 };
		int aux = caixa1;
		int posição = vCaixas[0];
		for (int i = 0; i < vCaixas.length; i++) {
			for (int j = 0; j < vCaixas.length; j++) {
				if (vCaixas[i] > aux) {
					aux = vCaixas[i];
					posição = i--;
				}
			}
		}
		return aux;
	}

	/**
	 * 
	 * @return retorna a menor fila 
	 */
	public DynamicQueue<Integer> verificarMenorFila() {
		DynamicQueue menor = fila1.size() < fila2.size() ? fila1 : fila2;
		menor = menor.size() < fila3.size() ? menor : fila3;
		menor = menor.size() < fila4.size() ? menor : fila4;
		menor = menor.size() < fila5.size() ? menor : fila5;
		return menor;

	}


/**
 * retira da fila os elementos com um random que pode ser 1 ou 2 pessoas por caixa
 */
	public void sairDaFila(double valor) {
		Random r = new Random();

		int retirar = r.nextInt(2) + 1;

		if (maiorTempo() == fila1.size()) {
			if (retirar >= fila1.size())retirar = 1;
			if (fila1.size() == 0)return;
			while (retirar > 0) {
				this.caixa1--;
				System.out.println("fila 1 saiu " + fila1.dequeue());
				retirar--;
				this.time1 =- valor;
			}
			return;
		}
		if (maiorTempo() == fila2.size()) {
			if (retirar >= fila2.size())retirar = 1;
			if(fila2.size()==0)  return;
			
					while (retirar > 0) {
				this.caixa2--;
				System.out.println("fila 2 saiu " + fila2.dequeue());
				retirar--;
				this.time2 =- valor;

			}
			return;

		}
		if (maiorTempo() == fila3.size()) {
			if (retirar > fila3.size())retirar = 1;
			if (fila3.size() == 0)return;

			while (retirar > 0) {
				this.caixa3--;
				System.out.println("fila 3 saiu " + fila3.dequeue());
				retirar--;
				this.time3 =- valor;

			}
		}
		if (maiorTempo() == fila4.size()) {
			if (retirar > fila4.size())retirar = 1;
			if (fila4.size() == 0)return;

			while (retirar > 0) {
				this.caixa4--;
				System.out.println("fila 4 saiu " + fila4.dequeue());
				retirar--;
				this.time4 =- valor;

			}
			return;
		}
		if (maiorTempo() == fila5.size()) {
			if (retirar > fila5.size())retirar = 1;
			if (fila5.size() == 0)return;

			while (retirar > 0) {
				this.caixa5--;
				System.out.println("fila 5 saiu " + fila5.dequeue());
				retirar--;
				this.time3 =- valor;

			}
			return;
		}
	}

	/**
	 * preenche as filas de acordo com a prioridade da menor fila
	 */
	public void preencherFila(double valor) {
		if (verificarMenorFila() == fila1) {
			fila1.enqueue(1);
			caixa1++;
			this.time1 =+ valor;
		} else if (verificarMenorFila() == fila2) {
			fila2.enqueue(1);
			caixa2++;
			this.time2 =+ valor;
		} else if (verificarMenorFila() == fila3) {
			fila3.enqueue(1);
			caixa3++;
			this.time3 =+ valor;
		} else if (verificarMenorFila() == fila4) {
			fila4.enqueue(1);
			caixa4++;
			this.time4 =+ valor;
		} else {
			fila5.enqueue(1);
			caixa5++;
			this.time5 =+ valor;

		}
	}
	
	public void tempoMedio(){
		System.out.println("TEMPO 1 "+this.time1);
		System.out.println("TEMPO 2 "+this.time1);
		System.out.println("TEMPO 3 "+this.time1);
		System.out.println("TEMPO 4 "+this.time1);
		System.out.println("TEMPO 5 "+this.time1);
	}

	public int roletaDaSorte() {
		return geraAleatorio(16, 4);
	}
/**
 *Gerador de numeros randomicos com intervalor de minino e maximo
 * @param max maximo valor 
 * @param min menor valor
 * @return retorna um numero aleatorio em um intervalo de minino e maximo
 */
	public static int geraAleatorio(int max, int min) {
		Random random = new Random();
		return (random.nextInt(max - (min - 1)) + min);
	}
}