class OOP{
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	YMD cal = new YMD();
	
	YMD.year = 23;
	System.out.println("year=" + YMD.year);
	
	YMD.month(5);
	YMD.day(23);
	cal.time(13);
	
	cal.ap();
	System.out.println("time zone=" + cal.ap);
  }

}

class YMD{
  static int year;
  String ap;
  int time;
  
  	static void month(int a) {
	  if(a>12) {
		return;			
	  }else{
		System.out.println("month=" + a);
	  }
	}
  	
	static void day(int a) {
	  if(a>31) {
	 	return;
  	  }else {
		System.out.println("day=" + a);
	  }
	}
	
	int time(int a) {
	  if(a>24) {
	    return time;
      }else {
    	this.time = a;
    	System.out.println("time="+ a);
	  }
	return a;
	}
	void ap() {
	  if(time>12) {
		  ap = "pm";
	  }else {   ap = "am";
	  
	  }
	}  
}