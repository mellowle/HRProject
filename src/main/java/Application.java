import common.FileUtil;
import org.apache.poi.ss.usermodel.Workbook;
import statics.Constants;

import java.util.List;

public class Application {
    public static void main(String... args) throws Exception {
        List<String> filePaths = FileUtil.getFIlePaths(Constants.INPUT_FILE_PATH, Constants.EXCELX_FILE_EXTENSION);
        filePaths.stream().forEach(System.err::println);

        for(String filePath: filePaths) {
            Workbook workbook = FileUtil.getWorkBook(filePath);
            System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets");
        }

    }
}
