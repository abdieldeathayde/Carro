public abstract class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(2015, "Camaro", 461, "V8", "Amarelo");
        System.out.println("Ano:" + carro.getAno() + " modelo: " + carro.getModelo() + " potencia: " + carro.getPotencia()  + " motor: " + carro.getMotor() + " cor: " + carro.getCor() );
        
        System.out.println(carro.getAno());
        
        carro.setCor("Azul");
        System.out.println("Ano:" + carro.getAno() + " modelo: " + carro.getModelo() + " potencia: " + carro.getPotencia()  + " motor: " + carro.getMotor() + " cor: " + carro.getCor() );
    
    
    
    }
    
}
