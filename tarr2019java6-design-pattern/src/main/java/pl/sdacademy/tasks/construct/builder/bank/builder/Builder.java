package pl.sdacademy.tasks.construct.builder.bank.builder;

import pl.sdacademy.tasks.construct.builder.bank.BankAccount;

public class Builder {

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public static Builder accountNumber(long accountNumber) {
            return new Builder(accountNumber);
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch){
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance){
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.setAccountNumber(this.accountNumber);
            account.setOwner(this.owner);
            account.setBranch(this.branch);
            account.setBalance(this.balance);
            account.setInterestRate(this.interestRate);
            return account;
        }
    }
