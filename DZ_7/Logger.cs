namespace DZ_7
{
    public class Logger
    {
        public void Log(string result, string message)
        {
            using (StreamWriter writer = new StreamWriter("log.txt", true))
            {
                writer.WriteLine($"{DateTime.Now} - " + result + " - " + message);
            }
        }
    }
}