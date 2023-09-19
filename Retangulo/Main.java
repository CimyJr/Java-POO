public class Main {
    public static void main(String[] args){
       Retangulo Retangulo = new Retangulo();

       Retangulo.criarRetangulo(4, 5);
       System.out.println("\nAltura: "+Retangulo.getAltura()+ "\nLargura: " +Retangulo.getLargura());

       Retangulo.criarRetangulo(3, 30.0);
       System.out.println("\nAltura: "+Retangulo.getAltura()+ "\nLargura: " +Retangulo.getLargura());
    }
}
