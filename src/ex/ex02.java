package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n = scn.nextInt();
		float sum1 = 0;
		float sum2 = 0;
		if(n <= 120){
			sum1 = n * 2.1f;
			sum2 = n * 2.1f;
			System.out.println("夏月費用:" + sum1);
			System.out.print("非夏月費用:" + sum2);
		}else if(120 < n && n <= 330){
			sum1 = 252f + (n-120) * 3.02f;
			sum2 = 252f + (n-120) * 2.68f;
			System.out.println("夏月費用:" + sum1);
			System.out.print("非夏月費用:" + sum2);
		}else if(330 < n && n <= 500){
			sum1 =886.2f + (n-330) * 4.39f;
			sum2 =814.8f + (n-330) * 3.61f;
			System.out.println("夏月費用:" + sum1);
			System.out.print("非夏月費用:" + sum2);
		}else if(500 < n && n <= 700){
			sum1 =1632.5f + (n-500) * 4.97f;
			sum2 =1428.5f + (n-500) * 4.01f;
			System.out.println("夏月費用:" + sum1);
			System.out.print("非夏月費用:" + sum2);
		}else if(700 < n){
			sum1 =2626.5f + (n-700) * 5.63f;
			sum2 =2338.8f + (n-700) * 4.5f;
			System.out.println("夏月費用:" + sum1);
			System.out.print("非夏月費用:" + sum2);
		}

	}

}
