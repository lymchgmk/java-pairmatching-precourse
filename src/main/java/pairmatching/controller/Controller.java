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

import pairmatching.model.Fair;
import pairmatching.util.InputValidator;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Controller {
    InputValidator inputValidator;
    String option;
    List<Fair> fairs;

    public Controller() {
        this.inputValidator = new InputValidator();
        this.option = "";
        this.fairs = new ArrayList<>();
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
            case "2":
                fairLookUp();
            case "3":
                fairInit();
            case "Q":
                exit();
        }
    }

    private void fairMatching() {
    }

    private void fairLookUp() {
    }

    private void fairInit() {
    }

    private void exit() {
    }
}
