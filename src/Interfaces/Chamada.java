package Interfaces;

public interface Chamada {

    public default void telefone(int op){
        switch (op) {
            case 1:
                System.out.println("Celular tocando");
                break;
            case 2:
                System.out.println("Atendendo celular");
                System.out.println("Alo?");
                break;
            case 3:
                System.out.println("Ligação não atendida deixe seu recado");
                break;
            default:
                break;
        }
    }
}
