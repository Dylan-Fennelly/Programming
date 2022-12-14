package JohnExamples.simplebanking;

public class Main
{
    public static void main(String[] args)
    {
        /* Create a simple banking application. There should be a Bank
        class. It should have an arrayList of Branches
        Each Branch should have an arraylist of Customers
        The Customer class should have an arrayList of Doubles (transactions)
        Customer: Name, and the ArrayList of Doubles
        Branch: Need to be able to add a new customer and initial transaction amount
        Also needs to a add additional transactions for that customer/branch
        Bank:
        Add a new branch
        Add a customer to that branch with initial transaction
        Add a transaction for an existing customer for that branch
        Show a list of customers for a particular branch and optionally a list of their transactions
        Demonstrate autoboxing and unboxing in your code
        Hint: Transactions
        Add data validations - check if exists of not exists
        Think about where you are adding the code to perform each action
         */

        Bank boi = new Bank("BOI");
        if(boi.addBranch("BOID"))
        {
            System.out.println("Added BOID");
        }

        boi.addCustomer("BOID", "Craig", 100000);
        boi.addCustomer("BOID", "Muhammad", 10);
        boi.addCustomer("BOID", "Dylan", 100);

        boi.addCustomerTransaction("BOID", "Craig", 44.44);
        boi.addCustomerTransaction("BOID", "Craig", 99.99);

        boi.listCustomers("BOID", true);



    }
}
