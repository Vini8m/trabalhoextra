public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando instâncias de Livro
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899, "978-85-359-0272-0");
        Livro livro2 = new Livro("O Alquimista", "Paulo Coelho", 1988, "978-85-326-2520-6");
        Livro livro3 = new Livro("A Moreninha", "Joaquim Manuel de Macedo", 1844, "978-85-359-0293-0");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Criando uma instância de Usuario
        Usuario usuario = new Usuario("Carlos Silva", "U123");

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Buscando um livro pelo título
        Livro livroBuscado = biblioteca.buscarLivroPorTitulo("O Alquimista");
        if (livroBuscado != null) {
            // Emprestando o livro
            usuario.emprestarLivro(livroBuscado);
        }

        // Listando livros disponíveis após o empréstimo
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo o livro
        usuario.devolverLivro(livroBuscado);

        // Listando livros disponíveis após a devolução
        biblioteca.listarLivrosDisponiveis();
    }
}