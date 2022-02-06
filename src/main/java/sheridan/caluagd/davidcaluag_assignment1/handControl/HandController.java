package sheridan.caluagd.davidcaluag_assignment1.handControl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import sheridan.caluagd.davidcaluag_assignment1.handRoll.HandRoll;


@Controller
public class HandController {

    private final Logger logger = LoggerFactory.getLogger(HandController.class);


    @GetMapping(value={"/", "/input"})
    public ModelAndView input(){
        logger.trace("input() is called");
        return new ModelAndView("Hand", "hand", new HandRoll());
    }


    @GetMapping("/process")
    public ModelAndView process(
            @Validated @ModelAttribute HandRoll hand,
            BindingResult bindingResult){
        logger.trace("process() is called");
        logger.debug("handRoll = " + hand);
        if(bindingResult.hasErrors()){
            return new ModelAndView("Hand");
        }
        return new ModelAndView("Output", "hand", hand);
    }


}