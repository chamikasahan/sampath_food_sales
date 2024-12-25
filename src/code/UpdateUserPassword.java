/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

public class UpdateUserPassword {
        private String cUserPassword;
        


    UpdateUserPassword(String password) {
       
        this.cUserPassword = password;
    }



    public String getcUserPassword() {
        return cUserPassword;
    }

    public void setcUserPassword(String cUserPassword) {
        this.cUserPassword = cUserPassword;
    }
}
