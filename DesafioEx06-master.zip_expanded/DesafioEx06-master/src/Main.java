import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DynamicQueue<Integer> fila1 = new DynamicQueue<>();
        DynamicQueue<Integer> fila2 = new DynamicQueue<>();
        DynamicQueue<Integer> fila3 = new DynamicQueue<>();
        DynamicQueue<Integer> fila4 = new DynamicQueue<>();
        DynamicQueue<Integer> fila5 = new DynamicQueue<>();
        Programa p = new Programa(fila1, fila2, fila3, fila4, fila5);

        int cont = 0;
        while (cont  < 15) {
            p.preencherFila();
            System.out.println(p.fila1.size());
            System.out.println(p.fila2.size());
            System.out.println(p.fila3.size());
            System.out.println(p.fila4.size());
            System.out.println(p.fila5.size());
            System.out.println("---------------------------------------------------------");

            cont++;
        }
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();
        p.sairDaFila();

    


    }


}
