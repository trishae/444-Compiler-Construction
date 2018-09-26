package lexer;

public class Token {

	private int tokenID;
	private int line;
	private String tokenString;
	private int tokenInt;
	
	public Token(int tokenID, int line, String tokenString, int tokenInt) {
		this.tokenID = tokenID;
		this.line = line;
		this.tokenString = tokenString;
		this.tokenID = tokenID;
	}

	public String stringify() {
		return "Tok: "+Integer.toString(tokenID)+" line= "+Integer.toString(line)+" str= "+tokenString;
	}
	
	public int getTokenID() {
		return tokenID;
	}

	public void setTokenID(int tokenID) {
		this.tokenID = tokenID;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String getTokenString() {
		return tokenString;
	}

	public void setTokenString(String tokenString) {
		this.tokenString = tokenString;
	}

	public int getTokenInt() {
		return tokenInt;
	}

	public void setTokenInt(int tokenInt) {
		this.tokenInt = tokenInt;
	}
	
	
}
