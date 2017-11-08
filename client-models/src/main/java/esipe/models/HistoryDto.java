package esipe.models;

import lombok.Data;
import lombok.ToString;

import java.sql.Timestamp;

/**
 * @author Lesguer Florian
 */
@Data
@ToString
public class HistoryDto {
    private Boolean transaction;
    private Long userId;
    private UserAccountDto userAccountDto;
    private Timestamp transactionTime;
    private Double transactionAmount;

}
