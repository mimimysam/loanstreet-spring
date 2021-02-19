# loanstreet-spring
A Java programmatic client to connect with the LoanStreet Flask RESTful api

Incorporate the [LoanStreet API] (https://github.com/mimimysam/loanstreet-flask) into a Java Spring project:

1. Create a new project directory using the command line
2. Clone this repository into the new directory
3. Run `mvn install` inside this directory to install project into local maven repository
4. Create a new Java project
5. Import the LoanStreet API by adding the following dependency into the Java project's pom.xml file:

```
<dependencies>
    <dependency>
        <groupId>com.mimi</groupId>
        <artifactId>loanstreet-sdk</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```

```
import com.demo.LoanStreet.Loan;
import com.demo.LoanStreet.LoanController;
public class Test {
    public static void main(String[] args) {
        LoanController controller = new LoanController();
        Loan loan = new Loan(100, 3.5, 12, 12);
        controller.addLoan(loan);
        //...
    }
}
```
