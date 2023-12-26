package TypeEnums;

public enum CategoryEnum {
    TECHNALOGY(1),
    FOOD(2),
    FLOWERS(3);

    final private int index;

    CategoryEnum(int index) {
        this.index = index;
    }
    public static void showCategoryEnums(){
        var categoryEnum=CategoryEnum.values();
        for (CategoryEnum category:values()) {
            System.out.println(category.index+ " "+category.name());
        }
    }
    public static CategoryEnum getByIndex(int indexSon){
        var categoryEnum=CategoryEnum.values();
        for (CategoryEnum category:values()) {
            if (category.index==indexSon){
                return category;
            }
        }
        return null;
    }
}
