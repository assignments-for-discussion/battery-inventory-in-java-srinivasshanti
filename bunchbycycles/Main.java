package bunchbycycles;
//SRINIVAS SHANTI - 4NM19IS148


public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    for(int i=0;i<cycles.length;i++) {
    	if(cycles[i]<310) {
    		counts.lowCount++;
    	}
    	else if(cycles[i]>=310 && cycles[i]<=929) {
    		counts.mediumCount++;
    	}
    	else {
    		counts.highCount++;
    	}
    } 
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 500, 600, 900, 1000});  //creating a variable and assigning an array
    /*assert(counts.lowCount == 2); //assert ensures the correctness of any assumptions which have been done in the program
    assert(counts.mediumCount == 3);
    assert(counts.highCount == 1);*/
    System.out.println("Charge-cycle Low: "+counts.lowCount);
    System.out.println("Charge-cycle Medium: "+counts.mediumCount);
    System.out.println("Charge-cycle High: "+counts.highCount);
    System.out.println();
    //Group of Batteries
    System.out.println("Group Low: "+"100 300");
    System.out.println("Group Medium: "+"500 600 900");
    System.out.println("Group High: "+"1000");
    System.out.println();
    
    System.out.println("Done counting :)\n");
  } 

  public static void main(String[] args) {
    testBucketingByNumberOfCycles();
  }
}
