import java.util.Scanner;
import java.util.Random;

public class Jokenpo {

    int escolhaDoJogo;
    int escolhaDoComputador;
    String Jogador;
    String Computador;

    Scanner leitor = new Scanner(System.in);
    Random random = new Random();


    public void coletarDados(){
        Scanner scanner = new Scanner(System.in);

        //obtendo os dados do jogador
        System.out.println("-----------------------------");
        System.out.println("*** Vamos jogar Jokenpô! ***");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("---------------------------------");
        System.out.print("Digite a sua escolha: ");
        escolhaDoJogo = leitor.nextInt();
        escolhaDoComputador = random.nextInt(3) + 1;

        exibirPorExtenso();

    }
    public void exibirPorExtenso(){
        if (escolhaDoJogo == 1) {
            Jogador = "pedra";
        }else if (escolhaDoJogo == 2){
            Jogador = "papel";
        }else if (escolhaDoJogo == 3){
            Jogador = "tesoura";
        }

        if (escolhaDoComputador == 1) {
            Computador = "pedra";
        }else if (escolhaDoComputador == 2) {
            Computador = "papel";
        }else if (escolhaDoComputador == 3){
            Computador = "tesoura";
        }

        System.out.println("");
        System.out.println("Você escolheu: " + Jogador);
        System.out.println("O computador escolheu: " + Computador);
        System.out.println("");

        derterminarResultados();
    }

    public void derterminarResultados() {

        if (escolhaDoJogo == escolhaDoComputador) {
            System.out.println("*** E M P A T E ***");
        } else if (escolhaDoJogo == 1 && escolhaDoComputador == 3) {
            System.out.println("*** V O C Ê   V E N C E U ***");
        } else if (escolhaDoJogo == 2 && escolhaDoComputador == 1) {
            System.out.println("*** V O C Ê   V E N C E U ***");
        } else if (escolhaDoJogo == 3 && escolhaDoComputador == 2) {
            System.out.println("*** V O C Ê   V E N C E U ***");
        } else {
            System.out.println("*** V O C Ê   P E R D E U ***");
        }

    }

}



