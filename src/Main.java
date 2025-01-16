public class Main {

    /**
     * Author: Tomáš Kaplan
     * Date: 2025-01-16
     *
     * @param args
     */
    public static void main(String[] args) {

        com.engeto.invoice.Invoice invoice1 = new com.engeto.invoice.Invoice();
        com.engeto.invoice.Invoice invoice2 = new com.engeto.invoice.Invoice();

        invoice1.setInvoiceNumber(20250001);
        invoice2.setInvoiceNumber(20250002);

//        customerName = "Tomáš Kaplan";
//        packageWeight = 125;
//
//        double totalWeight  = packageWeight + 2;
        System.out.println("Faktura 1");
        System.out.println("Číslo faktury: " + invoice1.getInvoiceNumber());
        System.out.println("Jméno zákazníka: "  + invoice1.getCustomerName());
        System.out.println("Datum vystavení faktury: " + invoice1.getInvoiceDate());
        System.out.println("Celková částka: " + invoice1.getTotalAmount());

        System.out.println("Faktura 2");
        System.out.println("Číslo faktury: " + invoice2.getInvoiceNumber());
        System.out.println("Jméno zákazníka: "  + invoice2.getCustomerName());
        System.out.println("Datum vystavení faktury: " + invoice2.getInvoiceDate());
        System.out.println("Celková částka: " + invoice2.getTotalAmount());


        String name = "Karel" + " " + "Novák";
        System.out.println(name);
    }

}