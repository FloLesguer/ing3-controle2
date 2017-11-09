package esipe.client.user.controllers;

import esipe.restutils.RestManagement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Account controller class
 */
@RestController
@RequestMapping(path = "/accounts")
public class AccountController {

    private String PATH_ROOT = "accounts/";

    /**
     *
     * @param id
     * @return
     * @throws IOException
     */
    @RequestMapping(path = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity getUserAccount(@PathVariable Long id) throws IOException {
        return RestManagement.getResponse(PATH_ROOT + "user/", id);
    }

    /**
     *
     * @param accountTransaction
     * @return
     * @throws IOException
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateUser(@RequestBody AccountTransaction accountTransaction) throws IOException {
        return RestManagement.putResponse(PATH_ROOT,null, accountTransaction);
    }

}
