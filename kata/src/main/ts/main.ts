import JsonFileReader from './JsonFileReader';
import ExpensesRequest from './ExpensesRequest';


class Test {
    test(){
        let reader = new JsonFileReader(); 
        let expensesRequest = reader.load("../../../input/request.json") as ExpensesRequest; 
        console.log("Loaded");
        console.log(JSON.stringify(expensesRequest));
    }
}

let c = new Test(); 
c.test(); 

