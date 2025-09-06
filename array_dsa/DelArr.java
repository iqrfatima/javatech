package array_dsa;

public class DelArr {
    public static void delete(char[] ar,int pos){
        for(int i=pos-1;i<ar.length-1;i++){
            ar[i]=ar[i+1];
        }
        ar[ar.length-1]='0';
    }
    public static void main(String[] args) {
        char arr[]=new char[6];
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		
		//Make changes and try to insert elements at different positions
		DelArr.delete(arr, 3);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
    	

    
}
