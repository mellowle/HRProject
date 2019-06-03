import adapters.EducationSheetAdapter;
import adapters.EmployeeDemographcisSheetAdapter;
import adapters.PerformanceRatingsSheetAdapter;
import adapters.TalentMovementSheetAdapter;
import common.FileUtil;
import common.RelatedRows;
import output.Hypothesis;
import sheets.EducationSheet;
import sheets.EmployeeDemographcisSheet;
import sheets.PerformanceRatingsSheet;
import sheets.TalentMovementSheet;

import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String... args) throws Exception {
        Set<String> wwidSet = FileUtil.getWWIDSet();
System.err.println(wwidSet.size());


//        List<Hypothesis> hypothesisList = FileUtil.getHypothesisList(wwidSet);
//        for (Hypothesis h : hypothesisList) {
//            System.out.println("wwid : " + h.getWWID());
//            RelatedRows relatedRows = FileUtil.getRelatedRows(h);

//            EmployeeDemographcisSheet ed = EmployeeDemographcisSheetAdapter.toDomain(relatedRows.getEmployeeDemographcisRow());
//            if (ed != null) {
//                System.err.println(ed.toString());
//            }else{
//                System.out.println("=============================================================");
//                continue;
//            }
//            EducationSheet e = EducationSheetAdapter.toDomain(relatedRows.getEducationRow());
//            if (e != null) {
//                System.err.println(e.toString());
//            }else{
//                System.out.println("=============================================================");
//                continue;
//            }
            //            break;
//            PerformanceRatingsSheet p = PerformanceRatingsSheetAdapter.toDomain(relatedRows.getPerformanceRatingRow());
//            if (p != null) {
//                System.err.println(p.toString());
//            }else{
//                System.out.println("=============================================================");
//                continue;
//            }
//            TalentMovementSheet t = TalentMovementSheetAdapter.toDomain(relatedRows.getTalentMovementRow());
//            if (t!=null) {
//                System.err.println(t.toString());
//            }else{
//                System.out.println("=============================================================");
//                continue;
//            }
//            //
//            //            HypothesisAdapter.toDomain(h, ed, e, p, t);
//            //            System.err.println(h.toString());
//            //            break;
//
//            System.out.println("=============================================================");
//            break;
//        }
    }
}
