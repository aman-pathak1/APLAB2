;
public class Main
{
    // executable class 
    
	public static void main(String[] args) {
	    Add a1 = new Add(); // creating object of Add class
	    // a1 is reference varibale and address of object stroe it into heap
		
		int result = a1.add(3,5);
		//System.out.println("This is the sum: "+result);
		for(int j=2; j<11; j++){
		    for(int i=1; i<11; i++){
		        System.out.println(j+"X"+i+"="+(j * i));
		    
		    }
		    System.out.println("\n");
		}
	}
}