package TSK_207.TSK_207_1;

import java.util.List;
import java.util.Random;

public class Program {
    Game game = new Game();
    Random random = new Random();

    public static void firstInfLoop() {
        while (true) {
            System.out.println("Этот цикл будет выполняться бесконечно.");
        }
    }

    public static void secondInfLoop() {
        do {
            System.out.println("Этот цикл будет выполняться бесконечно.");
        } while (true);
    }

    public static void thirdInfLoop() {
        for (;;) {
            System.out.println("Этот цикл будет выполняться бесконечно.");
        }
    }

    public static void quadroInfLoop() {
        for (int index = 1; index > 0; index++) {
            System.out.println("Этот цикл будет выполняться бесконечно.");
        }
    }

    public void run() {
        int score = 0;

        System.out.println("Игра идет...");

        while (!game.end()) {
            score++;
        }

        System.out.println("Игра закончилась!");

        System.out.println("Игрок набрал: " + score + " очков!");
    }

    public void main(String[] arg) {
        run();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        List<Runnable> infLoopList = List.of(
            () -> firstInfLoop(),
            () -> secondInfLoop(),
            () -> thirdInfLoop(),
            () -> quadroInfLoop()
        );

        infLoopList.get(random.nextInt(infLoopList.size())).run();
    }
}
