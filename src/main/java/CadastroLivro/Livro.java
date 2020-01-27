package CadastroLivro;

public class Livro {

    private String nome;
    private String autor;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Livro(String nome, String autor, String descricao) {
        this.nome = nome;
        this.autor = autor;
        this.descricao = descricao;
    }


}

