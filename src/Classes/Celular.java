package Classes;

public class Celular {

    private String nome;
    private String sistemaOperacional;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public Celular(String nome, String sistemaOperacional) {
        this.nome = nome;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return "Celular [nome=" + nome + ", Sistema peracional=" + sistemaOperacional + "]";
    }

    
}