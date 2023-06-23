using System.Numerics;
namespace DZ_7
{
    public class CalculatorModel
    {
        private List<string> history;

        public CalculatorModel()
        {
            history = new List<string>();
        }

        public Complex Calculate(Complex c1, string? operation, Complex c2)
        {
            switch (operation)
            {
                case "+": return Complex.Add(c1, c2);
                case "*": return Complex.Multiply(c1, c2);
                case "/": return Complex.Divide(c1, c2);
                default: return Complex.NaN;
            }
        }

        public string ComplexToString(Complex complex)
        {
            if (complex.Imaginary.ToString().StartsWith("-"))
            {
                return complex.Real.ToString() + complex.Imaginary.ToString() + "i";
            }
            return complex.Real.ToString() + "+" + complex.Imaginary.ToString() + "i";
        }

        public string GetResult(Complex c1, string operation, Complex c2, Complex c3)
        {
            string result = ComplexToString(c1) + operation + ComplexToString(c2) + "=" + ComplexToString(c3);
            history.Add(result);
            return result;
        }

        public List<string> GetHistory()
        {
            return history;
        }

        public string SquareRoot(double number)
        {
            double answer = Math.Sqrt(number);
            string result = $"sqrt({number}) = {answer}";
            history.Add(result);
            return result;
        }

        public string Pow(double basis, double degree)
        {
            double answer = Math.Pow(basis, degree);
            string result = $"{basis}^{degree} = {answer}";
            history.Add(result);
            return result;
        }
    }
}