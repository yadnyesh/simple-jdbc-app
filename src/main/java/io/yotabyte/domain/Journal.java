package io.yotabyte.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Journal {
	private Long id;
	private String title;
	private Date created;
	private String summary;
	private SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
	
	public Journal(Long id, String title, Date created, String summary, SimpleDateFormat format) {
		this.id = id;
		this.title = title;
		this.created = created;
		this.summary = summary;
	}
	
	

}
