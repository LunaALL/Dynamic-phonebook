package phonebook;

import java.util.Scanner;

public class phoneinfo {
	
	
	
	static Scanner sc = new Scanner(System.in);

	
	public static void menu( ) {
		System.out.println("1,2 �� ����!");
		System.out.println("1. ������ �Է�");
		System.out.print("2. ���α׷� ���� \n");
	    
	}
	
	
	public static void readphone() {
		
		System.out.print("�̸� : ");
		String R_name=sc.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		String P_num= sc.nextLine();
		
		
		System.out.print("������� : ");
		String P_birth= sc.nextLine();
		
		System.out.println("�Էµ� ������ ����մϴ�....");
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
			System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�. �ٽ� �Է�");
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
			System.out.println("1,2 �� ����!");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ���α׷� ����");
		    
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
			System.out.println("�̸�: "+name);
			System.out.println("��ȭ��ȣ : " + phoneNumber);
			
			if ( birthday!=null) {
				System.out.println("������� :" + birthday);
				
			}
		}
	 
	 
	 
 }
