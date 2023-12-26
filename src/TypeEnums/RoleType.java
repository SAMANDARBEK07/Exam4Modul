package TypeEnums;

public enum RoleType {
    CUSTOMER(1, "Xaridor"),
    OWNER(2, "Sotuvchi");

    private final int index;
    private final String name;

    RoleType(int index, String name) {
        this.index = index;
        this.name = name;
    }
}
