package DZ_6.Presenters;

import DZ_6.Models.Model;
import DZ_6.Views.View;

/*
Применение принципа открытости/закрытости (Open-closed principle).
Если нам нужно, чтобы презентор выполнял какие-то дополнительные функции, например сохранял все наши вычисления 
в отдельный файл, мы можем не модифицировать существующий класс, а расширить его дополнительным функционалом 
наследуя от базового класса.
 */
public class UpgradePresenter extends Presenter{
    public UpgradePresenter(Model model, View view) {
        super(model, view);
    }
    
    @Override
    public void run() {
        super.run();
        saveResultToFile();
    }

    private void saveResultToFile() {
        // Логика записи результатов в файл.
        view.printMessage("Вычисления успешно записаны в файл\n");
    }
}
