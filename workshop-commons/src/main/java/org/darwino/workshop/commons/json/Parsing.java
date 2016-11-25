/*!COPYRIGHT HEADER! 
 *
 * (c) Copyright Darwino Inc. 2014-2016.
 *
 * Licensed under The MIT License (https://opensource.org/licenses/MIT)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.darwino.workshop.commons.json;

import org.darwino.workshop.commons.CommonSample;

import com.darwino.commons.json.JsonJavaFactory;
import com.darwino.commons.json.JsonObject;

/**
 * JSON Parsing.
 * 
 * @author Philippe Riand
 */
public class Parsing extends CommonSample {

	public void testParsing() throws Exception {
		JsonObject o = JsonObject.fromJson("{bb:1, cc:true, dd:'you', aa:'me', ff:'false', ee: 'them' }");
		// Compact
		println("Compact:\n{0}",o.toJson(true));
		// Readable
		println("Readable:\n{0}",o.toJson(false));
	}

	public void testParsingSorted() throws Exception {
		JsonObject o = (JsonObject)JsonJavaFactory.TreeMapFactory.instance.fromJson("{bb:1, cc:true, dd:'you', aa:'me', ff:'false', ee: 'them' }");
		println("Sorted:\n{0}",o.toJson(true));
	}

	public void testParsingKeepOrder() throws Exception {
		JsonObject o = (JsonObject)JsonJavaFactory.LinkedMapFactory.instance.fromJson("{bb:1, cc:true, dd:'you', aa:'me', ff:'false', ee: 'them' }");
		println("Keep Order:\n{0}",o.toJson(true));
	}
}
