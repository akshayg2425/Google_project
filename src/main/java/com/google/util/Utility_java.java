package com.google.util;

public class Utility_java {

	public static boolean isExecutable(String testcase, ExcelReader excel) {

		String sheetName = "testcase";

		for (int rownum = 2; rownum <= excel.getRowCount(sheetName); rownum++) {

			if (excel.getCellData(sheetName, "test_case", rownum).equals(testcase)) {

				if (excel.getCellData(sheetName, "runmode", rownum).equalsIgnoreCase("Y"))

					return true;
				else
					return false;

			}
		}

		return false;
	}

}
