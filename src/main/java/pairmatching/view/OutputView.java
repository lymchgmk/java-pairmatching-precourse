package pairmatching.view;

import static pairmatching.util.Constants.*;

import java.util.List;

public class OutputView {

    public static void printMatchingResult(List<String> fairs) {
        System.out.println(FAIR_RESULT_MSG);
        for (int i = 0; i < fairs.size() / 2; i++) {
            String singleFair = fairs.get(2*i) + " : " + fairs.get(2*i + 1);
            if (fairs.size() % 2 == 1 && i == fairs.size() / 2 - 1) {
                singleFair += " : " + fairs.get(fairs.size() - 1);
            }
            System.out.println(singleFair);
        }
    }

    public static void printExit() {
        System.out.println(EXIT_MSG);
    }

    public static void printErrorMsg(Exception e) {
        System.out.println(e.getMessage());
    }
}
