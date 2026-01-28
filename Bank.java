// Q6. Implement a banking system using java. 
// Create 3 sub class of Bank : SBI, BOI, ICICI 
// Classes should have attributes like 
// Name, headofficeAddress, chairmanName, 
// branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate. 
// All 3 should have following methods: 
// 1. add getters and setters for the fields 
// 2. print details of every bank (override toString)

class Bank {

    private String name;
    private String headOfficeAddress;
    private String chairmanName;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
}

class SBI extends Bank {

    @Override
    public String toString() {
        return "Bank: SBI\n" +
               "Name: " + getName() +
               "\nHead Office: " + getHeadOfficeAddress() +
               "\nChairman: " + getChairmanName() +
               "\nBranches: " + getBranchCount() +
               "\nFD Interest Rate: " + getFdInterestRate() +
               "\nPersonal Loan Interest Rate: " + getPersonalLoanInterestRate() +
               "\nHome Loan Interest Rate: " + getHomeLoanInterestRate();
    }
}

class BOI extends Bank {

    @Override
    public String toString() {
        return "Bank: BOI\n" +
               "Name: " + getName() +
               "\nHead Office: " + getHeadOfficeAddress() +
               "\nChairman: " + getChairmanName() +
               "\nBranches: " + getBranchCount() +
               "\nFD Interest Rate: " + getFdInterestRate() +
               "\nPersonal Loan Interest Rate: " + getPersonalLoanInterestRate() +
               "\nHome Loan Interest Rate: " + getHomeLoanInterestRate();
    }
}

class ICICI extends Bank {

    @Override
    public String toString() {
        return "Bank: ICICI\n" +
               "Name: " + getName() +
               "\nHead Office: " + getHeadOfficeAddress() +
               "\nChairman: " + getChairmanName() +
               "\nBranches: " + getBranchCount() +
               "\nFD Interest Rate: " + getFdInterestRate() +
               "\nPersonal Loan Interest Rate: " + getPersonalLoanInterestRate() +
               "\nHome Loan Interest Rate: " + getHomeLoanInterestRate();
    }
}

class TestBank {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.setName("State Bank of India");
        sbi.setHeadOfficeAddress("Mumbai, India");
        sbi.setChairmanName("Dinesh Kumar Khara");
        sbi.setBranchCount(22000);
        sbi.setFdInterestRate(5.5);
        sbi.setPersonalLoanInterestRate(10.5);
        sbi.setHomeLoanInterestRate(7.5);

        BOI boi = new BOI();
        boi.setName("Bank of India");
        boi.setHeadOfficeAddress("Mumbai, India");
        boi.setChairmanName("Atanu Kumar Das");
        boi.setBranchCount(5000);
        boi.setFdInterestRate(6.0);
        boi.setPersonalLoanInterestRate(11.0);
        boi.setHomeLoanInterestRate(8.0);

        ICICI icici = new ICICI();
        icici.setName("ICICI Bank");
        icici.setHeadOfficeAddress("Mumbai, India");
        icici.setChairmanName("Girish Chandra Chaturvedi");
        icici.setBranchCount(4900);
        icici.setFdInterestRate(6.5);
        icici.setPersonalLoanInterestRate(12.0);
        icici.setHomeLoanInterestRate(8.5);

        System.out.println(sbi.toString());
        System.out.println();
        System.out.println(boi.toString());
        System.out.println();
        System.out.println(icici.toString());
    }
}