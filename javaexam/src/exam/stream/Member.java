package exam.stream;

public class Member {
	public static int MALE=0;
	public static int FEMALE=1;
	
	public String Name;
	public int sex;
	public int age;
	
	public Member(String name, int sex, int age) {
		this.Name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
