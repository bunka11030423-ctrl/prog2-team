public class Archaeologist extends LandExplorer{
	Archaeologist(String name){
		super(name);
	}
	
    public void ScoreUp(Treasure t){
	System.out.println(getName()+"は発掘して宝を見つけた！");
	t.Point()+=10;
    }
}
	    
	
