package org.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinRoom extends Base{
	
	public AdactinRoom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dropLocation;
	
	@FindBy(id="hotels")
	private WebElement dropHotel;
	
	@FindBy(id="room_type")
	private WebElement dropRoom;
	
	@FindBy(id="room_nos")
	private WebElement dropRoomNo;
	
	@FindBy(id="adult_room")
	private WebElement dropAdult;
	
	@FindBy(id="child_room")
	private WebElement dropChild;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;

	public WebElement getDropLocation() {
		return dropLocation;
	}

	public WebElement getDropHotel() {
		return dropHotel;
	}

	public WebElement getDropRoom() {
		return dropRoom;
	}

	public WebElement getDropRoomNo() {
		return dropRoomNo;
	}

	public WebElement getDropAdult() {
		return dropAdult;
	}

	public WebElement getDropChild() {
		return dropChild;
	}
	
	

}
