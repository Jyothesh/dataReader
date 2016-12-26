package com.dataenvizion.denv.core;

import com.dataenvizion.denv.ArrayInitBaseListener;
import com.dataenvizion.denv.ArrayInitParser;

public class ShortToUnicodeString extends ArrayInitBaseListener{

	@Override
	public void enterInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}

	@Override
	public void exitInit(ArrayInitParser.InitContext ctx) {
		System.out.print('"');
	}

	@Override
	public void enterValue(ArrayInitParser.ValueContext ctx) {
		// Assumes no nested array initializers
		int value = Integer.valueOf(ctx.INT().getText());
		System.out.printf("\\u%04x", value);
	}
}
