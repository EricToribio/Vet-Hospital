package com.vethospital.api.vethospital.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="addresses")
public class Addresses {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotEmpty(message="Street is required")
@Size(min=5,message="Enter a valid street")
private String street;

@NotEmpty(message = "City is required")
private String city;

@NotEmpty(message = "City is required")
private String state;

@NotEmpty(message = "Zip code is required")
@Size(min=5,max=5,message = "Enter a valid zip code")
private Integer zipCode;

@OneToMany(mappedBy="address", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<User> users;

@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @PrePersist
	protected void onCreate() {
        this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
        this.updatedAt = new Date();
	}
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getZipCode() {
        return zipCode;
    }
    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    
}
