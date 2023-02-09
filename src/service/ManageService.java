package service;

import util.MenuUtil;

public class ManageService {
    MenuUtil menuUtil = new MenuUtil();
    TranslationService translationService = new TranslationService();

    public void manage() {
        while (true) {
            byte option = menuUtil.entry();

            switch (option) {
                case 1:
                    translationService.eng_az();
                    break;
                case 2:
                    translationService.az_eng();
                    break;
                case 3:
                    System.exit(-1);
                default:
                    System.out.println("Invalid number");
            }
        }
    }
}
