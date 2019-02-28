package com.cybertek.utilities;

public class ExcelExerciese {

    public static void main (String[] args) {

        // Copy Path  >        /Users/serdarduru/Documents/Framework/my-bookitacceptancetest/src/test/resources/test_data/light-side-test-data.xlsx
        //Copy Relative Path >  test_data/light-side-test-data.xlsx
        // We need >           /src/test/resources/test_data/light-side-test-data.xlsx
        String path = "./src/test/resources/test_data/light-side-test-data.xlsx";
        String sheetName = "light-side-users";

        ExcelUtil userData = new ExcelUtil(path, sheetName);

        System.out.println("userData row count :" + userData.rowCount());
        System.out.println("userData column count : " + userData.columnCount());


        System.out.println(userData.getColumnsNames());
        System.out.println(userData.getDataList());


    }
}
