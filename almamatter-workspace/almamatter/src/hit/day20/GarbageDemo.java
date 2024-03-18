package hit.day20;

public class GarbageDemo {
	public static void main(String[] args) {
		GrandFather daddu=new GrandFather();
		daddu=null;
		
		System.gc();
	}
}

class GrandFather{
	private String gold="gold is under the tree.....";
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called..");
		System.out.println(gold);
	}
}
