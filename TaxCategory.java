
abstract class TaxCategory {
    public abstract double calculateVAT(double amount);
}


class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}


class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15;
    }
}


class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return (amount * 0.10) + (amount * 0.05); // VAT + duty
    }
}

public class EFRISSystem {
    public static void main(String[] args) {
        
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer(),
            new Retailer()
        };

        
        double[] amounts = {100000, 500000, 200000, 750000};

        
        for (int i = 0; i < taxpayers.length; i++) {
            TaxCategory taxpayer = taxpayers[i];
            double vat = taxpayer.calculateVAT(amounts[i]);
            
            System.out.printf("Taxpayer %d: %s VAT = %.2f on amount %.2f%n",
                i + 1,
                taxpayer.getClass().getSimpleName(),
                vat,
                amounts[i]);
        }
    }
}
