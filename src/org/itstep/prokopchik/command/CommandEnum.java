package org.itstep.prokopchik.command;

//«хранилище» команд
public enum CommandEnum {

    LOGIN {
        {
            this.command = new LoginCommand();
        }
    },

    LOGOUT {
        {
            this.command = new LogoutCommand();
        }
    };



    ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }

}
