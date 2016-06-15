package org.itstep.prokopchik;

abstract class Product {

    private String name;
    private Double price;
    private Double ndsRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price > 0)
        this.price = price;
    }

    public Double getNdsRate() {
        return ndsRate;
    }

    public void setNdsRate(Double ndsRate) {
        if(ndsRate >= 0)
        this.ndsRate = ndsRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!name.equals(product.name)) return false;
        if (!price.equals(product.price)) return false;
        return ndsRate.equals(product.ndsRate);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + ndsRate.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "'" + name + '\'' +
                ", price=" + price +
                ", ndsRate=" + ndsRate +
                "%}";
    }
}
