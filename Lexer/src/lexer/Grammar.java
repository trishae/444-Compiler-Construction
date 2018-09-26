package lexer;

public class Grammar {

	private String keyword;
	private String rule;
	
	public Grammar(String keyword, String rule) {
		this.keyword = keyword;
		this.rule = rule;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}
	
	
}
