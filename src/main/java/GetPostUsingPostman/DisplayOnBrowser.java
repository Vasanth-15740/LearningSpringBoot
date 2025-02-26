package GetPostUsingPostman;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/GetDetails")
public class DisplayOnBrowser {

    @GetMapping("/DisplayDetails")
    public String Displaydetails(){
       Details d = new Details();
       return d.toString();
    }

    @PostMapping("/PostData")
    public String postdata(@RequestBody Details d) {

        String name = d.getName().trim();
        String phone = d.getPhone().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            return "Error: Name and Phone cannot be empty.";
        }
        if (!phone.matches("\\d+")) {
            return "Error: Phone number must contain only digits.";
        }
        if (phone.length() > 10) {
            return "Error: Phone number must not exceed 10 digits.";
        }

        d.setName(name.toUpperCase());
        d.setPhone(phone.toUpperCase());

        return d.toString();
    }


}
