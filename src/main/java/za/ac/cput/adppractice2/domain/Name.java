package za.ac.cput.adppractice2.domain;

import jakarta.persistence.Embeddable;
import za.ac.cput.adppractice2.util.Helper;

@Embeddable
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    protected Name(){}

    private Name(Builder builder){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public static class Builder{
        private String firstName;
        private String middleName;
        private String lastName;

        public Builder setFirstName(String FirstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }


        public Builder setLastName(String LastName){
            this.lastName = lastName;
            return this;
        }

        public Name Build(){
            if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(middleName) || Helper.isNullOrEmpty(lastName))
                return null;
            return new Name(this);
        }

    }
}
