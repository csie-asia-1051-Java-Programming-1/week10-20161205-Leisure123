package ex;

public class Person {
	private String name,gender;
	private float height , weight , BMI;
	public Person(String name1,String g,float h,float w ,float bmi){
		name = name1;
		height = h;
		weight = w;
		BMI = bmi;
		switch(g){
		case"1":
			gender = "男生";
		case"2":
			gender = "女生";
		}
	}
	float fun(){
		return BMI;
	}
	public void show(){
		System.out.println(name +"\t"+gender +"\t"+height 
						+"\t"+weight +"\t"+ BMI);
	}

}
