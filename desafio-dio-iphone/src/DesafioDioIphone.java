import iphone.model.Iphone;

public class DesafioDioIphone {
    
    public static void main(String[] args) throws Exception {
        var iphone = new Iphone("123456789");

        iphone.ligar();
        iphone.discar("987654321");
        iphone.acessar("https://www.google.com");
        iphone.reproduzir("Evidências - Xitãozinho e Xororó");
        iphone.desligar();
    }
}
