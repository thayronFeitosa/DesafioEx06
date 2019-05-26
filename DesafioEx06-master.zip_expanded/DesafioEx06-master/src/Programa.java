import java.util.Random;

public class Programa {

    public DynamicQueue<Integer> fila1;
    public DynamicQueue<Integer> fila2;
    public DynamicQueue<Integer> fila3;
    public DynamicQueue<Integer> fila4;
    public DynamicQueue<Integer> fila5;

    public Programa(DynamicQueue fila1, DynamicQueue fila2, DynamicQueue fila3, DynamicQueue fila4, DynamicQueue fila5) {
        this.fila1 = fila1;
        this.fila2 = fila2;
        this.fila3 = fila3;
        this.fila4 = fila4;
        this.fila5 = fila5;
    }


    public DynamicQueue<Integer> verificarMenorFila() {
        DynamicQueue menor = fila1.size() < fila2.size() ? fila1 : fila2;
        menor = menor.size() < fila3.size() ? menor : fila3;
        menor = menor.size() < fila4.size() ? menor : fila4;
        menor = menor.size() < fila5.size() ? menor : fila5;
        return menor;
    }

    public void preencherFila() {
            if (verificarMenorFila() == fila1) fila1.enqueue(1);
            else if (verificarMenorFila() == fila2) fila2.enqueue(1);
            else if (verificarMenorFila() == fila3) fila3.enqueue(1);
            else if (verificarMenorFila() == fila4) fila4.enqueue(1);
            else fila5.enqueue(1);
    }


    public int roletaDaSorte() {
        return geraAleatorio(16, 4);
    }

    public static int geraAleatorio(int max, int min) {
		Random random = new Random();
		return (random.nextInt(max - (min - 1)) + min);
	}
}
