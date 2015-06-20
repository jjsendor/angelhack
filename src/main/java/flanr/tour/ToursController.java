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

        Guide john = new Guide(1, "john@gmail.com", "123456", "John", "http://photos1.meetupstatic.com/photos/event/c/2/8/4/global_1369796.jpeg");
        Guide anna = new Guide(2, "anna@gmail.com", "123456", "Anna", "http://photos4.meetupstatic.com/photos/member/b/5/6/a/member_82846442.jpeg");

        tours.add(new Tour(1, "Visit Houses of Parliament", 60, 1500, new Date(), "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/D8CF15C18C.jpg", john));
        tours.add(new Tour(2, "Piccadilly Circus Tour", 30, 5000, new Date(new Date().getTime() + 10000), "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/YZ39UP63MI.jpg", anna));
        tours.add(new Tour(3, "St. Paul's Cathedral Visit", 30, 5000, new Date(new Date().getTime() + 12000), "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/PF69ULH2GU.jpg", anna));
        tours.add(new Tour(4, "London City Walk", 30, 5000, new Date(new Date().getTime() + 15000), "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/Q5F4Y33RNK.jpg", anna));
        tours.add(new Tour(5, "Liverpool Street Mayhem Experience", 30, 5000, new Date(new Date().getTime() + 18000), "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/7E71222234.jpg", anna));

        return tours;
    }

}
