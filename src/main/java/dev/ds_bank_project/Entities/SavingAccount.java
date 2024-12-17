package dev.ds_bank_project.Entities;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@DiscriminatorValue("SA")
 @NoArgsConstructor @AllArgsConstructor
public class SavingAccount extends BankAccount {
    private double interestRate;

}

