package pairmatching.util;

public class Constants {

    public static final String SELECT_FUNCTION_MENU = "기능을 선택하세요.\n"
        + "1. 페어 매칭\n"
        + "2. 페어 조회\n"
        + "3. 페어 초기화\n"
        + "Q. 종료";
    public static final String SELECT_CLM_MENU = "#############################################\n"
        + "과정: 백엔드 | 프론트엔드\n"
        + "미션:\n"
        + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n"
        + "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n"
        + "  - 레벨3: \n"
        + "  - 레벨4: 성능개선 | 배포\n"
        + "  - 레벨5: \n"
        + "############################################";
    public static final String SELECT_CLM_MSG = "과정, 레벨, 미션을 선택하세요.\n"
        + "ex) 백엔드, 레벨1, 자동차경주";
    public static final String FAIR_REMATCH_MSG = "매칭 정보가 있습니다. 다시 매칭하시겠습니까?";
    public static final String FAIR_RESULT_MSG = "페어 매칭 결과입니다.";
    public static final String FAIR_INIT_MSG = "초기화 되었습니다.";
    public static final String EXIT_MSG = "프로그램을 종료합니다.";

    public static final String CLM_PATTERN = "^(?<course>[a-zA-Z가-힣0-9]+),\\s?(?<level>[a-zA-Z가-힣0-9]+),\\s?(?<mission>[a-zA-Z가-힣0-9]+)$";

}
