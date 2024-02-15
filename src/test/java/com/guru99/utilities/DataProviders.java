package com.guru99.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {


	@DataProvider(name="Data")
	public String[][] getAllData() throws IOException
	{
		String path=System.getProperty("user.dir")+"//testData//Userdata.xlsx";
		XLUtility xl=new XLUtility(path);
	
		int rownum=xl.getRowCount("Sheet1");	
		int colcount=xl.getCellCount("Sheet1",1);
		
		String exceldata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{		
			for(int j=0;j<colcount;j++)
			{
				exceldata[i-1][j]= xl.getCellData("Sheet1",i, j);  
			}
		}
	
		return exceldata;
	}
}
