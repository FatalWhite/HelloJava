package fatalvirus;

import fatalvirus.lab.SungJukVO;

public class Classes {

	public static void main(String[] args) {

		// 클래스 - 객체를 만들기 위한 틀, 설계도
		Animal tiger = new Animal();
		tiger.name = "호돌이";
		tiger.weight = 100;
		tiger.type = "호랑이";
		tiger.gender = "남자";

		tiger.move();
		tiger.eat();

		System.out.println(tiger.name);
		System.out.println(tiger.type);
		System.out.println(tiger.gender);
		System.out.println(tiger.weight);

		// shark
		Animal shark = new Animal();
		shark.name = "상철이";
		shark.weight = 1000;
		shark.type = "물고기";
		shark.gender = "수";

		shark.eat();
		shark.move();

		System.out.println(shark.gender);
		System.out.println(shark.name);
		System.out.println(shark.type);
		System.out.println(shark.weight);

		// eagle
		Animal eagle = new Animal();
		eagle.gender = "암";
		eagle.name = "독순이";
		eagle.type = "새";
		eagle.weight = 50;

		eagle.eat();
		eagle.move();

		System.out.println(eagle.gender);
		System.out.println(eagle.name);
		System.out.println(eagle.type);
		System.out.println(eagle.weight);

		Animal tiger2 = new Animal();
		System.out.println(tiger2.name);
		System.out.println(tiger2.gender);
		System.out.println(tiger2.weight);
		System.out.println(tiger2.type);

		Animal cat = new Animal();
		System.out.println(cat.name);
		System.out.println(cat.gender);
		System.out.println(cat.weight);
		System.out.println(cat.type);

		cat = new Animal("고순이", 25, "여자", "고양이");
		System.out.println(cat.name);
		System.out.println(cat.gender);
		System.out.println(cat.weight);
		System.out.println(cat.type);

		// 회원가입
		Member m = new Member();
		m.userid = "";
		m.passwd = "";

		m = new Member("zzyzzy", "987654", "혜교", "abc13@xyz987.com", "2017-12-15");

		// SungJukVO 클래스를 이용하기
		SungJukVO sj = new SungJukVO("혜교", 99, 98, 78);
		System.out.printf("%s %d %d %d", sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
		System.out.println(sj);
	}

}

class Animal { // 동물 클래스
	// 필드 (멤버변수)
	String name;
	int weight;
	String gender;
	String type;

	// private Animal() {} // 생성자
	// Animal() {
	// name = "호순이";
	// type = "호랑이";
	// gender = "여자";
	// weight = 45;
	// } // (매개변수parameter 없는) 생성자

	// Animal(String name, int weight, String gender, String type) {
	// this.name = name;
	// this.weight = weight;
	// this.gender = gender;
	// this.type = type;
	// } // 매개변수 있는 생성자

	// 기본생성자
	public Animal() {
	}

	// 매개변수 있는 생성자
	public Animal(String name, int weight, String gender, String type) {
		super();
		this.name = name; // 관례
		this.weight = weight;
		this.gender = gender;
		this.type = type;
	}

	// public Animal(String a int b, String c, String d) {
	// super();
	// this.name = a;
	// this.weight = b;
	// this.gender = c;
	// this.type = d;
	// }

	// 메서드
	void move() {
		System.out.println(name + "가 움직였다.");
	}

	void eat() {
		System.out.println(name + "가 먹이를 먹었다.");
	}

	// setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

class Car {
	// private String name;
	String name;
	int size;

	// 클래스는 클래스의 멤버변수로 선언가능
	Engin engin;
	Door door;
	Wheel wheel;
}

class Engin {
}

class Door {
}

class Wheel {
}

class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;

	// 기본생성자
	public Member() {
	}

	// 매개변수 있는 생성자
	public Member(String userid, String passwd, String name, String email, String regdate) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}

}