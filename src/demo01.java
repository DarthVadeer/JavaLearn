import java.util.Scanner;
public class demo01 {
public static void main(String[] args) {
		int classNum=3;
		int stuNum=4;
		int sum=0;
		float avg;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("�������"+i+"��ѧ���ɼ�");
			for(int j=1;j<=4;j++){
				
				System.out.println("�������"+j+"��ѧ���ɼ�");
				int score=input.nextInt();
				sum+=sum;
				
			}
			avg=sum/4;
			sum=0;
			System.out.println("��"+i+"��"+"ƽ���ɼ�Ϊ"+avg);
			
		}
		
	}

}
