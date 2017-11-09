package esipe.models;

import lombok.Data;
import lombok.ToString;

/**
 * @author Lesguer Florian
 */
@Data
@ToString
public class UserDto {
    private Long userId;
    private String firstName;
    private String lastName;
}