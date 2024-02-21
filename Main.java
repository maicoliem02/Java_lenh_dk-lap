package Buoi05;
import java.util.Scanner;
/*
	 * Lệnh điều kiện 
	 * Lệnh lặp.
	 */
	
public class Main {
	public static void main(String [] args) {
		
/*
 *  Câu điều kiện if-else
 */
//		int a = 10; 
//		if ( a > 15 ) {
//			System.out.println("Hello Liem!");
//		}
		
//		int a = 100;
//		if ( a > 15 ) {
//			System.out.println("Hello Liem!");
//		}
		
//		int age = 18;
//		int money = 600000;
//		if (age < 18) {
//			System.out.println("Not old enough!");
//			}
//		else if (age < 50 && money >= 500000) { //&& hợp cả hai phải đúng điều kiện thì mới in ra welcome
//			System.out.println("Welcome!");
//		}
//		else {	// là phần cuối không cần điều kiện vì là phần cuối tất cả điều kiện trên ko đc
//			
//			System.out.println("Too old!");
//		}
//		// xét tính chẵn lẽ
//		int a = 10;
//		int b = 15;
//		if(a%2 != 0 || b%2 !=0) { //a%2 số chẵn chia hết cho 2 là số chẵn còn else ngược lại trong trường hợp này lẽ số lẽ, != khác, == thuộc , || hoặc
//			System.out.println("Hello world!");
//		} else {
//			System.out.println("Error!");
//		} 			
		
//		int a = 19; // xét chẵn lẽ 
//		if(a%2 == 0) {
//			System.out.println("Even!");
//		} else {
//			System.out.println("Odd!");
//		}
//		
/*
 *  Câu điều kiện switch-case
 *  Hoạt động chỉ với 2 case là số nguyên hoặc chuỗi là int hoặc String ""
 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input your choice: ");
//		int choose = sc.nextInt();
//		
//		switch (choose) {
//			case 1: {
//				System.out.println("Play game!");
//				break; //dùng để ngắt câu lệnh switch, ngắt vòng lập
//			}
//			case 2: {
//				System.out.println("Play music!");
//				break;
//			}
//			case 3: {
//				System.out.println("Shut down!");
//				break;
//			}
//			default: {
//				System.out.println("Invalid input!");
//			}
//			
//		}
//		sc.close();
		
		//nếu như nhập sai thì cho nhập lại cần thêm vòng lập while 
		
//		Scanner sc = new Scanner(System.in);
//		boolean running = true;
//		while (running) {
//			System.out.println("Input your choice: ");
//			int choose = sc.nextInt();
//			
//			switch (choose) {
//				case 1: {
//					System.out.println("Play game!");
//					running = false;
//					break; //dùng để ngắt câu lệnh switch, ngắt vòng lập
//				}
//				case 2: {
//					System.out.println("Play music!");
//					running = false;
//					break;
//				}
//				case 3: {
//					System.out.println("Shut down!");
//					running = false; // dùng dể ngắt nếu không sẽ kêu nhập hoài tới già luôn
//					break;
//				}
//				default: {
//					System.out.println("Invalid input!");
//				}
//				
//			}
//		}
//			sc.close();
//		
		// áp dụng pp đặt tên không cần running nữa nó hay hơn
		

		Scanner sc = new Scanner(System.in);
		user_Input:
	
		while (true) {
			System.out.println("Input your choice: ");
			int choose = sc.nextInt();
			
			switch (choose) {
				case 1: {
					System.out.println("Play game!");					
					break user_Input; //dùng để ngắt câu lệnh switch, ngắt vòng lập
				}
				case 2: {
					System.out.println("Play music!");					
					break user_Input;
				}
				case 3: {
					System.out.println("Shut down!");
					break user_Input;
				}
				default: {
					System.out.println("Invalid input!");
				}
				
			}
		}
			sc.close();
		/*
		 * Vòng lặp for
		 */
		// vòng lập for gồm có 3 vế ; 
		// vế đầu tiên : khởi tạo biến đếm tạo ra biến đếm và gán cho biến đếm đó một giá trị bắt đầu
		// vế thứ 2: kiểm tra điều kiện có thể sử dụng hợp ...
		// vế 3: diều kiện tăng tiếng biến đếm để ngưng vòng lặp.
		// arr.length : điều kiện dừng
//		for(int i=1; i <= 5; i++) {
//			System.out.println(i);
//		}
//		
//		int [] arr = new int [] {5, 3, 2, 6, 1, 9, 8, 1};
//		for (int i = 0; i < arr.length; i++) {
//			if ( arr[i]%2 != 0 ) {
//				System.out.println("At index" + i + ", value =" + arr[i]);
//			}
//		}
//		
		
//	

//		for (int i = 1; i <= 10; i ++) {
//			if (i == 5) {
//				System.out.println("Limdim");
//				continue; // ngắt lần lập, để sang một vòng lập mới
//			}
//			System.out.println(i);
//		}
		
		/*
		 * Vòng lặp for-each
		 */
		//hạn chế : không truy xuất tới các chỉ mục chỉ lấy cái số thôi
//		int [] arr = new int [] {5, 3, 2, 6, 1, 9, 8, 1};
//		for (int element : arr) {
//			if ( element%2 != 0 ) {
//				System.out.println(element);
//			}
//		}
		
//		String [] arr = new String [] {"Le", "Thanh", "Liem"};
//		for (String element : arr) {
////			if ( element%2 != 0 ) {
////				System.out.println(element);
//	//		}
//		System.out.println(element);
//		}
//		
		/* 
		 * vòng lặp while
		 */
		// biểu thức trả về true -false
//		int i = 1;
//		while (true) {
//			if (i >5) {
//				break;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		/*
		 * vòng lập do-while
		 */
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 5);
		
		/*
		 * Dùng nhãn (label) cho vòng lặp
		 */
//		i_Loop:// cách đặt tên cho vòng lặp viết lên trên vòng lặp đó
//		for (int i = 1; i <= 10; i++) {
//			j_Loop:
//			for ( int j = 1; j <= 5; j++) {
//				if ( i == 5) {
//					break i_Loop; // cần break ai thì gọi tên người đó
//				}
//				System.out.println("i,j= " + i + "," + j);
//			}
//		}
//		i_Loop:
//		for(int i = 1; i <= 10; i++ ) {
//			for(int j = 1; j <= 5; j++) {
//				if (j == 3) {
//					continue i_Loop;
//				}
//				System.out.println("i,j = " + i + "," + j);
//			}
//		}
		
		System.out.println("End program!");
		
	}
	
}
