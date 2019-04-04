
public class cezarc {


	static String cipherCoder(String[] args){

		String originalText = args[2];
		int shift = 5;
		char[] originalTextCharArr = originalText.toCharArray();
		int firstCharIdx = 'A';
		int offset = ('z' - 'A') + 1;

		for (int i = 0; i < originalTextCharArr.length; i++){

			char oldCharIdx = originalTextCharArr[i];
			int oldIdxInAlphabet = oldCharIdx - firstCharIdx;
			int newIdxInAlphabet = (oldIdxInAlphabet + shift) % offset;

			char newCharIdx = (char)(firstCharIdx + newIdxInAlphabet);
			originalTextCharArr[i] = newCharIdx;
		}

		return new String(originalTextCharArr);
	}

	static String cipherDecoder(String[] args){

		String originalText = args[2];
		int shift = -5;
		char[] originalTextCharArr = originalText.toCharArray();
		int firstCharIdx = 'A';
		int offset = ('z' - 'A') + 1;

		for (int i = 0; i < originalTextCharArr.length; i++){

			char oldCharIdx = originalTextCharArr[i];
			int oldIdxInAlphabet = oldCharIdx - firstCharIdx;
			int newIdxInAlphabet = (oldIdxInAlphabet + shift) % offset;

			char newCharIdx = (char)(firstCharIdx + newIdxInAlphabet);
			originalTextCharArr[i] = newCharIdx;
		}

		return new String(originalTextCharArr);
	}

}
