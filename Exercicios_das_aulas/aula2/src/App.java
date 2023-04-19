public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Smatphone Smatphone = new Smatphone();
        Smatphone.camera = 3;
        Smatphone.buton = 3;
        Smatphone.entrada = 1;
        Smatphone.som = 3;
        Smatphone.tela = false;

        Smatphone.display();
        Smatphone.caracteristicas();

    }
}
