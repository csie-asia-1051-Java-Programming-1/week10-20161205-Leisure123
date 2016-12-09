package ex;
/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，
 * 		每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Person> perList = new ArrayList <Person>();
		boolean check = true;
		while(check){
			System.out.print("請輸入名字:");
			String name = scn.next();
			System.out.print("請輸入性別(男生填1,女生填2):");
			String gender = scn.next();
			System.out.print("請輸入身高:");
			float h = scn.nextFloat();
			System.out.print("請輸入體重:");
			float w = scn.nextFloat();
			float BMI = w / (h * h);
			if(perList.size() == 0){
				perList.add(new Person(name,gender,h,w,BMI));
			}else if(perList.size() == 1){
				if(perList.get(0).fun() > BMI){
					perList.add(new Person(name,gender,h,w,BMI));
				}else{
					perList.add(0,new Person(name,gender,h,w,BMI));
				}
			}else{
				boolean flag = true ;
				int i = 0;
				while(flag && i < perList.size()-1){
					if(i == 0 && perList.get(0).fun() < BMI){
						perList.add(0,new Person(name,gender,h,w,BMI));
						flag = false;
					}else{
						if(perList.get(i).fun() > BMI && perList.get(i+1).fun() <= BMI){
							flag = false;
							perList.add(i+1,new Person(name,gender,h,w,BMI));
						}else{
							i++;
						}
					}
				}
			}
			System.out.print("是否繼續輸入(Y/N)");
			char a = scn.next().charAt(0);
			if(a == 'n' || a == 'N'){
				check = false;	
			}
		}
		for(int i = 0 ; i < perList.size() ; i++){
			perList.get(i).show();
		}
	}
}