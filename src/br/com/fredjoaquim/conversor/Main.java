// Define o pacote onde essa classe está localizada.
// Pacotes organizam o projeto e evitam conflitos de nomes.
package br.com.fredjoaquim.conversor;

// Importa a classe ConsoleMenu que está em outro pacote.
import br.com.fredjoaquim.conversor.UI.ConsoleMenu;

// Classe principal da aplicação.
// Toda aplicação Java começa pelo método main.
public class Main {

    // Método principal. É o ponto de entrada da aplicação.
    public static void main(String[] args) {

        // Criamos um objeto do tipo ConsoleMenu.
        // Isso instancia (cria na memória) a classe responsável pelo menu.
        ConsoleMenu menu = new ConsoleMenu();

        // Chamamos o método start() que inicia o fluxo do programa.
        menu.start();
    }
}