import common.FileUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import statics.Constants;

public class Application {
    public static void main(String... args) throws Exception {
        System.err.println(Application.class.getResource("/"));
        Workbook workbook = FileUtil.getWorkBook(Constants.INPUT_FILE_PATH);
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
//        Sheet sheet = workbook.getSheet("Education");
//        Row head = sheet.getRow(0);

    }
}
