package by.epam.text.entity;

public class Sentence {
	private String sent;

	public Sentence(String sent) {
		super();
		this.sent = sent;
	}
	public Sentence() {
		
	}

	public String getSent() {
		return sent;
	}

	public void setSent(String sent) {
		this.sent = sent;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sent == null) ? 0 : sent.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sent == null) {
			if (other.sent != null)
				return false;
		} else if (!sent.equals(other.sent))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return sent ;
	}

}
