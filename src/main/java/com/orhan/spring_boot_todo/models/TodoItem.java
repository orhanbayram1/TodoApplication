package com.orhan.spring_boot_todo.models;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "todo_items")
public class TodoItem implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;

	private String description;
	
	
	private Boolean isComplete;
	
	
	private Instant createdAt;
	
	
	private Instant updatedAt;
	
	
	
	}

		public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsComplete() {
		return isComplete;
	}

	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}

		public Long getId() {
			return id;
		}


		public Instant getCreatedAt() {
			return createdAt;
		}


		public void setCreatedAt(Instant createdAt) {
			this.createdAt = createdAt;
		}


		public Instant getUpdatedAt() {
			return updatedAt;
		}


		public void setUpdatedAt(Instant updatedAt) {
			this.updatedAt = updatedAt;
		}
	
}
