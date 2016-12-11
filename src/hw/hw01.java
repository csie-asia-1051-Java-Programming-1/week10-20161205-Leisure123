package hw;
/*
 * Topic:某間學校舉辦英文檢定測驗，若是學生通過該測驗，則能通過畢業門檻。老師準備的英文測驗中分為三個項目當作考試，分別是聽力、閱讀、口說。
 	每一個項目測驗滿分皆為 100 分，總分為 300 分。想要通過測驗有兩種方式。
	方式一:若是三個項目分數皆為 60 分以上 ( 包含 60 分 ) 即為通過測驗。
	方式二:若三個項目中有其中一個項目分數未滿 60 分，但三個項目分數總合超過 220 分，也可算通過測驗。
	(若三個項目中有其中一個項目分數未滿 60 分，而三個項目分數總合也沒能超過 220 分，可獲得補考機會。 
	 若是三個項目中有兩個項目不及格，但另一個項目成績高於 80 分 ( 包含 80 分 ) ，也可獲得補考的機會。
	 其餘皆判定為無法通過測驗。
	說明: 第一行為一個整數 N ，代表共有 N 組測試資料。之後有 N 行，每一行有 3 個非負整數 ( 範圍皆為 0 到 100), 
	分別代表該名學生聽力、閱讀、口說的測驗分數。若是通過測驗，則輸出 ”P” 。若是需要補考，則輸出 ”M” 。若是無法通過測驗， 則輸出 ”F”
 * Date: 2016/12/05
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
import java.util.ArrayList;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <String> Level = new ArrayList<String>();
		System.out.print("請問要輸入幾位學生的成績:");
		int n = scn.nextInt();
		boolean check = true;
		int listen = 0 , study = 0, speak = 0, a ,sum;
		for(int i = 0 ; i < n ; i++){
			while(check){
				System.out.print("請輸入第"+(i+1)+"位同學的聽力成績:");
				a = scn.nextInt();
				if(a >= 0 && a <= 100){
					listen = a;
					check = false;
				}else{
					System.out.println("您輸入了一個無效數字，請重新輸入一次聽力成績!");
				}
			}
			check = true;
			while(check){
				System.out.print("請輸入第"+(i+1)+"位同學的閱讀成績:");
				a = scn.nextInt();
				if(a >= 0 && a <= 100){
					study = a;
					check = false;
				}else{
					System.out.println("您輸入了一個無效數字，請重新輸入一次閱讀成績!");
				}
			}
			check = true;
			while(check){
				System.out.print("請輸入第"+(i+1)+"位同學的口試成績:");
				a = scn.nextInt();
				if(a >= 0 && a <= 100){
					speak = a;
					check = false;
				}else{
					System.out.println("您輸入了一個無效數字，請重新輸入一次口試成績!");
				}
			}
			check = true;
			sum = listen+study+speak;
//			System.out.println(sum);
			if(listen >= 60 && study >= 60 && speak >= 60){
				Level.add("Pass(^ω^)");
			}else if((listen >= 60 && study >= 60 && speak < 60)||(listen < 60 && study >= 60 && speak >= 60)||(listen >= 60 && study < 60 && speak >= 60)){
				if(sum >= 220){
					Level.add("Pass(^ω^)");
				}else if(sum < 220){
					Level.add("Make up(@_@)");
				}
			}else if((listen >= 80 && study < 60 && speak < 60)||(listen < 60 && study >= 80 && speak < 60)||(listen < 60 && study < 60 && speak >= 80)){
				Level.add("Make up(@_@)");
			}else{
				Level.add("False(-A-)");
			}
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println("第" + (i + 1) + "位同學" + Level.get(i));
		}

	}

}
