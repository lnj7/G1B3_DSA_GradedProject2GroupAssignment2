package solution_1;
import java.util.*;


public class SkyscraperBuilder {

	public SkyscraperBuilder() {
		
	}	
	 void floorsBuild(int a[],int n) {
		 
		int max=n;

		PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<n;i++){
			int day=i+1;
			System.out.println("Day : "+day+"\n");
			
			
			q.add(a[i]);
			
			while((!q.isEmpty())&&(q.peek()==max)){
				
				System.out.print(q.peek()+" ");
				q.poll();
				
				max--;
				
			}
			
			System.out.println("\n");

		}

		
	}
	public void manager()
	{
		int n;
				
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the total no of floors in the building  ");
		n=sc.nextInt();

		int floors[]=new int[n];
		
		
		for(int i=0;i<n;i++){
			
			int onDay=i+1;
			
			System.out.println("enter the floor size given on day :"+onDay+"\n");
			int floor=sc.nextInt();

			floors[i]=floor;

		}
		sc.close();
		
		floorsBuild(floors,n);        

	}

}
