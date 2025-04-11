import java.util.ArrayList;
import java.util.Scanner;

import models.Livro;

public class Main {

    public static void main(String[] args) {

        ArrayList<Livro> listaLivros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int codigo;

        do {

            System.out.println("--- Menu ---");
            System.out.println("Código | Descrição");
            System.out.println("  1    | Cadastra livro");
            System.out.println("  2    | Listar livros");
            System.out.println("  3    | Alterar livro");
            System.out.println("  4    | Remover livro");
            System.out.println("  0    | Sair");

            System.out.println("Escolha um código: ");
            codigo = sc.nextInt();
            sc.nextLine();

            switch (codigo) {

                case 1:

                    System.out.println("Digite: ");
                    System.out.println("Título: ");
                    String titulo = sc.next();

                    System.out.println("Nome do autor: ");
                    String autor = sc.next();

                    System.out.println("Ano de publicação: ");
                    int ano = sc.nextInt();

                    System.out.println("Preço: ");
                    double preco = sc.nextDouble();

                    //Não esqueça de instanciar
                    Livro livro = new Livro(titulo, autor, ano, preco);
                    listaLivros.add(livro);

                    System.out.println("Livro adcionado.");
                    
                    break;

                case 2:

                    //O is.Empty serve para ver e estar vazio o ArrayList.
                    if (listaLivros.isEmpty()) {
                        System.out.println("Nenhum foi cadastrado.");

                    }else{
                        for (Livro l : listaLivros) {
                            l.exibirInfo();
                            
                        }
                    }

                    break;

                case 3:

                    if (listaLivros.isEmpty()) {
                        System.out.println("Não há livros cadastrados.");
                        
                    }else{

                        System.out.println("Digite o titulo do livro que deseja alterar: ");
                        String alterarTitulo = sc.next();
    
                        for (Livro l : listaLivros) {
    
                            if (l.getTitulo().equalsIgnoreCase(alterarTitulo)){
                                System.out.println("Novo Título: ");
                                l.setTitulo(sc.next());
    
                                System.out.println("Novo Autor: ");
                                l.setAutor(sc.next());
    
                                System.out.println("Novo Ano de publicação");
                                l.setAnoPublicacao(sc.nextInt());
    
                                System.out.println("Novo Preço: ");
                                l.setPreco(sc.nextDouble());
    
                                System.out.println("Livro atualizado.");
    
    
                            }else{
                                System.out.println("Livro não encontrado.");

                            }
    
                        }

                    }

                    break;

                case 4:

                    System.out.print("Digite o título do livro que deseja remover: ");
                    String tituloRemover = sc.nextLine();

                    for (int i = 0; i < listaLivros.size(); i++) {
                        if (listaLivros.get(i).getTitulo().equalsIgnoreCase(tituloRemover)) {
                            listaLivros.remove(i);
                            System.out.println("Livro removido com sucesso.");
                            break;

                        }else{
                            System.out.println("Livro não encontrado.");

                        }
                    }

                    break;
                                        
                default:

                    System.out.println("Código inválido.");

                    break;
            }

            
        } while (codigo != 0);
        
    }
}