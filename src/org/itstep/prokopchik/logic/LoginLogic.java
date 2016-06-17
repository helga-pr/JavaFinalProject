package org.itstep.prokopchik.logic;

import org.itstep.prokopchik.Admin;
import org.itstep.prokopchik.Client;

public class LoginLogic {

    public static boolean checkLogin(String enterLogin, String enterPass, String adminflag) {


        if(adminflag.equals("администратор")){
            Admin admin = new Admin();

            admin = new DAOAdminImpl().getAdmin(enterLogin);

            return admin != null &&
                    admin.getPassword().equals(enterPass);
        }

        else{

            Client client = new Client();

            client = new DAOImpl().getclient(enterLogin);

            return client != null &&
                    client.getPassword().equals(enterPass);
        }
    }

}
