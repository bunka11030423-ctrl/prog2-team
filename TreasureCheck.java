/*Treasure作ってみて、不安だったんでお宝の名前とポイントを表示させるやつです
 お宝名とポイントは適当です*/
public class TreasureCheck{
    public static void main(String[] args){
	System.out.println("＝＝お宝確認リスト＝＝");
	Treasure item1 = new Common("石ころ",5);
	Treasure item2 = new Rare("硬貨",10);
	Treasure item3 = new Epic("水晶玉",15);
	Treasure item4 = new Legendary("ダイヤモンド",20);

	Treasure[] treasurebox = {item1,item2,item3,item4};

	for(int i=0; i<treasurebox.length; i++){
	    System.out.println("お宝名：" + treasurebox[i].name +"(" + treasurebox[i].point + "ポイント)");
	}
    }
}
