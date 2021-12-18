package pairmatching.view;

import static pairmatching.util.Constants.*;

import java.util.List;

public class OutputView {

    public static void printMatchingResult(List<String> fairs) {
        System.out.println(FAIR_RESULT_MSG);
        for (int i = 0; i < fairs.size(); i+=2) {
            String singleFair = fairs.get(i);
            singleFair += " : " + fairs.get(i+1);
            if (fairs.size() % 2 == 1 && i == fairs.size() - 1) {
                singleFair += " : " + fairs.get(i);
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
