public class ValidNumberWithoutRegex {
    public int isNumber(final String a) {
      boolean ok = false;
      
      if (a.trim().endsWith(".") || a.trim().contains(".e"))
        return 0;
          
      int dotCounter = 0;
      int eCounter = 0;
      int fCounter = 0;
      for( int i=0; i<a.trim().length(); i++ ) {
        if( a.trim().charAt(i) == '.' ) {
          dotCounter++;
        } else if( a.trim().charAt(i) == 'e' ) {
          eCounter++;
        } else if( a.trim().charAt(i) == 'f' ) {
          fCounter++;
        }
      }
      
      if (dotCounter > 1 || eCounter > 1 || fCounter >1)
        return 0;
      
      try {
        Double.parseDouble(a.trim());
        ok = true;
      } catch(Exception e) {
        return 0;
      }

      if (ok)
        return 1;
      
      return 1;
    }
}
