
import com.reuters.rfa.dacswebservice.DacsAdministratorLogin;
import com.reuters.rfa.dacswebservice.DacsAdministratorName;
import com.reuters.rfa.dacswebservice.DacsAdministratorPassword;
import com.reuters.rfa.dacswebservice.DacsApplication;
import com.reuters.rfa.dacswebservice.DacsApplicationDefinition;
import com.reuters.rfa.dacswebservice.DacsApplicationListResult;
import com.reuters.rfa.dacswebservice.DacsVersionAttributes;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zoya.farberov
 */
public class WSDACSQuickstart {
 
     public static void main(String[] args) {

        
        DacsAdministratorName dan = new DacsAdministratorName();
        dan.setMAdministratorName("DACSADMINUSER");
        DacsAdministratorPassword dap = new DacsAdministratorPassword();
        dap.setMAdministratorPassword("DACSADMINPASSWORD");
        DacsAdministratorLogin dal = new DacsAdministratorLogin();
        dal.setAAdministratorName(dan);
        dal.setAAdministratorPassword(dap);
        DacsApplicationDefinition dad = new DacsApplicationDefinition();
        dad.setMApplicationName("goodTestApp1");
        dad.setMApplicationId(777);
        
        DacsVersionAttributes dva = getVersion(dal);
        
        System.out.println("getVersion Result: "+ dva.getAResult().getMErrorText());
        System.out.println("Attributes: "+ dva.getAResult().getMResultText()+
                ", Version= "+ dva.getADacsDBVersion().getMDacsDatabaseVersion());
        
        DacsApplicationListResult dar = getApplicationList(dal);
        
        System.out.println("getApplicationList Result: "+ dar.getAResult().getMErrorText());
        System.out.println("Attributes: "+ dar.getAResult().getMResultText());
        for(Iterator <DacsApplication> iter =  dar.getADacsApplicationList().iterator(); iter.hasNext();) {
            DacsApplication dacsapp = iter.next();
            System.out.println("Application Name="+dacsapp.getMName()+ ", Application ID="+dacsapp.getMApplicationId());
        }
     }

    private static DacsVersionAttributes getVersion(com.reuters.rfa.dacswebservice.DacsAdministratorLogin loginAttribute) {
        com.reuters.rfa.dacswebservice.DacsWebServiceService service = new com.reuters.rfa.dacswebservice.DacsWebServiceService();
        com.reuters.rfa.dacswebservice.DacsWebService port = service.getDacsWebServicePort();
        return port.getVersion(loginAttribute);
    }

    private static DacsApplicationListResult getApplicationList(com.reuters.rfa.dacswebservice.DacsAdministratorLogin loginAttribute) {
        com.reuters.rfa.dacswebservice.DacsWebServiceService service = new com.reuters.rfa.dacswebservice.DacsWebServiceService();
        com.reuters.rfa.dacswebservice.DacsWebService port = service.getDacsWebServicePort();
        return port.getApplicationList(loginAttribute);
    }
     
     
     
}
