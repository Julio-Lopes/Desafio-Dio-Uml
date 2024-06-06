package Interfaces;

public interface Navegador {

    public default void navegador(int op){
        switch (op) {
            case 1:
                System.out.println("Abrindo pagina");
                System.out.println("+----------------------------+");
                System.out.println("| Produtos                   |");
                System.out.println("+----------------------------+");
                System.out.println("+----------------------------+");
                System.out.println("| Lista de Produtos          |");
                System.out.println("| - Produto 1  [Editar] [X]  |");
                System.out.println("| - Produto 2  [Editar] [X]  |");
                System.out.println("| - Produto 3  [Editar] [X]  |");
                System.out.println("| ...                        |");
                System.out.println("+----------------------------+");
                break;
            case 2:
                System.out.println("Adicionado nova aba");
                navegador(1);
                break;
            case 3:
                System.out.println("Pagina atualizada");
                navegador(1);
                break;
            default:
                break;
        }
    }
}
