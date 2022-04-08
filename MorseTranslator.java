package com.qa.HashMap;

	import java.util.*;
	import java.util.stream.Collectors;
	
	public class MorseTranslator {
		
		    private final Map<String, String> MORSE_MAP;
		    
		        public MorseTranslator() {
		        	        this.MORSE_MAP = new HashMap<>();
		        	                this.MORSE_MAP.put(".-", "a");
		        	                this.MORSE_MAP.put("-...", "b");
		        	                this.MORSE_MAP.put("-.-.", "c");
		        	                this.MORSE_MAP.put("-..", "d");
		        	                this.MORSE_MAP.put(".", "e");
		        	                this.MORSE_MAP.put("..-.", "f");
		        	                this.MORSE_MAP.put("--.", "g");
		        	                this.MORSE_MAP.put("....", "h");
		        	                this.MORSE_MAP.put("..", "i");
		        	                this.MORSE_MAP.put(".---", "j");
		        	                this.MORSE_MAP.put("-.-", "k");
		        	                this.MORSE_MAP.put(".-..", "l");
		        	                this.MORSE_MAP.put("-- ", "m");
		        	                this.MORSE_MAP.put("-.", "n");
		        	                this.MORSE_MAP.put("---", "o");
		        	                this.MORSE_MAP.put(".--.", "p");
		        	                this.MORSE_MAP.put("--.-", "p");
		        	                this.MORSE_MAP.put("--.- ", "q");
		        	                this.MORSE_MAP.put(".-.", "r");
		        	                this.MORSE_MAP.put("...", "s");
		        	                this.MORSE_MAP.put("-", "t");
		        	                this.MORSE_MAP.put("..-", "u");
		        	                this.MORSE_MAP.put("...-", "v");
		        	                this.MORSE_MAP.put(".--", "w");
		        	                this.MORSE_MAP.put("-..-", "x");
		        	                this.MORSE_MAP.put("", "y");
		        	                this.MORSE_MAP.put("--..", "z");
		        	                this.MORSE_MAP.put("/", " ");
		        }
		        
		        public String translate(String input) {
		        	return Arrays.stream(input.split(" ")).map(n -> this.MORSE_MAP.get(n)).collect(Collectors.joining(""));
		        }
		        
		        public static void main(String[] args) {
			        MorseTranslator translator = new MorseTranslator();
			        System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
			    }    
		        
		        
		        
	} 
	 