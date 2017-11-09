package esipe.models;

import lombok.Data;
import lombok.ToString;

/**
 * @author Lesguer Florian
 */
@Data
@ToString
public class AccountTransaction {
    private Long idAccount;
    private Boolean transferAmount;
    private Double amount;
}
