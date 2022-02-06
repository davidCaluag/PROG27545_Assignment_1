package sheridan.caluagd.davidcaluag_assignment1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sheridan.caluagd.davidcaluag_assignment1.handRoll;

@Controller
public class handController {

    private final Logger logger = LoggerFactory.getLogger(handController.class);

    @GetMapping(value={"/", "/random-hand"})
    public String hand(Model model){
        logger.trace("hand() is called");

        handRoll hand = new handRoll();
        logger.debug("hand = " + hand);

        model.addAttribute("hand", hand);
        return "Hand";
    }


}