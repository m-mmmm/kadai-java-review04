package animal;

public class Human extends Animal implements Thinkable {

	private String hobby;

	//gettrt setter
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	//コンストラクタ
	public Human() {
	}

	public Human(String name, int age, String hobby) {
	super(name, age);
	this.setHobby(hobby);
	}
	@Override
	public void think() {
	System.out.println("私は" + hobby + "について考えています。");

	}



}
