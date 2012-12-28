package org.alphabet;

public class AlphabetConverter<T extends Alphabet<?>> {

	private Alphabet<T> source;
	private Word<T> word;
	
	public AlphabetConverter(Alphabet<T> source, Word<T> word){
		this.source = source;
		this.word = word;
	}
	
	public <E extends Alphabet<?>> Word<E> to(Alphabet<E> dest){
		return convert(source,dest,word);
	}
	
	public <E extends Alphabet<?>> Word<E> to(Class<? extends Alphabet<E>> alphabetClass){
		Alphabet<E> dest;
		try {
			dest = alphabetClass.newInstance();
			return convert(source,dest,word);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static <T extends Alphabet<?>,E extends Alphabet<?>>
		Word<E> convert(Alphabet<T> source, Alphabet<E> dest, Word<T> word){
		long decimal = source.toLong(word);
		return dest.parseLong(decimal);
	}
}
