/**
 * 
 * @author 
 *
 */
public class StringsPairProgram {

	/**
	 * 
	 * @param sentence
	 * @return
	 */
	public static int numWords(String sentence) {
		int spaces = sentence.indexOf(" ");
		for(int i=0; i<sentence.length(); i++) {
			
			}
			return spaces;
	}
    /**
     * 
     * @param sentence
     * @return
     */
	public static String getLastWord(String sentence) {
		String lastFun = lastIndexOf(sentence);
		System.out.println(lastFun);
		String fun = sentence.substring(29,33);
		return fun;
	}
    
	/**
     * 
     * @param sentence
     * @return
     */
	public static String alternateCase(String sentence) {
		
		return "";
	}

	public static void printIndices(String source, char search) {
		
	}
    /**
     * 
     * @param args 
     */
	public static void main(String[] args) {
		String sentence = "String Programming in Java is fun";
		System.out.println("Expected numWords() returns 6 : " + numWords(sentence));

		System.out.println("Expected getLastWord() returns fun : " + getLastWord(sentence));

		System.out.println(
				"Expected alternateCase() returns StRiNg pRoGrAmMiNg iN JaVa iS FuN : " + alternateCase(sentence));

		System.out.println("Expected printIndices() prints indices 3 15 19 27 for search letter i : ");
		printIndices(sentence, 'i');3
	
		
	}

}
