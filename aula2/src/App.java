public class App {
    public static void main(String[] args) throws Exception {
       //
        caneta caneta = new caneta();
        caneta.cor = "azul";
        caneta.carga = 100;
        caneta.tampada = false;
        caneta.status();
        caneta.rabiscar();

        caneta caneta2 = new caneta();
        caneta2.cor = "preto";
        caneta2.tampada = true;
        caneta2.tampar();
        caneta2.rabiscar();
    }
}
