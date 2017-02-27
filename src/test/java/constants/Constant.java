package constants;

/**
 * @author malex
 */
public class Constant {

   public final static Double LATITUDE = 31.5550281;
   public final static Double LONGITUDE = 74.3112118;

//      private final static String URL_BASE = "http://bookadoc.online.mocha6007.mochahost.com/BookADocWeb-1.0.0";
   private final static String URL_BASE = "http://localhost:8080";

   public final static String URL_SIGN_UP = URL_BASE + "/user/SignUp";
   public final static String URL_SIGN_IN = URL_BASE + "/user/SignIn";
   public final static String URL_FOLLOW_USER = URL_BASE + "/user/followUser";
   public final static String URL_UN_FOLLOW_USER = URL_BASE + "/user/unFollowUser";


   public final static String URL_HIRE_STORE_APPOINTMENT = URL_BASE + "/appointment/hireDoctor/storeAppointment";



}
