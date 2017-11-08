package fr.lesguer.clientmanagement.user.controllers;

import esipe.models.*;
import esipe.restutils.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author Lesguer Florian
 * Controller class to handle Accounts
 */
@RestController
@RequestMapping(path = "/accounts")
public class UserAccountController {

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
     * @param accountDto
     * @return
     * @throws IOException
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createAccount(@RequestBody AccountDto accountDto) throws IOException {
        return RestManagement.postReponse(PATH_ROOT, accountDto);
    }

}
