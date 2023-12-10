package animal;

public class Animal {
	//フィールド 名前　年齢　趣味
	private String name;
	private int age;

	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Animal() {
	}

	//コンストラクタ 名前　年齢　趣味
	public Animal(String name, int age) {
		//フィールドに値をセットする
		this.setName(name);
		this.setAge(age);
	}

	//sayのメソッドの実行
	public void say () {
		System.out.println(name + "です。" + age + "歳です。");
		}
}








