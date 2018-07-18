class AdditionWithArgParam{
	static void add(int... a){
	if(a.length==0){
		System.out.println(a.length+"values are not passed");
		}
		else{
			int sum=0;
		for (int i=0;i<a.length ;i++ ){
		sum=sum+a[i];
		}
		System.out.println("result:"+sum);
       }
       }
       
	   public static void main(String[] args){

add();
//Addition.add(new int[0]);
add(5);

AdditionWithArgParam.add(5,6);

AdditionWithArgParam.add(5,6,7);
AdditionWithArgParam.add(5,6,7,8);

	
	}
}