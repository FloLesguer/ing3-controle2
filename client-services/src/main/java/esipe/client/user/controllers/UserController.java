package esipe.client.user.controllers;

import esipe.restutils.RestManagement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * User controller class
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    private String PATH_ROOT = "users/";

    /**
     *
     * @param id
     * @return
     * @throws IOException
     */
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity getUser(@PathVariable Long id) throws IOException {
        return RestManagement.getResponse(PATH_ROOT, id);
    }



}
