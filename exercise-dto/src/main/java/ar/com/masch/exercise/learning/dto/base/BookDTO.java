package ar.com.masch.exercise.learning.dto.base;

public class BookDTO {
	
	private String name;
	private String index;
	private Integer pages;
	private String isbn10;
	private String isbn13;
	private String language;
	
	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIsbn10() {
		return isbn10;
	}
	
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}
	
	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}

	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public Integer getPages() {
		return pages;
	}
	
	public void setPages(Integer pages) {
		this.pages= pages;
	}
		
}
