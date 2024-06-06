import Classes.Iphone;

public class Mobile {
    public static void main(String[] args) {
        Iphone iphone15ProMax = new Iphone("Iphone", "IOS", "Iphone pro max");

        System.out.println(iphone15ProMax);

        System.out.println("");
        System.out.println("Musica");
        iphone15ProMax.musica(1);
        iphone15ProMax.musica(2);
        iphone15ProMax.musica(3);

        System.out.println("");
        System.out.println("Telefone");
        iphone15ProMax.telefone(1);
        iphone15ProMax.telefone(2);
        iphone15ProMax.telefone(3);

        System.out.println("");
        System.out.println("Navegador");
        iphone15ProMax.navegador(1);
        System.out.println("");
        iphone15ProMax.navegador(2);
        System.out.println("");
        iphone15ProMax.navegador(3);
    }
}
