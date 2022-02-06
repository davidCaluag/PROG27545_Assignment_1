package sheridan.caluagd.davidcaluag_assignment1.handControl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sheridan.caluagd.davidcaluag_assignment1.handRoll.HandRoll;

@Controller
public class HandController {

    private final Logger logger = LoggerFactory.getLogger(HandController.class);

    @GetMapping(value={"/", "/random-hand"})
    public String hand(Model model){
        logger.trace("hand() is called");

        HandRoll hand =new HandRoll();
        logger.debug("hand = " + hand);

        model.addAttribute("hand", hand);
        return "Hand";
    }


}