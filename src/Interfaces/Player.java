package Interfaces;

public interface Player {

    public default void musica(int op){
        switch (op) {
            case 1:
                System.out.println("Tocando musica");
                break;
            case 2:
                System.out.println("Musica pausada");
                break;
            case 3:
                System.out.println("Selecione a musica");
                System.out.println("Rock - POP - Sertanejo");
                break;
            default:
                break;
        }
    }
}
