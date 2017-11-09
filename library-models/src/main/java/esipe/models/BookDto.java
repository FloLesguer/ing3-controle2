package esipe.models;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

/**
 * @author Lesguer Florian
 */
@Data
@ToString
public class BookDto {
    private Long id;
    private String title;
    private enum category {action, science_fiction, biographie}
    private boolean newOrUsed;
    private int copyNumber;
}