
package appLayer;

public class user {
    public boolean isValidCredentials(String sUserName,String sUserPassword){
        if(!sUserName.equals("prabhjeev") || !sUserPassword.equals("india")){
            return false;
        }
        else{
            return true;
        }
    
    }
}
