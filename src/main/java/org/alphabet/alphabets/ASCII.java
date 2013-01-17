package org.alphabet.alphabets;

import org.alphabet.Alphabet;

public class ASCII extends Alphabet<ASCII>{

	public ASCII() {
		super(128,"");
	}
	
	public ASCII(String exclusions) {
		super(128, exclusions);
	}

}
