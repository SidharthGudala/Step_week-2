class ATMPinValidator {
    public static void main(String[] args) {
        String pin = "4820";

        if (pin.length() != 4)
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        else
            System.out.println("PIN length OK.");
    }
}
