package com.prepare4j.zmy.designpattern.factory.v2;

public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if ("standard".equals(type))
        {
            return new ExportStandardHtmlFile();
        }
        else if ("financial".equals(type))
        {
            return new ExportFinancialHtmlFile();
        }
        return null;
    }
}
