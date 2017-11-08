package esipe.models;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;

/**
 * @author Lesguer Florian
 */
@Data
@ToString
public class UserDto {
    private Long id;
    private String lastName;
    private String firstName;
    private String address;
    private String phone;
    private Date birth;
}