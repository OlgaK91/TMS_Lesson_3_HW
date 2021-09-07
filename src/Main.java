/**
 *
 */

import com.tms.documents.FinancialInvoice;
import com.tms.documents.SupplyContract;
import com.tms.documents.EmployeeContract;
import com.tms.register.Register;
import com.tms.register.RegisterMotion;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        EmployeeContract myNewEmployeeContract = new EmployeeContract(new Date(2021, 4, 20), new Date(2021, 4, 19), "Olga", new Date(2021, 4, 10), "0001");
        SupplyContract myNewSupplyContract = new SupplyContract(10, "Pen", new Date(2021, 4, 11), "0002");
        FinancialInvoice myNewSFinancialInvoice = new FinancialInvoice(1125.25, "TMS1", new Date(2021, 4, 12), "0003");
        myNewEmployeeContract.setEmployeeName("Den");
        System.out.println(myNewEmployeeContract.getEmployeeName());

        RegisterMotion myNewRegister = new Register(10);
        myNewRegister.addNewDocument(myNewEmployeeContract);
        myNewRegister.documentInfo(myNewEmployeeContract);

        myNewRegister.addNewDocument(myNewSupplyContract);
        myNewRegister.documentInfo(myNewSupplyContract);

        myNewRegister.addNewDocument(myNewSFinancialInvoice);
        myNewRegister.documentInfo(myNewSFinancialInvoice);

    }
}
