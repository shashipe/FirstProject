package com.example.demo.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_publisher")
public class BookPublisher implements Serializable{
	
	 
    private Book book;
    private Publisher publisher;
    private Date publishedDate;

    @Id
    @Column(name = "bp_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bpId;
    
    
    
    @ManyToOne(fetch=FetchType.LAZY,cascade= CascadeType.ALL)
    @Access(AccessType.PROPERTY)
    @JoinColumn(name="book_id")
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @ManyToOne(fetch=FetchType.LAZY,cascade= CascadeType.ALL)
    @Access(AccessType.PROPERTY)
    @JoinColumn(name="publisher_id")
    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Column(name = "published_date")
    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

	public Long getBpId() {
		return bpId;
	}

	public void setBpId(Long bpId) {
		this.bpId = bpId;
	}
    
}