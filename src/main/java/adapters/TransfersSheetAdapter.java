package adapters;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import sheets.TransfersSheet;

public class TransfersSheetAdapter {

    public TransfersSheet toDomain(Workbook workbook) {
        Sheet sheet = workbook.getSheet("transfers");
        return setProperties(sheet);
    }

    private TransfersSheet setProperties(Sheet sheet) {
        TransfersSheet transfersSheet = new TransfersSheet();

        transfersSheet.setStartDate(null);
        transfersSheet.setEndDate(null);
        transfersSheet.setOrganizations(null);
        transfersSheet.setWorkerType(null);
        transfersSheet.setCountry(null);
        transfersSheet.setTransferList(null);

        return transfersSheet;
    }
}
