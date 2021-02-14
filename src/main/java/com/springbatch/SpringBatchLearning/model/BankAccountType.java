package com.springbatch.SpringBatchLearning.model;

public enum BankAccountType {
    PRATA,
    OURO,
    PLATINA,
    DIAMANTE,
    INVALID;

    public static BankAccountType returnFromSalaryRange(Double salaryRange) {
        if (salaryRange == null) {
            return INVALID;
        } else if (salaryRange <= 3000) {
            return PRATA;
        } else if (salaryRange >= 3001 && salaryRange <= 5000) {
            return OURO;
        } else if (salaryRange >= 5000 && salaryRange <= 10000) {
            return PLATINA;
        } else {
            return DIAMANTE;
        }
    }
}
