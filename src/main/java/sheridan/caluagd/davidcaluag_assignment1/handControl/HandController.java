package sheridan.caluagd.davidcaluag_assignment1.handControl;
import org.springframework.web.servlet.ModelAndView;
import sheridan.caluagd.davidcaluag_assignment1.handRoll.HandRoll;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HandController {

    private final Logger logger = LoggerFactory.getLogger(HandController.class);

    @GetMapping(value={"/", "/input"})
    public ModelAndView input(){
        logger.trace("input() is called");
        return new ModelAndView("Hand", "envelope", new HandController());
    }


    @GetMapping(value={"/", "/random-hand"})
    public String hand(Model model){
        logger.trace("hand() is called");

        HandRoll hand =new HandRoll();
        logger.debug("hand = " + hand);


        model.addAttribute("hand", hand);
        return "Hand";
    }


}