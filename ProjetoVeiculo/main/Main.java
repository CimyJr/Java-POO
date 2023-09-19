package main;

public class Main {
    public static void main(String[] args){
        Veiculo corsa = new Veiculo();
        Passageiro p1 = new Passageiro();
        Endereco p1Endereco = new Endereco();
        Passageiro p2 = new Passageiro();
        Endereco p2Endereco = new Endereco();
        Passageiro p3 = new Passageiro();
        Endereco p3Endereco = new Endereco();
        
        p1.setNome("Cimy");
        p1.setCpf("123.456.789-12");
        p1Endereco.setLogradouro("Rua Costa Freire");
        p1Endereco.setCep("12345-67");
        p1Endereco.setNumeroDoCasa(1234);
        p1Endereco.setCidade("Fortaleza");
        p1Endereco.setUf("CE");
        p1Endereco.setBairro("Vila Peri");
        p1.setEndereco(p1Endereco);

        p2.setNome("Kelvin");
        p2.setCpf("123.456.789-12");
        p2Endereco.setLogradouro("Rua do Sol Um");
        p2Endereco.setCep("12345-67");
        p2Endereco.setNumeroDoCasa(1234);
        p2Endereco.setCidade("Fortaleza");
        p2Endereco.setUf("CE");
        p2Endereco.setBairro("Planalto");
        p2.setEndereco(p2Endereco);

        p3.setNome("João");
        p3.setCpf("123.456.789-12");
        p3Endereco.setLogradouro("Rua do Bobo");
        p3Endereco.setCep("12345-67");
        p3Endereco.setNumeroDoCasa(0);
        p3Endereco.setCidade("Fortaleza");
        p3Endereco.setUf("CE");
        p3Endereco.setBairro("VMS");
        p3.setEndereco(p3Endereco);

        corsa.setMaxPassageiros(2);
        corsa.embarcarPassageiro(p1);
        corsa.embarcarPassageiro(p2);
        corsa.embarcarPassageiro(p3);
        
        System.out.println("maxpassageiros: " + corsa.getMaxPassageiros() );
        corsa.mostraDadosPassageiros();
    }
}