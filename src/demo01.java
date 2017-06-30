import java.util.Scanner;
public class demo01 {
public static void main(String[] args) {
		int classNum=3;
		int stuNum=4;
		int sum=0;
		float avg;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("请输入第"+i+"组学生成绩");
			for(int j=1;j<=4;j++){
				
				System.out.println("请输入第"+j+"名学生成绩");
				int score=input.nextInt();
				sum+=sum;
				
			}
			avg=sum/4;
			sum=0;
			System.out.println("第"+i+"组"+"平均成绩为"+avg);
			
		}
		
	}

}
