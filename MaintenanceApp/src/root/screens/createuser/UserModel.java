/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root.screens.createuser;

/**
 *
 * @author ficca
 */
public class UserModel {
    private String error;
    private int errorCode;  
    private UserQueries createUserQueries;

    public UserModel() {
        this.createUserQueries = new UserQueries();
    }
    
    /**
     * insert a User in the database
     * 
     * @param user
     * @return 
     */
    public boolean create(User user){
        return false;
    }
    
    public String getError(){
        return null;
    }
    
    public int getErrorCode(){
        return 1;
    }
    
    
}
