package org.itstep.prokopchik;

public enum WineTypeEnum {

    STILL_WINE("stillWine"),
    SPARKLING_WINE("sparklingWine");

    private String value;

    private WineTypeEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
