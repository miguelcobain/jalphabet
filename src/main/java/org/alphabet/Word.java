package org.alphabet;

public class Word<T extends Alphabet<?>> extends Number implements Comparable<Word<T>>{

	private static final long serialVersionUID = 1L;

	private Alphabet<T> alphabet;
	private String word;
	
	public Word(String word, Alphabet<T> alphabet){
		this.alphabet = alphabet;
		this.word = word;
	}
	
	public Word(String word, Class<? extends Alphabet<T>> alphabetClass){
		try {
			this.alphabet = alphabetClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.word = word;
	}
	
	public Alphabet<T> getAlphabet(){
		return alphabet;
	}
	
	public String getWord(){
		return word;
	}
	
	@Override
	public String toString() {
		return word;
	}

	@Override
	public int intValue() {
		return alphabet.toInt(this);
	}

	@Override
	public long longValue() {
		return alphabet.toLong(this);
	}

	@Override
	public float floatValue() {
		return alphabet.toLong(this);
	}

	@Override
	public double doubleValue() {
		return alphabet.toLong(this);
	}

	@Override
	public int compareTo(Word<T> o) {
		return new Integer(this.intValue()).compareTo(o.intValue());
	}
	
	public AlphabetConverter<T> convert(){
		return new AlphabetConverter<T>(alphabet,this);
		
	}
}
