package esipe.models;

import lombok.Data;
import lombok.ToString;

/**
 * @author Lesguer Florian
 */
@Data
@ToString
public class ErrorModel {
    private String errorTitle;

    public ErrorModel(String errorTitle) {
        this.errorTitle=errorTitle;
    }
    public ErrorModel() {

    }
}
