package IfElse;

import org.apache.log4j.Logger;

public class User {

    private String login;
    private String password;
    private boolean isBlocked = false;
    private int countLeft = 3;
    private int maxCount = 3;

    Logger logger = Logger.getLogger(User.class);

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getCountLeft() {
        return countLeft;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void setCountLeft(int countLeft) {
        this.countLeft = countLeft;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public void countClear(User user){
        user.setCountLeft(user.getMaxCount());
    }
    public void blockUser(User user){
        user.setCountLeft(0);
        user.setBlocked(true);
        logger.info("user " + user.getLogin()+ "  is blocked");
    }
}
