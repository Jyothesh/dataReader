package com.dataenvizion.denv.core;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.dataenvizion.denv.ArrayInitLexer;
import com.dataenvizion.denv.ArrayInitParser;

public class ArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the data : ");
//		BufferedReader br = new BufferedReader(new )
		
		try {
			ANTLRInputStream input = new ANTLRInputStream(System.in);
			ArrayInitLexer lexer = new ArrayInitLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ArrayInitParser parser = new ArrayInitParser(tokens);
			
			ParseTree tree = parser.init();
			
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(new ShortToUnicodeString(), tree);
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
