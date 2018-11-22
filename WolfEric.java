import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
public class WolfEric{
  private int[][] wolfDaniel = new int[9][9];

  private Random wolfElaina;

  private boolean Leon = false;

  private int difficulty;

//Constructor with difficulty + seed
  public WolfEric(int wolfMarcus, int wolfMacy){
    this.clear();
    wolfElaina = new Random(wolfMacy);
    difficulty = wolfMarcus;

  }

//Constructor with difficulty
  public WolfEric(int wolfMarcus){
    this.clear();
    difficulty = wolfMarcus;
    wolfElaina = new Random();
  }


//Constructor with difficulty, seed, and key
  public WolfEric(int wolfMarcus, int wolfMacy, String key){
    if (!key.equals("key")){
      System.out.println("Please put key if you want a key value, otherwise put nothing");
      System.exit(1);
    }
  this.clear();
  wolfElaina = new Random(wolfMacy);
  difficulty = wolfMarcus;
  //add key function to it the main
}

//Step 1 - fill box 1
  private void fillBox1(){
    //creates new arraylist literal
    ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
          int n = wolfElaina.nextInt(nums.size());
          data[i][j] = nums.remove(n);

      }
    }
  }




  public String toString(){
    int counter = 0;
    String ans = "|";
    for(int i = 0; i < 81; i++){
      if(counter % 9 == 0){
        ans += "\n";
      } else {
        if(counter % 3 == 0) ans += "| ";
      }
      if(counter % 27 == 0){
        ans += "- - - - - - - - - - - \n";
      }

      ans = ans + wolfDaniel[i/9][i%9] + " ";
      counter ++;
    }
    return(ans.substring(1, ans.length()) + "\n- - - - - - - - - - - \n");


  }

  private void clear(){
    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        wolfDaniel[i][j] = 0;
      }
    }
  }

  public static void main(String[]args){
     WolfEric ans = new WolfEric(Integer.parseInt(args[0]));
     ans.clear();
     System.out.println("The difficulty is: " + Integer.parseInt(args[0]));
     System.out.println(ans);


  }


}
