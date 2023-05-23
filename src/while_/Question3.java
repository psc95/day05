package while_;

public class Question3 {
public static void main(String[] args) {
	int rice = 100*1000, mouse = 2, day = 0;
	
	while(rice > 0) {
		day++;
		rice -= (mouse*20);
		if(day % 10 == 0) {
			mouse*=2;
			
		}
		
		
	}System.out.println(day+"일 후에떨어집니다");
	System.out.println("총" + mouse + "마리 입니다");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
