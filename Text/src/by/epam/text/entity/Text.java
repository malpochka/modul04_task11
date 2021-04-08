package by.epam.text.entity;

public class Text {
	private Word title;
	private Sentence body;

	public Text(String s, String s1) {
		title = new Word(s);
		body = new Sentence(s1);
	}

	public Text() {

	}

	public Word getTitle() {
		return title;
	}

	public void setTitle(Word title) {
		this.title = title;
	}

	public Sentence getBody() {
		return body;
	}

	public void setBody(Sentence body) {
		this.body = body;
	}

}
