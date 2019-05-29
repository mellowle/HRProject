package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.RelocationSheet;

public class RelocationSheetAdapter {

    public RelocationSheet toDomain(Workbook workbook) {
        Sheet sheet = workbook.getSheet("Relocation");
        return setProperties(sheet);
    }

    private RelocationSheet setProperties(Sheet sheet) {
        RelocationSheet relocationSheet = new RelocationSheet();

        relocationSheet.setRelocationList(null);

        return relocationSheet;
    }
}
