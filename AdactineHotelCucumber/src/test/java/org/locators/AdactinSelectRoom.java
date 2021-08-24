package org.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectRoom extends Base{
	
	public AdactinSelectRoom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioSelect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getRadioSelect() {
		return radioSelect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
