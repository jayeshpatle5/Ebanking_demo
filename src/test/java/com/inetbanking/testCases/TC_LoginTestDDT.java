package com.inetbanking.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.BaseClass;
import com.inetbanking.Utilities.XLUtils;

public class TC_LoginTestDDT extends BaseClass
{
    @Test(dataProvider = "logindata")
	public void loginDDT(String str1,String str2,String str3){

System.out.println(str1+ " "+str2+" "+str3);


	}

	@DataProvider(name = "logindata")
	String[][] getData() throws Throwable
	{
//		String path = "C:\\Users\\SPURGE\\Documents\\inetBankingV1\\src\\test\\java\\com\\inetbanking\\TestDa ta\\LoginDataXL.xlsx";

		int rownum= XLUtils.getRowCount( "LoginDetails");
		int colcount = XLUtils.getCellCount( "LoginDetails", 1);

		String[][] logindata = new String[rownum][colcount];
		for(int i =1;i<=rownum;i++ )
		{
			for(int j =0; j<colcount;j++)
			{
				logindata[i-1][j] = XLUtils.getCellData( "LoginDetails", i , j);	
			}
		}
		return logindata; 
	}

}
