package pairmatching.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Fair {
    List<Course> courses;
    List<Crew> crews;
    List<Level> levels;
    List<String> matching;

    public Fair() {
        this.courses = new ArrayList<>();
        this.crews = new ArrayList<>();
        this.levels = new ArrayList<>();
        this.matching = new ArrayList<>();
    }

    public void setCrewNames(String course) throws IOException {
        this.crew =
    }

    private List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    private void matching() {

    }
}
