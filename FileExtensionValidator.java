class FileExtensionValidator {
    public static void main(String[] args) {
        String file = "Assignment1.PDF";
        int dot = file.lastIndexOf('.');
        String ext = dot == -1 ? "" : file.substring(dot + 1);

        if (ext.equalsIgnoreCase("pdf") ||
            ext.equalsIgnoreCase("docx") ||
            ext.equalsIgnoreCase("zip"))
            System.out.println("Accepted");
        else
            System.out.println("Rejected — invalid file type");
    }
}
