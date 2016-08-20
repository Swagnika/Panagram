
import java.util.*;

public class panagram {
	public static void main(String[] args){

		Set<Character> s = new HashSet<Character>();
		Set<Character> s1 = new HashSet<Character>();
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		str=str.toLowerCase();
		char[] carr=str.toCharArray();
		for(char i='a';i<='z';i++){
			s1.add(i);
		}
		for (char a : carr){
			{
				if(a>='a' && a<='z'){
					s.add(a);
				}
			}
		}
		if(s.size()==26){
			System.out.println("pangram");
		}
		else{
			System.out.println("not a pangram");
            s1.removeAll(s);
			System.out.print("not present :");
			for(char c: s1){
				System.out.print(c+" ");
			}
		}
	}
}
