public class Smatphone {
    int camera;
    int som;
    int entrada;
    int buton;
    boolean tela;

    void display() {
        if (tela = true) {
            System.out.println("display ON");
        } else {
            System.out.println("display OFF");
        }
    }
    void caracteristicas(){
        System.out.println("o seu smatphone tem "
        +this.camera+" cameras, com "
        +this.som+" autofalantes, "
        +this.buton+" butãoes para mexer com volume e com o "+this.tela+" melhor display do mercado");
    }
    void telaLigada() {
        this.tela = true;
    }

    void telaDesligada() {
        this.tela = false;
    }
}
