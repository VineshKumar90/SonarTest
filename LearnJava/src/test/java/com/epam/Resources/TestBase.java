package com.epam.Resources;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Component
public class TestBase {

    public WebDriver driver;
    public String vin = "Nice";
    private static XSSFWorkbook workbook;
    private static XSSFSheet sheet;
    private static XSSFRow row;
    private static XSSFCell cell;
    public static Logger log = Logger.getLogger(Log.class.getName());


    public void excelReader(){
        int rowCount = 0;
        int colCount = 0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src\\test\\java\\com\\epam\\Resources\\FlightData.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = workbook.getSheet("flight");
        rowCount =  sheet.getLastRowNum()+1;
        colCount = sheet.getRow(0).getLastCellNum();
        System.out.println(rowCount);
        System.out.println(colCount);
        for (int i=1;i<rowCount;i++){
             row = sheet.getRow(i);
            for(int j=0;j<colCount;j++){
                cell = row.getCell(j);
                cell.setCellValue("Vinesh");
                System.out.println(cell.getStringCellValue());
            }
        }
    }

    public void writeExcel(){
        int rowCount = 0;
        int colCount = 0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src\\test\\java\\com\\epam\\Resources\\FlightData.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = workbook.getSheet("flight");
        rowCount =  sheet.getLastRowNum()+1;
        colCount = sheet.getRow(0).getLastCellNum();
        System.out.println(rowCount);
        System.out.println(colCount);
        for (int i=1;i<rowCount;i++){
            row = sheet.getRow(i);
            for(int j=0;j<colCount;j++){
                cell = row.getCell(j);
                cell.setCellValue("Vinesh");
                System.out.println(cell.getStringCellValue());
            }
        }
    }



}
