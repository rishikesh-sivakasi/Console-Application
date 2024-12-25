package com.zsgs.library;

public class Librarian {
   private long id;
   private String name;
   private String email;
   private String password;
   private String phoneNo;
   private String libraryId;

   public long getId() {
      return id;
   }

   public void setId(long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getPhoneNo() {
      return phoneNo;
   }

   public void setPhoneNo(String phoneNo) {
      this.phoneNo = phoneNo;
   }

   public String getLibraryId() {
      return libraryId;
   }

   public void setLibraryId(String libraryId) {
      this.libraryId = libraryId;
   }
}
