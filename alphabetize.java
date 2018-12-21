
public class alphabetize {

	public static void main(String[] args) {
		String presidentList[]= {"blank","Washington","Adams","Jefferson","Madison","Monroe","Adams","Jackson","Van Buren","Harrison","Tyler","Polk","Taylor","Fillmore","Pierce","Buchanan","Lincoln"};
		
		int n=presidentList.length-1;
		
		for (int i=1; i<=n-1; i++) {
			for (int j=1; j<=(n-i); j++) {
				boolean inOrder =(presidentList[j].compareTo(presidentList[j+1])<=0);
				if (!inOrder) {
					String temporaryString=presidentList[j];
					presidentList[j]=presidentList[j+1];
					presidentList[j+1]=temporaryString;
				}
			}
		}
		for (int i=1; i<=n; i++) {
			System.out.println(presidentList[i]);
		}
	}
}

//public class numericalOrder {
//
//	public static void main(String[] args) {
//		int nums[]= {0,10,1,9,2,8,3,7,4,6,5,11};
//		
//		int n=nums.length-1;
//		
//		for (int i=1; i<=n-1; i++) {
//			for (int j=1; j<=(n-i); j++) {
//				boolean inOrder =(nums[j] < nums[j+1]);
//				if (!inOrder) {
//					int temp=nums[j];
//					nums[j]=nums[j+1];
//					nums[j+1]=temp;
//				}
//			}
//		}
//		for (int i=1; i<=n; i++) {
//			System.out.println(nums[i]);
//		}
//	}
//}