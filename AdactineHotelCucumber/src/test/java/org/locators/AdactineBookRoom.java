package org.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactineBookRoom extends Base{

	public AdactineBookRoom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLAstName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCCNum;
	
	@FindBy(id="cc_type")
	private WebElement txtCCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement dropCCMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dropCCYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCVV;
	
	@FindBy(id="book_now")
	private WebElement txtBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLAstName() {
		return txtLAstName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCCNum() {
		return txtCCNum;
	}

	public WebElement getTxtCCType() {
		return txtCCType;
	}

	public WebElement getDropCCMonth() {
		return dropCCMonth;
	}

	public WebElement getDropCCYear() {
		return dropCCYear;
	}

	public WebElement getTxtCVV() {
		return txtCVV;
	}

	public WebElement getTxtBookNow() {
		return txtBookNow;
	}
}
