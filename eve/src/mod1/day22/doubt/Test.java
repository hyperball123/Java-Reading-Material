package mod1.day22.doubt;

public class Test{
	
	public String name;
	
	@In
	public String name2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", name2=" + name2 + "]";
	}
	
}