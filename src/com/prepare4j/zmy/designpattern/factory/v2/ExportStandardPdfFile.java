package com.prepare4j.zmy.designpattern.factory.v2;

public class ExportStandardPdfFile implements ExportFile
{
    public boolean export(String data)
    {
        System.out.println("导出标准PDF文件");
        return true;
    }
}
