package pairmatching.model;

import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static pairmatching.util.Constants.*;

public class CLM {
    String course;
    String level;
    String mission;

    public CLM(String course, String level, String mission) {
        this.course = course;
        this.level = level;
        this.mission = mission;
    }

    public CLM(String line) {
        Pattern pattern = Pattern.compile(CLM_PATTERN);
        Matcher matcher = pattern.matcher(line);
        System.out.println(matcher);
        if (matcher.find()) {
            this.course = matcher.group("course");
            this.level = matcher.group("level");
            this.mission = matcher.group("mission");
        }
    }

    public String getCourse() {
        return course;
    }

    public String getLevel() {
        return level;
    }

    public String getMission() {
        return mission;
    }

    public HashMap<String, String> getCLMMap() {
        HashMap<String, String> CLMMap = new HashMap<>();
        CLMMap.put("course", course);
        CLMMap.put("level", level);
        CLMMap.put("mission", mission);
        return CLMMap;
    }

    public boolean equal(CLM a, CLM b) {
        return Objects.equals(a.getCourse(), b.getCourse()) && Objects.equals(a.getLevel(), b.getLevel())
            && Objects.equals(a.getMission(), b.getMission());
    }
}
