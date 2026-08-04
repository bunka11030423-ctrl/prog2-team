package treasure.explorer;

import treasure.treasure.Treasure;

public abstract class GroundExplorer extends Explorer {
    public GroundExplorer() {
    }

    @Override
    public void explore(Treasure treasure) {
        System.out.println(getName()+"は地上から探索している！");
        addScore(treasure.getValue());
        System.out.println(treasure.getName() + "を発見！");
    }
}
