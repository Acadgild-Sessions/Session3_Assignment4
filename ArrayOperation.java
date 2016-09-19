import java.util.Scanner;

class ArrayOperation{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int n=sc.nextInt();
		int a[]=new int[n+1];		
		System.out.println("Enter Array Elements.");
		for(int i=0; i<n;i++){
			System.out.print("a [ "+i+" ]: ");
			a[i]=sc.nextInt();
		}	
		
		System.out.println("Array Elements.");
		for(int i=0; i<n;i++){
			System.out.println("a [ "+i+" ]: "+a[i]);			
		}
		
		System.out.println("Sorted Array.");
		for(int i=0; i<n;i++){
			for(int j=0; j<n-1; j++){
				int temp=0;
				if(a[j+1]<a[j]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0; i<n;i++){
			System.out.println("a [ "+i+" ]: "+a[i]);			
		}
		
		System.out.print("Insert Element in Array : ");
		a[n]=sc.nextInt();
		System.out.println("Array After New Element Insertion.");
		for(int i=0; i<n;i++){
			for(int j=0; j<n; j++){
				int temp=0;
				if(a[j+1]<a[j]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0; i<=n;i++){
			System.out.println("a [ "+i+" ]: "+a[i]);			
		}
			
			
	}
	
}
