package org.itstep.prokopchik;

public class Wine extends Product {

    private WineTypeEnum wineType;
    private WineColorEnum wineColor;
    private WineAgeEnum wineAge;
    private WineSugarContentEnum wineSugarContent;
    private WineCollectionEnum wineCollection;

    public WineTypeEnum getWineType() {
        return wineType;
    }

    public void setWineType(WineTypeEnum wineType) {
        this.wineType = wineType;
    }

    public WineColorEnum getWineColor() {
        return wineColor;
    }

    public void setWineColor(WineColorEnum wineColor) {
        this.wineColor = wineColor;
    }

    public WineAgeEnum getWineAge() {
        return wineAge;
    }

    public void setWineAge(WineAgeEnum wineAge) {
        this.wineAge = wineAge;
    }

    public WineSugarContentEnum getWineSugarContent() {
        return wineSugarContent;
    }

    public void setWineSugarContent(WineSugarContentEnum wineSugarContent) {
        this.wineSugarContent = wineSugarContent;
    }

    public WineCollectionEnum getWineCollection() {
        return wineCollection;
    }

    public void setWineCollection(WineCollectionEnum wineCollection) {
        this.wineCollection = wineCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Wine wine = (Wine) o;

        if (wineType != wine.wineType) return false;
        if (wineColor != wine.wineColor) return false;
        if (wineAge != wine.wineAge) return false;
        if (wineSugarContent != wine.wineSugarContent) return false;
        return wineCollection == wine.wineCollection;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + wineType.hashCode();
        result = 31 * result + wineColor.hashCode();
        result = 31 * result + wineAge.hashCode();
        result = 31 * result + wineSugarContent.hashCode();
        result = 31 * result + wineCollection.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Wine{"  + super.toString() +
                "wineType=" + wineType +
                ", wineColor=" + wineColor +
                ", wineAge=" + wineAge +
                ", wineSugarContent=" + wineSugarContent +
                ", wineCollection=" + wineCollection +
                "} ";
    }
}
