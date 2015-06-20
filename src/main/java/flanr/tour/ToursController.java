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

        tours.add(new Tour(1, "Visit Houses of Parliament", "When the sun goes down in London, a second city emerges. Bright and towering skyscrapers, illuminated bridges, and twinkling lights that line the river appear and light the way for your London Night Tour! Come with us as we stroll along the beautiful river Thames, taking in the sunset and the stunning views of London’s night time facade. As the lights of the city come alive, we will enjoy the atmosphere and cross world-famous bridges to take in the best night time scenes London has to offer.", "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/D8CF15C18C.jpg", 60, 1500, new Date(), john));
        tours.add(new Tour(2, "Piccadilly Circus Tour", "Magna Carta, meaning ‘The Great Charter’, is one of the most famous documents in the world. Originally issued by King John of England (r.1199-1216) as a practical solution to the political crisis he faced in 1215, Magna Carta established for the first time the principle that everybody, including the king, was subject to the law. Although nearly a third of the text was deleted or substantially rewritten within ten years, and almost all the clauses have been repealed in modern times, Magna Carta remains a cornerstone of the British constitution. Most of the 63 clauses granted by King John dealt with specific grievances relating to his rule. However, buried within them were a number of fundamental values that both challenged the autocracy of the king and proved highly adaptable in future centuries. Most famously, the 39th clause gave all ‘free men’ the right to justice and a fair trial. Some of Magna Carta’s core principles are echoed in the United States Bill of Rights (1791) and in many other constitutional documents around the world, as well as in the Universal Declaration of Human Rights (1948) and the European Convention on Human Rights (1950).", "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/YZ39UP63MI.jpg", 30, 5000, new Date(new Date().getTime() + 10000), anna));
        tours.add(new Tour(3, "St. Paul's Cathedral Visit", "East of the Square Mile is London’s most diverse and culturally creative area, the East End has been a dangerous slum on the outskirts of the capital, a centre for trade and immigration, now an up-and-coming trendy area and a place for trend-setting street art. In less than 2 hours together we can discover fascinating historical parts as well as modern iconic buildings including The Gherkin and more...", "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/PF69ULH2GU.jpg", 30, 5000, new Date(new Date().getTime() + 12000), anna));
        tours.add(new Tour(4, "London City Walk", "If you want to find out what Romans did for us join me on this walk.Highlights include everything from sections of London's ancient city wall, Roman fort and a bastion. Learn about Temple of Mithras which was built on the banks of the River Walbrook, it was rediscovered only in the 1950's during the rebuilding consequent upon the World War II bomb damage.", "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/Q5F4Y33RNK.jpg", 30, 5000, new Date(new Date().getTime() + 15000, anna)));
        tours.add(new Tour(5, "Liverpool Street Mayhem Experience", "http://snap-photos.s3.amazonaws.com/img-thumbs/960w/7E71222234.jpg", anna, "One of most panoramic walks in London! As we walk along the North Bank, you will see the iconic landmarks like OXO Tower, Tate Modern and Shakespeare's Globe theatre as well the Wobbly Bridge!!! Following the river path, you will find out about the history of River Thames, how it influenced development of the City over the centuries and discover why Thames has been the lifeblood of London for nearly 2000 years.", 30, 5000, new Date(new Date().getTime() + 18000), anna));

        return tours;
    }

}
