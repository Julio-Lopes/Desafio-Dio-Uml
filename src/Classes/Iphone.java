package Classes;

import Interfaces.Chamada;
import Interfaces.Navegador;
import Interfaces.Player;

public class Iphone extends Celular implements Chamada, Player, Navegador {
    private String modelo;

    public Iphone(String nome, String sistemaOperacional, String modelo) {
        super(nome, sistemaOperacional);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Iphone [modelo=" + modelo + ", Nome=" + getNome() + ", Sistema operacional="
                + getSistemaOperacional() + "]";
    }

    @Override
    public void telefone(int op) {
        Chamada.super.telefone(op);
    }

    @Override
    public void musica(int op) {
        Player.super.musica(op);
    }

    @Override
    public void navegador(int op) {
        Navegador.super.navegador(op);
    }
    
}