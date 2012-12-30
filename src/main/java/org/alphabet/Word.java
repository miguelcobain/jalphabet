package org.alphabet;

/**
 * This class represents a word of a given alphabet.
 * 
 * @param <T extends Alphabet<?>> An Alphabet subclass.
 * 
 * @author Miguel Andrade
 */
public class Word<T extends Alphabet<?>> extends Number implements Comparable<Word<T>>{

	private static final long serialVersionUID = 1L;

	/**
	 * The alphabet to which this word belongs to.
	 */
	private final Alphabet<T> alphabet;
	/**
	 * The string that represents this word.
	 */
	private final String word;
	
	/**
	 * Create a new Word by providing its string and alphabet.
	 * 
	 * @param word A string that represents a word.
	 * @param alphabet The alphabet to which this word belongs to.
	 */
	public Word(String word, Alphabet<T> alphabet){
		this.alphabet = alphabet;
		this.word = word;
	}
	
	/**
	 * Create a new Word by providing its string and alphabet class.
	 * 
	 * @param word A string that represents a word.
	 * @param alphabetClass The alphabet class. This contructor will instantiate the alphabet for you.
	 */
	public Word(String word, Class<? extends Alphabet<T>> alphabetClass){
		Alphabet<T> alpha = null;
		try {
			alpha = alphabetClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.word = word;
		this.alphabet = alpha; 
	}
	
	/**
	 * 
	 * @return This word's alphabet.
	 */
	public Alphabet<T> getAlphabet(){
		return alphabet;
	}
	
	/**
	 * 
	 * @return Word's string representation.
	 */
	public String getWord(){
		return word;
	}
	
	@Override
	public String toString() {
		return word;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Number#intValue()
	 */
	@Override
	public int intValue() {
		return alphabet.toInt(this);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Number#longValue()
	 */
	@Override
	public long longValue() {
		return alphabet.toLong(this);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Number#floatValue()
	 */
	@Override
	public float floatValue() {
		return alphabet.toLong(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Number#doubleValue()
	 */
	@Override
	public double doubleValue() {
		return alphabet.toLong(this);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Word<T> o) {
		return new Integer(this.intValue()).compareTo(o.intValue());
	}
	
	/**
	 * Creates an AlphabetConverter with this alphabet as source.
	 * 
	 * @return An alphabet converter.
	 */
	public AlphabetConverter<T> convert(){
		return new AlphabetConverter<T>(this);
		
	}
}
