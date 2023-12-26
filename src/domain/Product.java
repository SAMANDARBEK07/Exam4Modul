package domain;

import TypeEnums.CategoryEnum;

public class Product {
    private Integer sequence=0;
    {
        sequence++;
    }
    String name;
    private Integer productID=sequence;
    private Integer amount;
    CategoryEnum categoryEnum=CategoryEnum.TECHNALOGY;

    public Product(String name, Integer productID, Integer amount) {
        this.name = name;
        this.productID = productID;
        this.amount = amount;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sequence=" + sequence +
                ", name='" + name + '\'' +
                ", productID=" + productID +
                ", amount=" + amount +
                ", categoryEnum=" + categoryEnum +
                '}';
    }
}
