package explorer;

public abstract class AirExplorer extends Explorer{
   
    public AirExplorer(String name) {
	super(name);
    }

    
    public void searchAir() {
	System.out.println(getName()+"は空中を探索した");
    }
}
    
