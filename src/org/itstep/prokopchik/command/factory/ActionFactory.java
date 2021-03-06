package org.itstep.prokopchik.command.factory;

import org.itstep.prokopchik.command.ActionCommand;
import org.itstep.prokopchik.command.CommandEnum;
import org.itstep.prokopchik.command.EmptyCommand;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {

    public ActionCommand defineCommand(HttpServletRequest request) {

        ActionCommand current = new EmptyCommand();

        /**
         * извлечение имени команды из запроса
         */

        String action = request.getParameter("command");

        if (action == null || action.isEmpty()) {
            /**
             * если команда не задана в текущем запросе
             */

            return current;
        }

        /**
         * получение объекта, соответствующего команде
         */

        try {
            CommandEnum currentEnum =
                    CommandEnum.valueOf(action.toUpperCase());

            current = currentEnum.getCurrentCommand();

        } catch (IllegalArgumentException e) {
            request.setAttribute("wrongAction", action
                    + "message.wrongaction");
        }
        return current;

    }
}
