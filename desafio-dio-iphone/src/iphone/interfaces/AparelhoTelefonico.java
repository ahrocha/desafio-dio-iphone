package iphone.interfaces;

public interface AparelhoTelefonico {
    public void ligar();
    public void desligar();
    public void discar(String numero);
    public void atender();
    public void encerrar();
    public void enviarSMS(String mensagem);
    public void receberSMS(String mensagem);
}