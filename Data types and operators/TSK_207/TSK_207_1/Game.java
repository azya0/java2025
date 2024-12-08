package TSK_207.TSK_207_1;

import java.util.Random;

public class Game {
    Random random = new Random();
    
    public boolean end() {
        return random.nextInt(0, 100000000) == 18022004;
    }
}
