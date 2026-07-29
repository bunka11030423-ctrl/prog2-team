public class Archaeologist extends LandExplorer{
    public void ScoreUp(Treasure t){
	System.out.println(this.name+"は発掘して宝を見つけた！");
	t.Point()+=10;
    }
}
	    
	
