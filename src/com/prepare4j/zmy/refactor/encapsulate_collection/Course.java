package com.prepare4j.zmy.refactor.encapsulate_collection;

public class Course {
    private String name;
    private Boolean isAdvanced;

    public Course(String name, Boolean isAdvanced) {
        this.name = name;
        this.isAdvanced = isAdvanced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdvanced() {
        return isAdvanced;
    }

    public void setAdvanced(Boolean advanced) {
        isAdvanced = advanced;
    }
}
