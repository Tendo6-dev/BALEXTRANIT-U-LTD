public class TransactionRecord {
    
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private LocalDateTime transactionTimestamp;

    
    public TransactionRecord(String buyerTIN, String sellerTIN, 
                           double invoiceAmount, LocalDateTime timestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.transactionTimestamp = timestamp;
    }

    
    public String getBuyerTIN() {
        return buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    // Setter methods with validation
    public void setInvoiceAmount(double amount) {
        if (amount > 0) {
            this.invoiceAmount = amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    
    public LocalDateTime getTransactionTimestamp() {
        return transactionTimestamp;
    }
}
