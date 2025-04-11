package models;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicacao, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;

    }

    public String getTitulo(){
        return titulo;

    }

    public String getAutor(){
        return autor;

    }

    public int getAnoPublicacao(){
        return anoPublicacao;

    }

    public double getPreco(){
        return preco;

    }

    public void setTitulo(String titulo){
        this.titulo = titulo;

    }

    public void setAutor(String autor){
        this.autor = autor;

    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;

    }

    public void setPreco(double preco){
        this.preco = preco;

    }

    public void exibirInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano de publicação: "+ anoPublicacao);
        System.out.println("Preço: R$ "+preco);
        System.out.println("-------------------");
        
    }

    
}