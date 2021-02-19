# loanstreet-spring
A Java programmatic client to connect with the LoanStreet Flask RESTful api

Incorporate the [LoanStreet API](https://github.com/mimimysam/loanstreet-flask) into a Java Spring project:

1. Create a new project directory using the command line
2. Clone this repository into the new directory
3. `cd loanstreet-spring` 
4. Run `mvn install` inside this directory to install project into local maven repository
5. Create a new Java project
6. Import the LoanStreet API by adding the following dependency into the Java project's pom.xml file:

## pom.xml
```
<dependencies>
    <dependency>
        <groupId>com.mimi</groupId>
        <artifactId>loanstreet-sdk</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```

## Example implementation
```
import com.demo.LoanStreet.Loan;
import com.demo.LoanStreet.LoanController;

public class Test {
    public static void main(String[] args) {
    
        LoanController controller = new LoanController();
        
        // Create new loan
        Loan loan = new Loan(100, 3.5, 12, 12);
        controller.addLoan(loan);
        
        // Get all existing loans
        List<Loan> loans = controller.getAllLoans();
        
        // Get single loan by ID
        controller.getById(2);
        
        // Update loan
        loan.setInterestRate(4.5);
        controller.updateLoan(loan);
        
        // ...
    }
}
```
