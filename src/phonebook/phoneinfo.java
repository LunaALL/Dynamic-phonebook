package phonebook;

import java.util.Scanner;

public class phoneinfo {
	
	
	
	static Scanner sc = new Scanner(System.in);

	
	public static void menu( ) {
		System.out.println("1,2 중 선택!");
		System.out.println("1. 데이터 입력");
		System.out.print("2. 프로그램 종료 \n");
	    
	}
	
	
	public static void readphone() {
		
		System.out.print("이름 : ");
		String R_name=sc.nextLine();
		
		System.out.print("전화번호 : ");
		String P_num= sc.nextLine();
		
		
		System.out.print("생년월일 : ");
		String P_birth= sc.nextLine();
		
		System.out.println("입력된 정보를 출력합니다....");
		phoneinfoDB db1= new phoneinfoDB(R_name, P_num, P_birth);
		db1.showPPDB();
		

	}
	
	
	public static void main(String[] args) {
		
		
		int num=0;
		while(true) {
		menu();
		num=sc.nextInt();
		sc.nextLine();
		if(num!=1 && num!=2) {
			System.out.println("잘못된 숫자를 입력하셨습니다. 다시 입력");
		}
		switch(num) {
		case 1:
		    readphone();
		  
			break;
			
		case 2: 
			return;
		}
		
		}
		
		
	}
	
	
	
}
 
 
 class phoneinfoDB {
	 
	    String name;
		String phoneNumber;
		String birthday;
		
		
		public static void menu( ) {
			System.out.println("1,2 중 선택!");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
		    
		}
		
		
		public phoneinfoDB(String name, String num, String birthday) {
			this.name= name;
		    phoneNumber=num;
			this.birthday=birthday;
			
		}
		
		public phoneinfoDB (String name, String num ) {
			this.name=name;
			phoneNumber= num;
			birthday=null;
			
			
		}
		
	

		public void showPPDB () {
			System.out.println("이름: "+name);
			System.out.println("전화번호 : " + phoneNumber);
			
			if ( birthday!=null) {
				System.out.println("생년월일 :" + birthday);
				
			}
		}
	 
	 
	 
 }
