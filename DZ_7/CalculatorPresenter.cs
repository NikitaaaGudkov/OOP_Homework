using System.Numerics;
namespace DZ_7
{
    public class CalculatorPresenter
    {
        private CalculatorModel model;
        private CalculatorView view;

        /*
        Применение паттерна Наблюдатель. Класс Logger наблюдает за состоянием класса CalculatorPresenter. 
        Как только срабатывает событие, происходит логирование в файл txt.
        */    
        public delegate void Handler(string result, string message);
        public event Handler? Notify;

        /*
        Применение принципа инверсии зависимостей (Dependency inversion principle).
        В конструкторе презентора мы передаём какие-то абстрактные модель и представление, 
        в результате презентор не будет зависеть от их деталей реализации и мы во внешнем коде сможем 
        в качестве параметров презентора передавать любую модель и любое представление.
         */
        public CalculatorPresenter(CalculatorModel model, CalculatorView view)
        {
            this.model = model;
            this.view = view;
        }

        public void Run()
        { 
            while(true)
            {
                string result = string.Empty;
                try
                {
                    string? operation = view.GetOperation("Выберите дальнейшее действие:\n" +
                        "+, *, / - для работы с комплексными числами;\n" + 
                        "sqrt, pow - для работы с действительными числами;\n" +
                        "history - для вывода истории операций;\n" +
                        "exit - для выхода");
                    switch (operation)
                    {
                        case "+":
                        case "*":
                        case "/":
                        {
                            view.PrintMessage("Введите первое число");
                            Complex c1 = view.GetNumber();
                            view.PrintMessage("Введите второе число");
                            Complex c2 = view.GetNumber();
                            Complex c3 = model.Calculate(c1, operation, c2);
                            result = model.GetResult(c1, operation, c2, c3);
                            view.PrintMessage(result);
                            break;
                        }
                        case "sqrt":
                        {
                            double number = view.GetDouble("Введите число:");
                            result = model.SquareRoot(number);
                            view.PrintMessage(result);
                            break;
                        }
                        case "pow":
                        {
                            double basis = view.GetDouble("Введите основание степени:");
                            double degree = view.GetDouble("Введите основание степени:");
                            result = model.Pow(basis, degree);
                            view.PrintMessage(result);
                            break;
                        }
                        case "history":
                        {
                            List<string> history = model.GetHistory();
                            view.DisplayHistory(history);
                            continue;
                        }
                        case "exit":
                        {
                            return;
                        }
                        default:
                        {
                            string error = "Ошибка входных параметров! Проверьте ввод";
                            Notify?.Invoke(result, error);
                            continue;
                        }
                    }
                }
                catch (Exception ex)
                {
                    Notify?.Invoke(result, ex.Message);
                    continue;
                }
                Notify?.Invoke(result, "Вычисления прошли успешно");
            }
        }
    }
}