import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      SISTEMA DE NOTAS ESCOLAR");
        System.out.println("====================================");

        // Nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        double[] notas = new double[8];

        System.out.println("\nDigite as notas dos 4 bimestres:");
        System.out.println("(Cada bimestre tem 2 notas)");

        // Entrada de notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        // Médias bimestrais
        double media1 = (notas[0] + notas[1]) / 2;
        double media2 = (notas[2] + notas[3]) / 2;
        double media3 = (notas[4] + notas[5]) / 2;
        double media4 = (notas[6] + notas[7]) / 2;

        // Médias semestrais
        double sem1 = (media1 + media2) / 2;
        double sem2 = (media3 + media4) / 2;

        // Média final
        double finalMedia = (sem1 + sem2) / 2;

        // Exibição
        System.out.println("\n=========== RESULTADO ===========");
        System.out.println("Aluno: " + nome);
        System.out.printf("1º Semestre: %.2f%n", sem1);
        System.out.printf("2º Semestre: %.2f%n", sem2);
        System.out.printf("Média Final: %.2f%n", finalMedia);

        // Situação
        System.out.print("Situação: ");

        if (finalMedia >= 7) {
            System.out.println("APROVADO 🎉");
        } else if (finalMedia >= 5) {
            System.out.println("RECUPERAÇÃO ⚠️");
        } else {
            System.out.println("REPROVADO ❌");
        }

        System.out.println("====================================");
        System.out.println("Obrigado por usar o Sistema Escolar!");
        entrada.close();
    }
}

