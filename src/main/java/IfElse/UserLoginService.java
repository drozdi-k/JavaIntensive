package IfElse;
import org.apache.log4j.Logger;
public class UserLoginService {

    Logger logger = Logger.getLogger(UserLoginService.class);

    public boolean login(User user, String password){
        if(user.isBlocked()){
            logger.info("log in is failed, user " + user.getLogin()+ " is blocked");
            return false;
        }
        if(user.getPassword()!=password){
            user.setCountLeft(user.getCountLeft()-1);
            logger.info("log in is failed, tries left: " + user.getCountLeft());
            if(user.getCountLeft()<=0) user.blockUser(user);
            return false;
        }
        else{
            user.countClear(user);
            logger.info("log in successfully, tries left: " + user.getCountLeft());
            return true;
        }
    }
}
