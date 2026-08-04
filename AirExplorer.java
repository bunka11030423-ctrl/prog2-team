package treasure.explorer;

import treasure.treasure.Treasure;

public abstract class AirExplorer extends Explorer {
    private int failRate = 20;

    public AirExplorer() {
    }

    public void setFailRate(int failRate) {
        this.failRate = failRate;
    }

    @Override
    public void explore(Treasure treasure) {
        int chance = new java.util.Random().nextInt(100);
        if (chance < failRate) {
            System.out.println(getName() + " は上空から探索したが何も見つからなかった！");
            return;
        }

        System.out.println(getName() + " は上空から探索した！");
        addScore(treasure.getValue());
        System.out.println(treasure.getName() + "を見つけた！");
    }
}
