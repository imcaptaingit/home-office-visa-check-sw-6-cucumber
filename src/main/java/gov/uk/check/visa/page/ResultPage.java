package gov.uk.check.visa.page;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver,this);
    }


    /*@CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement verifyResultTourism;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyResultHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa')]")
    WebElement verifyResultFamily;


    public String getResultMessageTourism() {
        log.info("Get result message." + verifyResultTourism.toString());
        return getTextFromElement(verifyResultTourism);
    }
    public String getResultMessageHealthCare() {
        log.info("Get result message." + verifyResultHealthCare.toString());
        return getTextFromElement(verifyResultHealthCare);
    }
    public String getResultMessageFamily() {
        log.info("Get result message." + verifyResultFamily.toString());
        return getTextFromElement(verifyResultFamily);
    }*/

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    public String confirmResultMessage()
    {
        String result= getTextFromElement(resultMessage);
        log.info("confirm the result message"+ resultMessage.toString());
        return result;
    }
}
