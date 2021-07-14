package DiCh05;

public class Student {
	   //예약어 //클래스 이름
	int studentID; //학번
	String studentName; //이름
	int grade; //학년
	String address; //주소  //4개의 멤버변수
	
	public void showStudentInfo() { //메서드 추가
		System.out.println(studentName + "," + address); //이름, 주소 출력
	}
}
