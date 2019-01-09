package com.prepare4j.zmy.designpattern.factory.v2;

public class ExportFinancialPdfFile implements ExportFile
{
    public boolean export(String data)
    {
        System.out.println("导出财务版PDF文件");
        return true;
    }
}