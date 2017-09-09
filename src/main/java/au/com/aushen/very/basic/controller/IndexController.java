package au.com.aushen.very.basic.controller;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class IndexController {

    @GetMapping(value = "", produces = "application/json")
    public String index() {
        DateTime now = DateTime.now();
        return String.format("Hello, Very. It's %s.", now.toString(ISODateTimeFormat.dateTime()));
    }

}
