package ciftbulan;
import java.util.Scanner;
public class ciftbulan {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int k;
		System.out.println("Bir sayı giriniz");
		k=scanner.nextInt();
		for(int i=1;i<=k;i++) {
			
			if(i%12==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
