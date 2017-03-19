package XOX;

import java.util.ArrayList;
import java.util.List;

public class EasyAiGameStrategy implements AiGameStrategy {

    private boolean check(List freePlaces, int buttonPressed, int button, int exist, int nope) {
        return buttonPressed == button && !freePlaces.contains(exist) && freePlaces.contains(nope);
    }

    @Override
    public int aiMakeTurn(int[] field, int num) {
        List freePlaces = new ArrayList();
        for (int i = 0; i < field.length; i++) {
            if (field[i] == 0) {
                freePlaces.add(i);
            }
        }

        if (check(freePlaces, num, 2, 1, 0) ||
                check(freePlaces, num, 3, 6, 0) ||
                check(freePlaces, num, 4, 8, 0) ||
                check(freePlaces, num, 6, 3, 0) ||
                check(freePlaces, num, 8, 4, 0)) {
            return 0;
        }
        if (check(freePlaces, num, 0, 2, 1) ||
                check(freePlaces, num, 2, 0, 1) ||
                check(freePlaces, num, 4, 7, 1) ||
                check(freePlaces, num, 7, 4, 1)) {
            return 1;
        }
        if (check(freePlaces, num, 0, 1, 2) ||
                check(freePlaces, num, 1, 0, 2) ||
                check(freePlaces, num, 4, 6, 2) ||
                check(freePlaces, num, 4, 8, 2) ||
                check(freePlaces, num, 6, 4, 2) ||
                check(freePlaces, num, 6, 4, 2)) {
            return 2;
        }
        if (check(freePlaces, num, 4, 5, 3) ||
                check(freePlaces, num, 5, 4, 3) ||
                check(freePlaces, num, 6, 0, 3)) {
            return 3;
        }
        if (check(freePlaces, num, 3, 5, 4) ||
                check(freePlaces, num, 7, 1, 4) ||
                check(freePlaces, num, 5, 3, 4) ||
                check(freePlaces, num, 8, 0, 4)) {
            return 4;
        }

        if (check(freePlaces, num, 3, 4, 5) ||
                check(freePlaces, num, 4, 3, 5) ||
                check(freePlaces, num, 8, 2, 5)) {
            return 5;
        }

        if (check(freePlaces, num, 0, 3, 6) ||
                check(freePlaces, num, 2, 4, 6) ||
                check(freePlaces, num, 3, 0, 6) ||
                check(freePlaces, num, 4, 2, 6)) {
            return 6;
        }

        if (check(freePlaces, num, 1, 4, 7) ||
                check(freePlaces, num, 4, 1, 7) ||
                check(freePlaces, num, 6, 8, 7) ||
                check(freePlaces, num, 6, 8, 7) ||
                check(freePlaces, num, 8, 6, 7)) {
            return 7;
        }

        if (check(freePlaces, num, 0, 4, 8) ||
                check(freePlaces, num, 2, 5, 8) ||
                check(freePlaces, num, 4, 0, 8) ||
                check(freePlaces, num, 5, 2, 8)) {
            return 8;
        }

        if (field.length <= num + 1 && freePlaces.contains(num - 1)) {
            return num - 1;
        } else if (field.length <= num + 1 && freePlaces.contains(5)) {
            return 5;
        }

        if (freePlaces.contains(num + 1)) {
            return num + 1;
        }
        return (int) freePlaces.get(0);
    }
}
