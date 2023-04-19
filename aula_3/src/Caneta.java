public class Caneta {
    public String modelo;
    public String cor;
   // private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("uma caneta "+
         this.cor + " com a carga em "
         +this.carga+" ela tem tampo? "
         +this.tampada);
    }

    public void rabiscar(){
        if(tampada == true){
            System.out.println("erro não posso rabiscar");
        }
        else{
            System.out.println("não está tampada");
        };
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
