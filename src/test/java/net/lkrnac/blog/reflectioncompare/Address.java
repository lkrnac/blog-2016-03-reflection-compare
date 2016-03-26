package net.lkrnac.blog.reflectioncompare;

public class Address {
    private String line1;
    private String line2;
    private String city;
    private String postalCode;

    public Address(String line1, String line2, String city, String postalCode) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
