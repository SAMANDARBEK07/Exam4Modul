package domain;

public class Category {
    private Integer sequence=0;
    {
        sequence++;
    }
    private Integer id=sequence;
    private String categooryName;
    private Integer productID;

    public Category(String categooryName, Integer productID) {
        this.categooryName = categooryName;
        this.productID = productID;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategooryName() {
        return categooryName;
    }

    public void setCategooryName(String categooryName) {
        this.categooryName = categooryName;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    @Override
    public String toString() {
        return "Category{" +
                "sequence=" + sequence +
                ", id=" + id +
                ", categooryName='" + categooryName + '\'' +
                ", productID=" + productID +
                '}';
    }
}
