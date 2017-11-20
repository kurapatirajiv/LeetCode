public class MedianSortedArrays{
	
	public static void main(String args[]){

	int a[] = {1,3};
	int b[]	= {2};	

	double result = findMedian(a,b);
	System.out.println(result);

	}

	public static double findMedian(int a[],int b[]){

		int len1 = a.length;
		int len2 = b.length;
		
		int left = (len1 + len2 + 1)/2;
		int right = (len1 + len2 + 2)/2;

		double result = (fetchK(a,0,len1,b,0,len2,left) + fetchK(a,0,len1,b,0,len2,right))/2.0;
		return result;	
	}

	public static double fetchK(int a[],int aStart,int alength,int b[],int bStart,int blength,int k){

		if(aStart>alength-1) return b[bStart+k-1];
		if(bStart>blength-1) return a[aStart+k-1];

		if(k==1) return Math.min(a[aStart],b[bStart]);	

		int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;

		if(aStart+k/2-1 < alength) aMid = a[aStart+k/2 - 1];
		if(bStart+k/2-1 < blength) bMid = b[bStart+k/2 - 1];

		if(aMid<bMid){
			return fetchK(a, aStart+k/2 ,alength,b,bStart,blength,k-k/2);
		}
		else{
			return fetchK(a, aStart ,alength,b,bStart+k/2,blength,k-k/2);
		}

	}

}