package DZ_6;

import DZ_6.Models.BinaryOperations;
import DZ_6.Models.Model;
import DZ_6.Presenters.Presenter;
import DZ_6.Presenters.UpgradePresenter;
import DZ_6.Views.ConsoleView;
import DZ_6.Views.View;
/*
Взять реализованный код в рамках семинара 4 и 5 и продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
Формат сдачи: ссылка на гитхаб проект
 */
public class Program {
    public static void main(String[] args) {
        BinaryOperations bo = new BinaryOperations();
        Model model = new Model(bo);
        View view = new ConsoleView();
        Presenter presenter = new UpgradePresenter(model, view);

        presenter.run();
    }
}
