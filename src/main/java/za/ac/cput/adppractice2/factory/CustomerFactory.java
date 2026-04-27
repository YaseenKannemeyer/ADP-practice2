package za.ac.cput.adppractice2.factory;

import za.ac.cput.adppractice2.domain.Customer;
import za.ac.cput.adppractice2.domain.Name;

public class CustomerFactory {
    public static Customer createCustomer( String patientId, Name name, String email, String mobileNumber){

        return new Customer.Builder()
                .setPatientId(patientId)
                .setName(name)
                .setEmail(email)
                .setMobileNumber(mobileNumber)
                .Build();
    }

}
