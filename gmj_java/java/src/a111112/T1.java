package a111112;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.StreamSupport;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answer = new int[2];
		int total=48;
		for(int i=1;i<12;i++){
			for(int j=1; j<12; j++){
				if(total==i*j){
					answer[0]=i;
					answer[1]=j;
					break;
				}
			}
        }
        System.out.println(answer[0]+""+answer[1]);
    }
}

	
