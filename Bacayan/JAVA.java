/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bacayan;

/**
 *
 * @author Student.Admin
 */
class JAVA implements TechRoom { // specific class
    
    int oc;
    String type;
    String name;
    
    public JAVA(int occupants, String type, String name) {// contructor
        this.oc = occupants;
        this.type = type;
        this.name = name;
    }

    JAVA() {
        //
    }

    public int getOc() {
        return oc;
    }

    public void setOc(int oc) {
        this.oc = oc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public void roomNumber(int occupants){
        int num = 8;
        System.out.println(num);
    }  

    @Override
    public void roomType(String type) {
        this.type = type;
    }

    @Override
    public void roomName(String Name) {
        System.out.println("JAVA");
    }
}
