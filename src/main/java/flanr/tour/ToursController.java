package flanr.tour;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author kkowalski
 */
@RestController
public class ToursController {

    @RequestMapping("/tours")
    public List<Tour> tours() {
        List<Tour> tours = new ArrayList<Tour>();

        Guide john = new Guide(1, "john@gmail.com", "12345", "John");
        Guide anna = new Guide(2, "anna@gmail.com", "12345", "Anna");

        tours.add(new Tour(1, "First Tour", 60, 1500, new Date(), "http://www.abc.com/image/1", john));
        tours.add(new Tour(2, "Second Tour", 30, 5000, new Date(new Date().getTime() + 10000), "http://www.abc.com/image/1", anna));

        return tours;
    }

}
