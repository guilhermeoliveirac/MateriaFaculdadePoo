public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       Caneta caneta = new Caneta();
       caneta.modelo="bick cristal";
       caneta.cor="Azul";
       //caneta.ponta = "0.5";
       caneta.carga = 80;
       //caneta.tampada = false;
       caneta.tampar();
       caneta.rabiscar();
       caneta.status();
    }
}
