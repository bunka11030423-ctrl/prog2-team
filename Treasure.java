public abstract class Treasure{
    public String name;
    public int point;

    public void getMessage(){
	System.out.println(this.name + "を獲得した！");
    }
}
