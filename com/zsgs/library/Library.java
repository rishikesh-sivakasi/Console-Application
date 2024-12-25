package com.zsgs.library;

public class Library {
    private long id;
    private String name;
    private String email;
    private long bookCapacity;
    private long bookCount;
    private String Address;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

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

    public long getBookCapacity() {
        return bookCapacity;
    }

    public void setBookCapacity(long bookCapacity) {
        this.bookCapacity = bookCapacity;
    }

    public long getBookCount() {
        return bookCount;
    }

    public void setBookCount(long bookCount) {
        this.bookCount = bookCount;
    }

}
