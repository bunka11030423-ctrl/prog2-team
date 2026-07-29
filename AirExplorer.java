package explorer;

public abstract class AirExplorer extends Explorer{
 	public AirExplorer(String name) {
	 super(name);
	}
	public void searchAir() {
	System.out.println(getName()+"は空を探索した");
    }
}
    
