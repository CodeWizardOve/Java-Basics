public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee(
            "Shafat", "Alam", "213-134-001", 10000, .06);
            
        BasePlusCommissionEmployee BasePlusCommissionEmployee = new BasePlusCommissionEmployee(
            "Shafat", "Alam", "213-134-001", 10000, .06,300);

        System.out.printf("%s %s:%n%n%s%n%n","Call Commission's toString with superclass reference ","to superclass object", commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n","Call Commission's toString with superclass reference ","to superclass object", BasePlusCommissionEmployee.toString());

        BasePlusCommissionEmployee commissionEmployee2 = BasePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n%n","Call Commission's toString with superclass reference ","to superclass object", commissionEmployee2.toString());
           
    }
}
