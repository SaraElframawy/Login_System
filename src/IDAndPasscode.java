import java.util.HashMap;

public class IDAndPasscode {
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    IDAndPasscode(){
        loginInfo.put("SARA","Salad");
        loginInfo.put("Amr","Pizza");
        loginInfo.put("Nelly","Godis");
    }
   protected HashMap getLoginInfo(){
        return loginInfo;

    }
}
