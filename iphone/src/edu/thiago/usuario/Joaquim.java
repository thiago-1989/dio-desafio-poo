package edu.thiago.usuario;

import edu.thiago.funcionalidades.iphone.Iphone;

public class Joaquim {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        iphone.ligar("555");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.selecionarMusica("Bachianas Nº7");
        iphone.reproduzir();
        iphone.pausar();
        iphone.exibirPagina("https://web.dio.me/home");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
