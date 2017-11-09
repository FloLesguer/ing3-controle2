package esipe.models;

import lombok.Data;
import lombok.ToString;

/**
 * @author Lesguer Florian
 */

@Data
@ToString
public class UserAccountDto {
    private double balance;
    private Long accountId;
    private BookDto bookDto;
    private String accountType;

}