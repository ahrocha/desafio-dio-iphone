package iphone.interfaces;

public interface NavegadorInternet {
    public void acessar(String url);
    public void desconectar();
    public void enviarDados(String dados);
    public void receberDados(String dados);
}