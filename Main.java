package treasure;

import treasure.explorer.*;
import treasure.treasure.*;

public class Main{
    public static void main(String[] args){
	
    System.out.println("1：冒険家");
    System.out.println("2：考古学者");
    System.out.println("3：ドローン操縦者");
    System.out.println("4：パイロット");
    System.out.print("キャラクターを選んでください:");
	boolean check=true;
    int input = new java.util.Scanner(System.in).nextInt();
    Explorer player;
    if(input<1 && input>4){
		check = false;
	}
    if(input==1){
	player=new Adventurer();
    }
    else if(input==2){
	player=new Archaeologist();
    }
    else if(input==3){
	player=new DroneOperator();
    }
    else{
	player=new Pilot();
    }

    int max=5;
    int goalScore=200;
    
    System.out.println("キャラクター:"+player.getName());
    System.out.println(max+"ターンまで");
    System.out.println(max+"ターン以内に"+goalScore+"点以上獲得でクリア！");

    for(int turn=1; turn<=max; turn++){
	System.out.println(turn+"/"+max+"ターン");
	System.out.print("探索開始！");

    int searchCount=(player instanceof DroneOperator)?2:1;

    for(int i=0;i<searchCount;i++){
	if(searchCount==2){
	    System.out.println((i+1)+"回目");
	}

    Treasure foundTreasure;
    if(player instanceof Adventurer){
	foundTreasure=Treasure.generateRandomTreasureForAdventurer();
    }else{
	foundTreasure=Treasure.generateRandomTreasure();
    }

    player.explore(foundTreasure);
    }
    System.out.println("現在の点数:"+player.getScore()+"点");
    }
    boolean isCleared=player.getScore()>=goalScore;

    System.out.println("ゲーム終了");
    System.out.println("最終得点:"+player.getScore()+"点");

    if(isCleared){
	System.out.println("ゲームクリア！！！");
    }else{
	System.out.println("ゲームオーバー");
    }
    }
}
    
    



    

