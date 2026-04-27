package za.ac.cput.adppractice2.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import za.ac.cput.adppractice2.util.Helper;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    private String patientId;

    @Embedded
    private Name name;

    private String email;
    private String mobileNumber;

    protected Customer() {}

    private Customer(Builder builder){
        this.patientId =builder.patientId;
        this.name = builder.name;
        this.email = builder.email;
        this.mobileNumber = builder.mobileNumber;
    }

    public String getPatientId() {
        return patientId;
    }

    public Name getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }


    public static class Builder {
        private String patientId;
        private Name name;
        private String email;
        private String mobileNumber;

        public Builder setPatientId(String patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Customer Build(){
            if (Helper.isNullOrEmpty(patientId) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(mobileNumber)){
                return null;
            }
            return new Customer(this);
        }
    }


}
