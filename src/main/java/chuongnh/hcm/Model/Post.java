package chuongnh.hcm.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="post")
public class Post implements Serializable{

	public Post() {
		super();
	}

	public Post(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	public String title;
	public String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
