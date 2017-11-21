package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		// Random 한 수를 얻어낼 수 있는 Random 객체 생성
		Random ran = new Random();
		
		/*
		 * 	1. int 를 저장할 수 있는 방 5 개짜리 int[] 객체를
		 * 
		 *  생성해서 0~9 사이의 렌덤한 정수를 각각 대입해 보세요.
		 *  
		 *  - hint
		 *  
		 *  int ranNum = ran.nextInt(10);
		 */
		
		//랜덤한 숫자를 저장할 int[] 객체 생성
		int[] nums = new int[5];
		
		//배열의 방의 갯수만큼 반복문 수행
		for(int i = 0; i < nums.length; i++) {
			//0~9 사이의 랜덤한 숫자 얻어내기
			int ranNum = ran.nextInt(10);
			// i 번재 항에 대입하기 
			nums[i] = ranNum;
		}
		
		System.out.println("main 메소드를 종료합니다!");
	}
}
