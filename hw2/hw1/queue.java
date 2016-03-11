import java.util.*;
import loader.TrashCanAb;
public class queue extends TrashCanAb
{
	private int[] arr = new int[10000];
	private int ptr;
	public queue(){
		ptr=0;
	}
	public void Insert(int garbage) {
		arr[ptr++]=garbage;
	}
	public void Empty() {
		for(int i=0;i<ptr;++i){
			arr[i]=0;
		}
	}
	public String ToString() {
		String s="[";
		String tmp="";
		for(int i=0;i<ptr;++i){
			tmp=arr[i]+",";
			s+=tmp;
		}
		int len=s.length()-1;
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