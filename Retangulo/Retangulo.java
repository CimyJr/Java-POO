class Retangulo{
    private int altura;
    private int largura;

    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getLargura(){
        return this.largura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getAltura(){
        return this.altura;
    }

    public void criarRetangulo(int altura, int largura){
        setAltura(altura);
        setLargura(largura);
        
    }

    public void criarRetangulo(int largura, double angulo){
        setLargura(largura);
        setAltura((int)((double)largura*(double)(Math.tan(Math.toRadians(angulo)))));
        System.out.println(Math.tan(Math.toRadians(angulo)));
    }

    public void criarRetangulo(double diagonal,int angulo){
        setAltura((int)(Math.asin(angulo)*diagonal));
        setLargura((int)(Math.acos(angulo)*diagonal));
    }
}