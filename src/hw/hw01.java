package hw;
/*
 * Topic:�Y���Ǯ��|��^���˩w����A�Y�O�ǥͳq�L�Ӵ���A�h��q�L���~���e�C�Ѯv�ǳƪ��^����礤�����T�Ӷ��ط�@�ҸաA���O�Oť�O�B�\Ū�B�f���C
 	�C�@�Ӷ��ش��纡���Ҭ� 100 ���A�`���� 300 ���C�Q�n�q�L���禳��ؤ覡�C
	�覡�@:�Y�O�T�Ӷ��ؤ��ƬҬ� 60 ���H�W ( �]�t 60 �� ) �Y���q�L����C
	�覡�G:�Y�T�Ӷ��ؤ����䤤�@�Ӷ��ؤ��ƥ��� 60 ���A���T�Ӷ��ؤ����`�X�W�L 220 ���A�]�i��q�L����C
	(�Y�T�Ӷ��ؤ����䤤�@�Ӷ��ؤ��ƥ��� 60 ���A�ӤT�Ӷ��ؤ����`�X�]�S��W�L 220 ���A�i��o�ɦҾ��|�C 
	 �Y�O�T�Ӷ��ؤ�����Ӷ��ؤ��ή�A���t�@�Ӷ��ئ��Z���� 80 �� ( �]�t 80 �� ) �A�]�i��o�ɦҪ����|�C
	 ��l�ҧP�w���L�k�q�L����C
	����: �Ĥ@�欰�@�Ӿ�� N �A�N��@�� N �մ��ո�ơC���ᦳ N ��A�C�@�榳 3 �ӫD�t��� ( �d��Ҭ� 0 �� 100), 
	���O�N��ӦW�ǥ�ť�O�B�\Ū�B�f����������ơC�Y�O�q�L����A�h��X ��P�� �C�Y�O�ݭn�ɦҡA�h��X ��M�� �C�Y�O�L�k�q�L����A �h��X ��F��
 * Date: 2016/12/05
 * Author: 105021011 �B�Э�
 */
import java.util.Scanner;
import java.util.ArrayList;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <String> Level = new ArrayList<String>();
		int n = scn.nextInt();
		boolean check = true;
		int listen = 0 , study = 0, speak = 0, a ,sum;
		for(int i = 0 ; i < n ; i++){
			while(check){
				a = scn.nextInt();
				if(a >= 0 && a <= 100){
					listen = a;
					check = false;
				}else{
					System.out.print("��J�F�@�ӵL�ļƦr�A�Э��s��J�@��ť�O���Z:");
				}
			}
			check = true;
			while(check){
				a = scn.nextInt();
				if(a >= 0 && a <= 100){
					study = a;
					check = false;
				}else{
					System.out.print("��J�F�@�ӵL�ļƦr�A�Э��s��J�@���\Ū���Z:");
				}
			}
			check = true;
			while(check){
				a = scn.nextInt();
				if(a >= 0 && a <= 100){
					speak = a;
					check = false;
				}else{
					System.out.print("��J�F�@�ӵL�ļƦr�A�Э��s��J�@���f�զ��Z:");
				}
			}
			check = true;
			sum = listen+study+speak;
//			System.out.println(sum);
			if(listen >= 60 && study >= 60 && speak >= 60){
				Level.add("Pass(^�s^)");
			}else if((listen >= 60 && study >= 60 && speak < 60)||(listen < 60 && study >= 60 && speak >= 60)||(listen >= 60 && study < 60 && speak >= 60)){
				if(sum >= 220){
					Level.add("Pass(^�s^)");
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
			System.out.println(Level.get(i));
		}

	}

}
