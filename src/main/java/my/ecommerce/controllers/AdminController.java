package my.ecommerce.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@CrossOrigin
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    @GetMapping("/logged")
    public ResponseEntity<String> isLogged() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }
}
