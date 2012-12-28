# The Java Alphabet Library (**JAL**)#

JAL is an utility library intended to help people to create manipulate custom Alphabets. This is particularly useful, for example, for identification code generators.

This library conveniently treats alphabets as a [Mathematical Numeral System](http://en.wikipedia.org/wiki/Numeral_system). The goal is to be able to easily convert between alphabets and to make arithmetic operations on your custom alphabets.

You can easily create your custom Alphabets by extending the `Alphabet` abstract class, but JAL has some common alphabets previously packaged:

- Binary
- Octal
- Decimal
- Hexadecimal
- Uppercase latin alphabet
- Lowercase latin alphabet
- ASCII
- Base64
- Code39
- DNA

# Example #

Just a simple example of conversion between alphabets. Sugar syntax for ya!
```java
Binary b = new Binary();
Decimal d = new Decimal();

Word<Decimal> w1 = d.createWord("10"); // Use the alphabet to create valid words
Word<Binary> w2 = w1.convert().to(b); // Pass in an Alphabet implementation
Word<Hexadecimal> w3 = w1.convert().to(Hexadecimal.class); // Or just an Alphabet class. JAL instantiates the Alphabet for you!

System.out.println(w1+" "+w2+" "+w3);
// Prints "10 1010 A"
```
Imagine you want to implement a [POS](http://en.wikipedia.org/wiki/Point_of_sale) software. You may want to get the corresponding [Code39](http://en.wikipedia.org/wiki/Code_39) barcode string from the automatically generated database id.

```java
Long idFromDatabase = 54341L;

Code39 c = new Code39();
Word<Code39> code = c.parseLong(idFromDatabase);

System.out.println(code);
// prints "S31"
```
# TODO #

- add support for arithmetic operations (It would be neat to be able to sum words)
- add support for exclusions! (manually exclude certain characters from an existing alphabet)
- add support for the creation of "composite alphabets" through concatenation. For example, an `Alphabet` defined by `Decimal`+"/"+`Code39`. You could have a graph of alphabets, how awesome is that?
- unit testing
- more alphabets
- complete javadoc
- maybe the algorythms' performance can be improved