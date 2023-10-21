package iphone.model;

import iphone.interfaces.AparelhoTelefonico;
import iphone.interfaces.NavegadorInternet;
import iphone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String numero;

    public Iphone(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void ligar() {
        System.out.println("Ligando iphone " + this.numero + "...");
    }

    public void discar(String numero) {
        System.out.println("Discando para " + numero + "...");
    }

    public void acessar(String url) {
        System.out.println("Acessando " + url + "...");
    }

    public void reproduzir(String musica) {
        System.out.println("Reproduzindo " + musica + "...");
    }

    public void desligar() {
        System.out.println("Desligando iphone... Boa noite.");
    }

}