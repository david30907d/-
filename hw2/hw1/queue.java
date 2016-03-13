import java.util.*;
import loader.TrashCanAb;
public class queue extends TrashCanAb
{
	private String str;
	public queue(){
		str="[";
	}
	public void Insert(int garbage) {
		str+=garbage+",";
	}
	public void Empty() {
		str="[]";
	}
	public String ToString() {
		int len=str.length()-1;
		String ans=s.substring(0, len);
		ans+="]";
		return ans;
	}
	public static void main(String[] args)	{
		Scanner cin=new Scanner(System.in);
		  queue q=new queue();
		  int time = cin.nextInt();
		  for(int i=0;i<time;++i){
			  int num=cin.nextInt();
			  q.Insert(num); 
		  }
		  System.out.println(q.ToString());
		  q.Empty();
		  System.out.println(q.ToString());
		  cin.close();
	}
}