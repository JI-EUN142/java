package java_EXAM;

import java.util.ArrayList;
import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ids = new ArrayList<>();
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		int size = 0;
		int no = 1;
		
		while (true) {
			   System.out.println("명령어 입력 : ");
			   break;
		}
		if (cmd. equals("add")) {
			ids.add(no);
			no++;
			System.out.println("게시물 제목을 입력해주세요 : ");
			String title = sc.next();
			titles.add(title);
		}

		if (cmd.equals("list")) {
			for(int i = 0 ; i < size; i++) {
				System.out.println("번호 : " + ids.get(i));
				System.out.println("제목 : " + titles.get(i));
				System.out.println("내용 : " + bodies.get(i));
				System.out.println("================");
			
		if(cmd.equals("update")) {
			System.out.println("수정할 게시물 선택 :");
			int targetId = sc.nextInt();
			
			for(int i = 0; i < ids.size(); i++) {
				int id = ids.get(i);
				if(id == targetId) {
					System.out.println("게시물 제목을 입력해주세요 :");
					String newTitle = sc.next();
				}
			}
		}
			}
		}
}
