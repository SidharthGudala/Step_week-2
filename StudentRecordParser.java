class StudentRecordParser {
    public static void main(String[] args) {
        String csv = "Ananya Verma,RA2211003010123,CSE";
        String[] d = csv.split(",", -1);

        if (d.length != 3)
            System.out.println("Invalid Record");
        else
            System.out.println("Name: " + d[0] +
                    " | Roll No: " + d[1] + " | Dept: " + d[2]);
    }
}
