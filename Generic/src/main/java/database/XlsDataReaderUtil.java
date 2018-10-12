package database;

import java.util.ArrayList;

public class XlsDataReaderUtil {
    static Xls_Reader reader;
    public static ArrayList<Object[]> getDataFromExcel(){
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new Xls_Reader("/Users/renxing/SeleniumTest18/WebAutomation/Amazon10/data/dataofAmazon.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // change only sheet name in line 19
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  email = reader.getCellData("Sheet1", "email",rowNum );
            String message = reader.getCellData("Sheet1","message", rowNum);
            Object obj[] = {email, message};
            myData.add(obj);
        }
        return  myData;
    }
}

