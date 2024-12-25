package com.zsgs.hotel.repository;

import com.zsgs.hotel.dto.Admin;
import com.zsgs.hotel.dto.Hotel;
import com.zsgs.hotel.dto.Room;
import com.zsgs.hotel.dto.User;

import java.util.*;

public class HotelRepository {
    private Set<User> userList ;
    private Set<Hotel> hotelList;
    private Set<Admin> adminList;
    private Map<Integer, List<Room>> roomList;

    public Map<Integer, List<Room>> getRoomList() {
        return roomList;
    }

    public Set<User> getUserList() {
        return userList;
    }

    public Set<Hotel> getHotelList() {
        return hotelList;
    }
    public Set<Admin> getAdminList() {
        return adminList;
    }

    private static HotelRepository hotelRepository;

    private HotelRepository(){
        userList = new HashSet<>();
        hotelList = new HashSet<>();
        adminList = new HashSet<>();
        roomList = new HashMap<>();
    }

    public static HotelRepository getInstance(){
        if(hotelRepository == null){
            hotelRepository = new HotelRepository();
        }
        return hotelRepository;
    }

    public boolean isUserContains(String email){
        for (User temp : userList){
            if(temp.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
    public boolean isAdminContains(String email){
        for (Admin temp : adminList){
            if(temp.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public boolean addUser(User user){
        return userList.add(user);
    }
    public boolean addAdmin(Admin admin){
        return adminList.add(admin);
    }

    public User getUser(String email) {
        User user = null;
        for (User temp : userList){
            if(temp.getEmail().equals(email)){
                user = temp;
                break;
            }
        }
        return user;
    }

    public boolean isHotelContains(Hotel hotel){
        return hotelList.contains(hotel);
    }

    public boolean addHotel(Hotel hotel){
        return hotelList.add(hotel);
    }

    public Admin getAdmin(String email) {
        Admin admin = null;
        for (Admin temp : adminList){
            if(temp.getEmail().equals(email)){
                admin = temp;
                break;
            }
        }
        return admin;
    }

    public void addRoom(String roomType, int roomCapacity, String bedType, double pricePerNight) {
        if (!roomList.containsKey(Hotel.sno)) {
            roomList.put(Hotel.sno, new ArrayList<>());
        }
        roomList.get(Hotel.sno).add(new Room(roomType, roomCapacity, bedType, pricePerNight));    }

    public int currentAdminTotalRoom(){
        for(Hotel hotel : hotelList){
            if(Hotel.sno == hotel.getId()){
                return hotel.getTotalRooms();
            }
        }
        return 0;
    }
}
