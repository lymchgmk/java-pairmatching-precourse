package pairmatching.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import camp.nextstep.edu.missionutils.Randoms;
import pairmatching.model.CLM;
import pairmatching.util.InputValidator;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Controller {
    InputValidator inputValidator;
    String option;
    Map<CLM, Boolean> matchingInfo;

    public Controller() {
        this.inputValidator = new InputValidator();
        this.option = null;
        this.matchingInfo = new HashMap<>();
    }

    public void run() {
        while (!option.equals("Q")) {
            selectFunction();
        }
        OutputView.printExit();
    }

    private void selectFunction() {
        option = InputView.selectFunction();
        switch (option) {
            case "1":
                fairMatching();
                break;
            case "2":
                fairLookUp();
                break;
            case "3":
                fairInit();
                break;
            case "Q":
                exit();
        }
    }

    private void fairMatching() {
        CLM clm = new CLM(InputView.fairMatchingFunction());
        if (!matchingInfo.containsKey(clm)) {
            OutputView.printMatchingResult(makeRandomFairs(clm));
        } else {
            if (InputView.isRematch()) {
                OutputView.printMatchingResult(makeRandomFairs(clm));
            } else {
                fairMatching();
            }
        }
    }

    private List<String> makeRandomFairs(CLM clm) {
        String course = clm.getCourse();
        List<String> crewNames = new ArrayList<>();
        try {
            if (Objects.equals(course, "백엔드")) {
                crewNames = readFile("src/main/resources/backend-crew.md");
            } else if (Objects.equals(course, "프론트엔드")) {
                crewNames = readFile("src/main/resources/frontend-crew.md");
            }
        } catch (IOException e) {
            OutputView.printErrorMsg(e);
            makeRandomFairs(clm);
        }
        return Randoms.shuffle(crewNames);
    }

    private List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    private void fairLookUp() {
    }

    private void fairInit() {
    }

    private void exit() {
    }
}
