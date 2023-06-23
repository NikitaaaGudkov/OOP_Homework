using System.Numerics;
namespace DZ_7
{
    public class CalculatorView
    {
        public double GetDouble(string message)
        {
            Console.WriteLine(message);
            double result = Convert.ToDouble(Console.ReadLine());
            return result;
        }
        public Complex GetNumber()
        {
            Console.WriteLine($"Введите вещественную часть числа:");
            double a = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine($"Введите мнимую часть числа:");
            double b = Convert.ToDouble(Console.ReadLine());
            Complex complex = new Complex(a, b);
            return complex;
        }

        public string? GetOperation(string message)
        {
            Console.WriteLine(message);
            string? operation = Console.ReadLine();
            return operation;
        }

        public void PrintMessage(string result)
        {
            Console.WriteLine(result);
        }

        public void DisplayHistory(List<string> history)
        {
            Console.WriteLine("История ввода:");
            foreach (string item in history) 
            {
                Console.WriteLine(item);
            }
        }
    }
}