public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Caneta caneta = new Caneta("NIC",0.5f,"azul");
        //caneta.setPonta(0.5f);
        //caneta.setModelo("BIC");
        caneta.status();
        Caneta caneta2 = new Caneta("caracter", 0.9f, "bege");
        caneta2.status();


        

        //System.out.println("tenho uma caneta: "+caneta.getModelo()+ " de ponta: "+caneta.getPonta());
    }
}
