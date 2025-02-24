package BrowserLook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/display")
public class DisplayInBrowser {
    @GetMapping("/msg")
    public String display() {
        return "Hello, World!";
    }
}
