package explorer;

public abstract class LandExplorer extends Explorer{
	public LandExplorer(String name) {
		super(name);
	}
	
    public void searchLand() {
	System.out.println(getName()+"は地上を探索した");
    }
}
    
