package Exceptions;
import org.apache.log4j.Logger;
public class UserValidationService {

   static Logger log = Logger.getLogger(UserValidationService.class);

   public static void validate(User user) throws UserValidationException{
       if(user.getFirstName().length()<3 || user.getLastName().length()<3) {
           log.info("Минимальная длина имени / фамилии пользователя - 3 символа;");
           throw new UserValidationException("Минимальная длина имени / фамилии пользователя - 3 символа;");
       }
       if(user.getFirstName().length()>15 || user.getLastName().length()>15) {
           log.info("Максимальная длина имени / фамилии пользователя - 15 символов;");
           throw new UserValidationException("Максимальная длина имени / фамилии пользователя - 15 символов;");
       }
       if(user.getAge()<0 || user.getAge()>120) {
           log.info("Допустимый возраст пользователя: от 0 до 120 лет включительно;");
           throw new UserValidationException("Допустимый возраст пользователя: от 0 до 120 лет включительно;");
       }
   }
}
