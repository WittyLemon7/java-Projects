package dev.projects.CinemaHallBookingSystem;

public class PaymentSystem {

    private String paymentMode;
    private double amount;
    private String transactionId;
    private String status;
    private String date;
    private String time;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public PaymentSystem(String paymentMode, double amount, String transactionId, String status, String date, String time, String customerName, String customerEmail, String customerPhone) {
        this.paymentMode = paymentMode;
        this.amount = amount;
        this.transactionId = transactionId;
        this.status = status;
        this.date = date;
        this.time = time;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
    @Override
    public String toString() {
        return "PaymentSystem{" +
                "paymentMode ='" + paymentMode + '\'' +
                ", amount =" + amount +
                ", transactionId ='" + transactionId + '\'' +
                ", status ='" + status + '\'' +
                ", date ='" + date + '\'' +
                ", time ='" + time + '\'' +
                ", customerName ='" + customerName + '\'' +
                ", customerEmail ='" + customerEmail + '\'' +
                ", customerPhone ='" + customerPhone + '\'' +
                '}';
    }
    public void processPayment(double availableBalance) {
        // Simulate payment processing logic
        System.out.println("Processing payment of $" + amount + " via " + paymentMode);

        if (availableBalance >= amount) {
            this.status = "Success";
            System.out.println("Payment successful! Transaction ID: " + transactionId);
        } else {
            this.status = "Failed";
            System.out.println("Payment failed: Insufficient funds.");
        }
    }
    //    public void processPayment() {
//        // this method always proceeds with payment without validating if the transaction was successful
//        System.out.println("Processing payment of $" + amount + " via " + paymentMode);
//        // Update status to "Success" for demonstration purposes
//        this.status = "Success";
//        System.out.println("Payment successful! Transaction ID: " + transactionId);
//    }
    public void cancelPayment() {
        // Simulate payment cancellation logic
        System.out.println("Cancelling payment with Transaction ID: " + transactionId);
        // Update status to "Cancelled"
        this.status = "Cancelled";
        System.out.println("Payment cancelled successfully.");
    }

    public void refundPayment() {
        // Simulate payment refund logic
        if (!status.equals("Success")) {
            System.out.println("Refund failed: Payment was not successful.");
            return;
        }

        System.out.println("Refunding payment of $" + amount + " for Transaction ID: " + transactionId);
        this.status = "Refunded";
        System.out.println("Payment refunded successfully.");
    }
    //    public void refundPayment() {
//        // thsi always proceeds with refund
//        System.out.println("Refunding payment of $" + amount + " for Transaction ID: " + transactionId);
//        // Update status to "Refunded"
//        this.status = "Refunded";
//        System.out.println("Payment refunded successfully.");
//    }
    public void displayPaymentDetails() {
        // Displaying payment details
        System.out.println("\n===== Payment Details =====");
        System.out.println("Payment Mode: " + paymentMode);
        System.out.printf("Amount: $%.2f\n", amount);
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Email: " + customerEmail);
        System.out.println("Customer Phone: " + customerPhone);
    }
    public void displayPaymentSummary() {
        // Displaying a summary of the payment
        System.out.println("\n===== Payment Summary =====");
        System.out.printf("Payment Mode: %s\n", paymentMode);
        System.out.printf("Amount: $%.2f\n", amount);
        System.out.printf("Transaction ID: %s\n", transactionId);
        System.out.printf("Status: %s\n", status);
        System.out.printf("Date: %s\n", date);
        System.out.printf("Time: %s\n", time);
        System.out.printf("Customer Name: %s\n", customerName);
        System.out.printf("Customer Email: %s\n", customerEmail);
        System.out.printf("Customer Phone: %s\n", customerPhone);
    }
}