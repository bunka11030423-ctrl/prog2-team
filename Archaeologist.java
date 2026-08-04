package treasure.explorer;

import treasure.treasure.Treasure;

public class Archaeologist extends GroundExplorer {
    public Archaeologist() {
        setName("考古学者");
    }

    @Override
    public void explore(Treasure treasure) {
        System.out.println(getName() + "は地上から探索する");
        
        int bonusValue = (int)(treasure.getValue() * 1.5);
        addScore(bonusValue);

        System.out.println(treasure.getName() + "を発見！能力で点数アップ！ (" 
                           + bonusValue + "点)");
    }
}
