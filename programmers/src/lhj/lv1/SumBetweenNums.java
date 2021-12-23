package lhj.lv1;

import java.util.Scanner;

public class SumBetweenNums {
	public static void main(String[] args) {
		
	int a =3;
	int b= 5;
	long answer = 0;
        
		if (a>b) {
			for (; b <= a; b++) {
				answer += b;
			}
		}
		if (a<b) {
			for (; a <= b; a++) {
				answer += a;
			}
		}
	
        System.out.println(answer);
		/*int count = 0;
		for (int i=1; i<=1000; i++) {
			if (i % 2 == 0) {
				count += i;
				System.out.println("count:"+count+", i:"+i);
			}
		}
		*/
		/*
		InputStream inputstream = System.in;
		try {
			int a = inputstream.read();
			System.out.println(a);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		
		
	}
	
	public static void input(int i) {
		for(int x=1;x<=i;x++) {
			for(int y=1;y<=9;y++) {
				System.out.println(x + " * " + y + " = " + (int)(x*y));
			}
			System.out.println();
		}
	}
	
	

    public long solution(int a, int b) {
        long answer = 0;
        
        if (a >= b){
            answer+=a;
            a++;
        }
        else if (a <= b){
            answer+=b;
            b++;
        }
        else return a;
        
        return answer;
    }

	
}
