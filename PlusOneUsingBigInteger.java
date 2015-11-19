import java.math.BigInteger;

public class PlusOneUsingBigInteger {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    
	    if (a.size() == 0) {
	        result.add(1);
	        return result;
	    }
	    
	    StringBuffer str = new StringBuffer();
	    int i=0;

      for (i=0; i< a.size(); i++) {
        str.append(a.get(i));
      }

      String temp = str.toString();
      BigInteger reallyBig = new BigInteger(temp);
      BigInteger one = new BigInteger("1");
      reallyBig = reallyBig.add(one);
      
      String res = String.valueOf(reallyBig);
      
      for (i=0; i< res.length(); i++) {
        result.add(Integer.parseInt(String.valueOf(res.charAt(i))));
      }
	    
	    return result;
	}
}
