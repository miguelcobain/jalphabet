package org.alphabet;

/**
 * A class able to convert a word to different alphabets.
 * 
 * @param <T extends Alphabet<?>> The source alphabet type.
 * 
 * @author JCandrade
 */
public class AlphabetConverter<T extends Alphabet<?>> {

	/**
	 * The source alphabet to convert from.
	 */
	private Alphabet<T> source;
	/**
	 * The source word to convert from.
	 */
	private Word<T> word;
	
	/**
	 * Creates a new converter with the specified word.
	 * 
	 * @param word The word to convert from.
	 */
	public AlphabetConverter(Word<T> word){
		this.source = word.getAlphabet();
		this.word = word;
	}
	
	/**
	 * Performs the conversion to the specified destination alphabet object.
	 * 
	 * @param dest Destination alphabet.
	 * @return A Word from the provided Alphabet.
	 */
	public <E extends Alphabet<?>> Word<E> to(Alphabet<E> dest){
		return convert(source,dest,word);
	}
	
	/**
	 * Performs the conversion to the specified destination alphabet class.
	 * 
	 * @param dest Destination alphabet class.
	 * @return A Word from the provided Alphabet class.
	 */
	public <E extends Alphabet<?>> Word<E> to(Class<? extends Alphabet<E>> alphabetClass){
		Alphabet<E> dest;
		try {
			dest = alphabetClass.newInstance();
			return convert(source,dest,word);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * A static utility method to directly convert between words.
	 * 
	 * @param source The source alphabet.
	 * @param dest The destination alphabet.
	 * @param word The word to convert from.
	 * @return A word from the provided destination alphabet.
	 */
	public static <T extends Alphabet<?>,E extends Alphabet<?>>
		Word<E> convert(Alphabet<T> source, Alphabet<E> dest, Word<T> word){
		long decimal = source.toLong(word);
		return dest.parseLong(decimal);
	}
}
