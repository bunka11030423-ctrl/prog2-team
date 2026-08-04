package treasure.explorer;

import treasure.treasure.Treasure;

public abstract class Explorer {
    private String name;
    private int score = 0;

    public Explorer() {
    }

    public Explorer(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getScore() { return score; }

    public void addScore(int points) {
        this.score += points;
    }

    public abstract void explore(Treasure treasure);
}
