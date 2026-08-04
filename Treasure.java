package treasure.treasure;

public abstract class Treasure {
    private String name;
    private int value;

    public Treasure() {
    }

    public Treasure(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getValue() { return value; }
    public void setValue(int value) { this.value = value; }

    public static Treasure generateRandomTreasure() {
        int percent = new java.util.Random().nextInt(100);

        if (percent < 5) {
            return new LegendaryTreasure("伝説の宝", 200);
        } else if (percent < 30) {
            return new RareTreasure("珍しい宝", 50);
        } else {
            return new CommonTreasure("普通の宝", 10);
        }
    }

    public static Treasure generateRandomTreasureForAdventurer() {
        int percent = new java.util.Random().nextInt(100);

        if (percent < 15) {
            return new LegendaryTreasure("伝説の宝", 200);
        } else if (percent < 40) {
            return new RareTreasure("珍しい宝", 50);
        } else {
            return new CommonTreasure("普通の宝", 10);
        }
    }
}
