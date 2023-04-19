public class caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("uma caneta "+
         this.cor + " com a carga em "
         +this.carga+" ela tem tampo? "
         +this.tampada);
    }

    void rabiscar(){
        if(tampada == true){
            System.out.println("erro não posso rabiscar");
        }
        else{
            System.out.println("não está tampada");
        };
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
