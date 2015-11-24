public class StringZigzag {
  public String convert(String a, int b) {
	  if (b==1)
      return a;

    String result = "";
    String[] s = new String[b];
    for (int i=0; i<b; i++) {
        s[i] = "";
    }
    
    int k=0;
    int diff = 1;

    for (int i=0; i< a.length(); i++) {
      s[k] += Character.toString(a.charAt(i));
      if (i>0 && i%(b-1) ==0) {
          diff = -diff;
      }
      k += diff;
    }
    
    
    for (int i=0; i<b; i++) {
      result += s[i];
    }

    return result;
	}
}
