package Ch11_JDKfeatures;

public class annonimusEx2 {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0; i<10;i++)
			{
				System.out.println("This is child Thread");
			}
		};
		Thread t= new Thread(r);
		t.start();

	}

}
