package Adapter;

public class Employer implements InterfaceEmployer {

    private String lastName = null;

    @Override
    public String getLasName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
