
public class Bucket<E1, E2> { 
	private E1 the_first; 
	private E2 the_second; 
	
	public Bucket(E1 first, E2 second){
		this.the_first = first;
		this.the_second = second;
		}
	public E1 getFirst(){
		return the_first;
		}
	public E2 getSecond(){
		return the_second;
		}
	}
