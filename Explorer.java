package explorer;

public abstract class Explorer {
    private String name;

    public Explorer(String name) {
	this.name=name;
    }

    
    public String getName() {
	return name;
    }

    public abstract void search():
}
    
    
