package pairmatching.view;

import static pairmatching.util.Constants.*;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String selectFunction() {
        System.out.println(SELECT_FUNCTION_MENU);
        return Console.readLine();
    }

    public static String fairMatchingFunction() {
        System.out.println(SELECT_CLM_MENU);
        return Console.readLine();
    }

    public static boolean isRematch() {
        System.out.println(FAIR_REMATCH_MSG);
        return Console.readLine().equals("네");
    }

    public static String fairLookUpFunction() {
        System.out.println(SELECT_CLM_MENU);
        return Console.readLine();
    }

    public static String fairInitFunction() {
        System.out.println(FAIR_INIT_MSG);
        return Console.readLine();
    }
}
