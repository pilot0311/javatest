
public class exam07 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 
		Car myCar1 = new Car("빨강",0);
		Car myCar2 = new Car("파랑",0);
		Car myCar3 = new Car("초록",0);
		Car myCar4 = new Car(0);		
		
		myCar1.upSpeed(50);
		System.out.println("자동차1의 색상은 "+myCar1.getColor()+" 이며, 속도는 "+myCar1.getSpeed()+"km 입니다.");
		
		myCar2.downSpeed(20);
		System.out.println("자동차2의 색상은 "+myCar2.getColor()+" 이며, 속도는 "+myCar2.getSpeed()+"km 입니다.");
		
		myCar3.upSpeed(250);
		System.out.println("자동차3의 색상은 "+myCar3.getColor()+" 이며, 속도는 "+myCar3.getSpeed()+"km 입니다.");
		myCar4.upSpeed(250);
		System.out.println("자동차34의 색상은 "+myCar4.getColor()+" 이며, 속도는 "+myCar4.getSpeed()+"km 입니다.");
		System.out.println("자동차34의 색상은 "+myCar4.getColor()+" 이며, 속도는 "+myCar4.getSpeed()+"km 입니다.");

	}

}
