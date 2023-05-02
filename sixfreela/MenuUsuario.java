package sixfreela;

import Controller.FreelasController;
import Cores.Cores;
import freelas.BackEnd;
import freelas.FullStack;

import java.io.IOException;
import java.util.Scanner;

public class MenuUsuario {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome, celular, linkedin = "";
        int areaAtuacao, valor;
        int opcao, buscar, op, atualizar;

        FreelasController usuario = new FreelasController();

        FullStack us1 = new FullStack(usuario.gerarNumero(), "Vito Corleone", "984572357", 1, 1000, "");
        usuario.cadastrar(us1);
        BackEnd us2 = new BackEnd(usuario.gerarNumero(), "Ellie Miller", "947865217", 2, 1500, "");
        usuario.cadastrar(us2);
        BackEnd us3 = new BackEnd(usuario.gerarNumero(), "Octavia E.Butler", "968745642", 2, 3500, "");
        usuario.cadastrar(us3);
        FullStack us4 = new FullStack(usuario.gerarNumero(), "Tyller Durden", "9647832150", 1, 1200, "");
        usuario.cadastrar(us4);

        while (true) {
            System.out.println(Cores.TEXT_YELLOW_BRIGHT +
                    """
                            _________________________________________________________
                            |                                                       |
                            |            _ __ ___   ___ _ __  _   _\s               |
                            |           | '_ ` _ \\ / _ \\ '_ \\| | | |             |
                            |           | | | | | |  __/ | | | |_| |                |  
                            |           |_| |_| |_|\\___|_| |_|\\__,_|              |           
                            |                                                       |
                            --------------------------------------------------------
                            |                                                       |
                            |            1 - Quero me Cadastrar                     |
                            |            2 - Acessar meus dados	                    |
                            |            3 - Acessar todos 	                        |
                            |            4 - Sair'					                |
                            |            		                                    |
                            |            		                                    | 
                            _________________________________________________________
                            Entre com a opção desejada:  
                            				""");
            opcao = ler.nextInt();

            if (opcao == 4) {
                System.out.println(
                        Cores.TEXT_YELLOW_BRIGHT + "\nO FreelasTech agradece sua participação, até a próxima!!!!!");
                ler.close();
                System.exit(0);
            }
            switch (opcao) {
                case 1:
                    System.out.println(Cores.TEXT_YELLOW_BRIGHT + "Cadastrando um novo Usuário:\n ");
                    ler.nextLine();
                    System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\nFavor Entrar com Nome e Sobrenome:\n ");
                    nome = ler.nextLine();

                    System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\ninforme celular: \n ");
                    celular = ler.nextLine();
                    do {

                        System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\nInforme sua área de atuação em desenvolvimento,"
                                + " sendo 1 para Full stack e 2 para BeckEnd: ");

                        areaAtuacao = ler.nextInt();
                    } while (areaAtuacao != 1 && areaAtuacao != 2);

                    System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\nInforme valor por hora: \n ");
                    valor = ler.nextInt();
                    ler.nextLine();
                    switch (areaAtuacao) {
                        case 1:

                            usuario.cadastrar(
                                    new FullStack(usuario.gerarNumero(), nome, celular, areaAtuacao, valor, linkedin));

                            break;
                        case 2:

                            usuario.cadastrar(new BackEnd(usuario.gerarNumero(), nome, celular, areaAtuacao, valor, linkedin));
                            break;
                    }
                    break;

                case 2:
                    System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\nInformações de usuário: ");
                    System.out.println("\n==========================================");
                    System.out.println("\nDigite seu ID: ");
                    buscar = ler.nextInt();
                    usuario.procurarPorNumero(buscar);
                    do {
                        System.out.println(Cores.TEXT_YELLOW_BRIGHT + "\nDigite 1 para Atualizar suas informações");
                        System.out.println(Cores.TEXT_YELLOW_BRIGHT + "\nDigite 2 para Remover seu cadastro");
                        System.out.println(Cores.TEXT_YELLOW_BRIGHT + "\nDigite 3 para voltar ao Menu");
                        op = ler.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Digite o seu ID: ");
                                atualizar = ler.nextInt();

                                if (usuario.buscarNaCollection(atualizar) != null) {

                                    System.out.println(Cores.TEXT_YELLOW_BRIGHT + "Atualizar o Usuário:\n ");
                                    ler.nextLine();
                                    System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\nFavor Entrar com Nome e Sobrenome:\n ");
                                    nome = ler.nextLine();

                                    System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\ninforme celular: \n ");
                                    celular = ler.nextLine();
                                    do {

                                        System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\nInforme sua área de atuação em desenvolvimento,"
                                                + " sendo 1 para Full stack e 2 para BeckEnd: ");

                                        areaAtuacao = ler.nextInt();
                                    } while (areaAtuacao != 1 && areaAtuacao != 2);

                                    System.out.printf(Cores.TEXT_YELLOW_BRIGHT + "\nInforme valor por hora: \n ");
                                    valor = ler.nextInt();
                                    ler.nextLine();
                                    switch (areaAtuacao) {
                                        case 1:
                                            usuario.atualizar(new FullStack(atualizar, nome, celular, areaAtuacao, valor, linkedin));
                                            break;
                                        case 2:
                                            usuario.atualizar(new BackEnd(atualizar, nome, celular, areaAtuacao, valor, linkedin));
                                            break;
                                    }
                                } else {
                                    System.out.println("Usuario não encontrado !!!");
                                }
                                break;
                            case 2:
                                System.out.println("Digite o seu ID: ");
                                int apaga = ler.nextInt();
                                usuario.deletar(apaga);


                                break;
                            case 3:
                                System.out.println("\nObrigado, suas Atualizações foram feitas!!!");

                        }
                        keyPress();
                        break;
                    } while (op != 3);
                case 3:
                    System.out.println(Cores.TEXT_YELLOW_BRIGHT + "Veja os profissionais que temos disponíveis !!!!");
                    usuario.acessarTodos();
                    keyPress();

                    break;
                default:
                    System.out.println(Cores.TEXT_YELLOW_BRIGHT + "\nOpção Invalida, favor seguir com uma opção valida");
                    break;
            }
            while (opcao == 0)
                ;

        }
    }

    private static void keyPress() {
        try {
            System.out.println("\n\nPressione enter para continuar...");
            System.in.read();
        } catch (IOException e) {
            System.out.println("\nVocê pressionou uma tecla diferente do Enter...");

        }

    }
}
