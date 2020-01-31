package com.quickpark.in.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {

	private int userId;
	
	@Size(min = 5,max = 15,message="required")
		private String userName;
	
		 @NotNull(message="required")
		private String address;
		 
		 @NotNull(message="required")
		private String firstName;
		 
		 private int isDeleted;
		 
			@NotNull(message="required")
			private String lastName;
			 @NotNull
				private long mobNo;
				 @Email
				private String  emailId;
				 @NotNull
				private String password;
		 
				 
		 public int getIsDeleted() {
			return isDeleted;
		}


		public void setIsDeleted(int isDeleted) {
			this.isDeleted = isDeleted;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
	
		 private String role;
		 
		 
		 public User(String userName, String address, String firstName, String lastName, String role, long mobNo,
				String emailId, String password) {
			super();
			this.userName = userName;
			this.address = address;
			this.firstName = firstName;
			this.lastName = lastName;
			this.role = role;
			this.mobNo = mobNo;
			this.emailId = emailId;
			this.password = password;
		}
		 
		 
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public long getMobNo() {
			return mobNo;
		}
		public void setMobNo(long mobNo) {
			this.mobNo = mobNo;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		 public int getUserId() {
				return userId;
			}


			public void setUserId(int userId) {
				this.userId = userId;
			}
		 
		 
		 

}
