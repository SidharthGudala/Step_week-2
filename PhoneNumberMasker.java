class PhoneNumberMasker {
    public static void main(String[] args) {
        String phone = "9876543210";
        boolean valid = phone.length() == 10;

        for (int i = 0; i < phone.length(); i++)
            if (!Character.isDigit(phone.charAt(i)))
                valid = false;

        if (valid) {
            StringBuilder s = new StringBuilder("XXXXXX");
            s.append("-").append(phone.substring(6));
            System.out.println(s);
        } else
            System.out.println("Invalid phone number");
    }
}
