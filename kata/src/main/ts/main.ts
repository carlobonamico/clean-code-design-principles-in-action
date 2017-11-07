import JsonFileReader from './JsonFileReader.ts';

class Expense {
    
    amount: Number; 
    category: string; 
    day: Date; 

    hasDocument: boolean; 
}

class ExpensesRequest {
    expenses: Array<Expense> = [];
}

class Test {
    test(){
        let reader = new JsonFileReader(); 
        let expensesRequest = reader.load("../input/request.json") as ExpensesRequest; 
        alert("works");
    }
}

let c = new Test(); 
c.test(); 

