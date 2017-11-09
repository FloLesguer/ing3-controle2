package esipe.models;

import lombok.Data;
import lombok.ToString;
import java.util.Date;

import java.sql.Timestamp;

/**
 * @author Lesguer Florian
 */
@Data
@ToString
public class HistoryDto {

    private Date takeAwayDate;
    private Date bringBackDate;
    private int userId;
    private int bookId;

}
