public class PlusOne {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    int carry = 1,
	        num;
	    
	    for (int i=a.size()-1; i>=0; i--) {
	        num = a.get(i);
	        num += carry;
	        carry = 0;
	        
	        if (num == 10) {
	            num = 0;
	            carry = 1;
	        }
	        
	        a.set(i, num);
	    }
	    
	    if (carry == 1) {
	        result.add(1);
	    }
	    
	    for (int i=0; i < a.size(); i++) {
	        if (a.get(i)==0 && result.size()==0) {
    	        continue;
	        }
	        result.add(a.get(i));
	    }
	    
	    return result;
	}
}
