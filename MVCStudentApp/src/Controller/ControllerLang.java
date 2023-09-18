package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;

public class ControllerLang {
    iGetModel modelList;
    iGetView view;
    
    public ControllerLang(iGetView view, iGetModel modelList)
    {
            this.view = view;
            this.modelList = modelList;
    }


        /**
         * метод для запуска и выбора языка
         */
        public void run(){
        boolean getNewIter = true;

        /**
         * выбор языка c проверкой корректности ввода
         */
        while (getNewIter) {
            String command = view.prompt("Выберете язык RU/ENG (Choose the language RU/ENG): ");
            if ("RU".equalsIgnoreCase(command)) {
                ControllerClass controller = new ControllerClass(modelList, view);
                controller.runSecond();
                getNewIter = false; 
            } else if ("ENG".equalsIgnoreCase(command)) {
                ControllerClassEng controllerEng = new ControllerClassEng(modelList, view);
                controllerEng.runSecond();
                getNewIter = false; 
            } else {
                System.out.println("Ошибка ввода. Повторите ввод.");
            }
        }
    }
}