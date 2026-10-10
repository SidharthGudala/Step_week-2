class ProductInventoryParser {
    public static void main(String[] args) {
        String csv = "Wireless Mouse,WM-2201,150";
        String[] data = csv.split(",", -1);

        if (data.length != 3)
            System.out.println("Invalid Record");
        else
            System.out.println("Product: " + data[0] +
                    " | SKU: " + data[1] + " | Qty: " + data[2]);
    }
}
