/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author HP
 */
public class BillDao {
    public static String getId(){
        int id = 1;
        try{
            ResultSet rs = DbOperations.getData("select max(id) from bill");
            if(rs.next()){
                id = rs.getInt(1);
                id = id+1;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return String.valueOf(id);
    }
    public static void save(Bill bill){
        String insert = "insert into bill values('"+bill.getId()+"', '"+bill.getName()+"', '"+bill.getMobileNumber()+"', '"+bill.getEmail()+"', '"+bill.getDate()+"', '"+bill.getTotal()+"', '"+bill.getCreatedBy()+"')";
        DbOperations.setDataOrDelete(insert, "Bill details added successfully");
    }
    
    public static ArrayList<Bill> getAllRecordsByInc(String date){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from bill where date like '%"+date+"%'");
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return arrayList;
        
        
    }
    public static ArrayList<Bill> getAllRecordsByDesc(String date){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select * from bill where date like '%"+date+"%' order by id DESC");
            while(rs.next()){
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return arrayList;
        
    }    
}
