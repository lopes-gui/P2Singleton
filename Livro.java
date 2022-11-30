





public class Livro {
    Genero  genero; 
    Autor autor;
    Ano ano;
    Nome nome;
    Saidadata  exit;
    Devoluçao  devolucao;
    Quantidade qtd;
   

    public Livro(Genero genero, Autor autor, Ano ano, Nome nome, Saidadata exit, Devoluçao devolucao, Quantidade qtd) {
        this.genero = genero;
        this.autor = autor;
        this.ano = ano;
        this.nome = nome;
        this.exit = exit;
        this.devolucao = devolucao;
        this.qtd = qtd;
    }


    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Ano getAno() {
        return ano;
    }

    public void setAno(Ano ano) {
        this.ano = ano;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    
}
