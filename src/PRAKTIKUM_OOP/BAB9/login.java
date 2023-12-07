/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOP.BAB9;

/**
 *
 * @author ASUS
 */
public class login {
    private String username,password;
    public String nama;
    public login(){
    nama = "Abidzar";
    username = "Algi";
    password = "AlgiGans";
}
public String getUsername(){
return  username;
}
public void setUsername(){
    this.username = username;
}
public String getPassword(){
    return password ;
}
public void setPassword(){
    this.password = password;
}
boolean CekLoing(String username,String password){
    if(username.equals(getUsername())&& password.equals(getPassword())){
        return true;
    }
    return false;
}

        }