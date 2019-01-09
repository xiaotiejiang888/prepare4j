package com.prepare4j.zmy.designpattern.factory.v2;

public class ExportStandardHtmlFile implements ExportFile
{
    public boolean export(String data)
    {
        System.out.println("导出标准HTML文件");
        return true;
    }
}