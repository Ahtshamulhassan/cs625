public class waterSong{
public static void main (string[] args){
int waterNum=9;
string word="bottles";
while(waterNum>0){
	if(waterNum==1)
	{
	  word="bottle";
	}
	system.out.printIn(waterNum + " " + word + " of water on the wall");
	system.out.printIn(waterNum + " " + word + " of water");
	system.out.printIn("Take one down.");
	system.out.printIn("Pass it around");
	waterNum=waterNum-1;
	if(waterNum>0){
	  system.out.printIn(waterNum + " " + word +" of water on the wall");
	}
	else
	{
	system.out.printIn("No more bottles of water on the wall");
	}
   }
  }
 }