
public class Incremental {
	
	private static Incremental instance;
		
	private Incremental(){
		this.count = 0;
	}
	
	public static Incremental getInstance(){
		if(Incremental.instance == null)
            Incremental.instance = new Incremental();
        

        return Incremental.instance;
	}



	
	private int count;

	public String toString(){
		return "count value: " + this.count;
	}
	
	public void increment(){
		this.count++;
	}

}
