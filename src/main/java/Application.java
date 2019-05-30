import common.FileUtil;
import output.Hypothesis;

import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String... args) throws Exception {
        Set<String> wwidSet = FileUtil.getWWIDSet();
        List<Hypothesis> hypothesisList = FileUtil.getHypothesisList(wwidSet);
        for (Hypothesis h : hypothesisList) {

        }
    }

}
