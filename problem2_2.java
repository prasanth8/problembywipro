package problem;

import java.util.*;
public class problem2_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
String str[]=new String[3];
int hint;
int len;
String str1[][]=new String[3][3];
		System.out.println("Enter the string");
		for(int i=0;i<3;i++)
			str[i]=in.next();
		for(int i=0;i<3;i++){
		if(str[i].length()%3==0)
			hint=0;
		else if(str[i].length()%3==1)
			hint=1;
		else
			hint=-1;
		len=((str[i].length()%3==2)?(str[i].length()/3)+1:(str[i].length()/3));
		str1[i][0]=str[i].substring(0,len);
		str1[i][1]=str[i].substring(len,(len+len)+(hint));
		str1[i][2]=str[i].substring((len+len)+(hint),str[i].length());
			
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(str1[i][j]+" ");
		System.out.println();
		}
		System.out.println(str1[0][0]+str1[1][1]+str1[2][2]);
		System.out.println(str1[0][1]+str1[1][2]+str1[2][0]);
		System.out.println(str1[0][2]+str1[1][0]+str1[2][1]);
	}
}
