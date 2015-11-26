public class ValidNumberWithRegex {
	public int isNumber(final String a) {
    /*
     * \\s*                 => match any white space character [\r\n\t\f ] (0 -> infinitive)
     * [\\-\\+]?            => -/+ one character
     * ([0-9]*\\.?)?        => any number of digits (0 to inifinite) with a single decimal point
     * [0-9]+               => match a digit with a digiti (1 to infinite) 
     * (e[\\-\\+]?[0-9]+)   => e followed by (0/1) -/+, followed by (1/more) digits
     * ?                    => between 0 or 1 time matches
     */
    int result = (a.matches("\\s*[\\-\\+]?([0-9]*\\.?)?[0-9]+(e[\\-\\+]?[0-9]+)?\\s*")) ? 1 : 0;
    return result;
	}
}
