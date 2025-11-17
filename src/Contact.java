class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "NAME: " + name + " - PHONE NUMBER: " + phoneNumber;
    }
}
