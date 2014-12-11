package daliborn.info.pitanje.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="RESPONSE")
@Table(name="RESPONSE")
public class Response {
	@Id
	@Column(name="RESPONSE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id = 0;
	
	private String comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
