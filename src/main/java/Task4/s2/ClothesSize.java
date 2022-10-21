package Task4.s2;

public enum ClothesSize {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        if (this.equals(ClothesSize.XXS)) {
            return "Child size";
        }
        return "Adult size";
    }

    public int getEuroSize() {
        return euroSize;
    }
}
