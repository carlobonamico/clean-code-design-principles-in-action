using System;

namespace workspace.workshops
{
    class ExpensesRequestParser
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            ExpenseRequest request = JsonConvert.DeserializeObject<ExpenseRequest>(File.ReadAllText(@"..\input\request.json"));
        }
    }
}
