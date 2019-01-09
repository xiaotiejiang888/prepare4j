package com.prepare4j.zmy.designpattern.factory.v2;

public class ExportFinancialHtmlFile implements ExportFile
{
    public boolean export(String data)
    {
        System.out.println("导出财务版HTML文件");
        return false;
    }
}