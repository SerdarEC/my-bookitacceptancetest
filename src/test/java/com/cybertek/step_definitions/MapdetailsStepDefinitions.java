package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.MyTeamPage;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MapdetailsStepDefinitions {
    @Then("I should be able to see {string} room")
    public void i_should_be_able_to_see_room(String roomName) {

        MapPage mapPage = new MapPage();
        //List<WebElement> allRooms = mapPage.allRooms;
        //method abowe get only names of WebElements, we couldn't get
        // room names as String from that List

        List<String> allRooms = BrowserUtils.getElementsText(mapPage.allRooms);
        Assert.assertTrue("Room was not found : " + roomName, allRooms.contains(roomName));

    }

    @Then("I should be able to see following conferance rooms:")
    public void i_should_be_able_to_see_following_conferance_rooms(List<String> rooms) {
       System.out.println(rooms);
       System.out.println(rooms.size());

    }

    @When("user goes to the {string} page")
    public void user_goes_to_the_page(String page) {
        MapPage mapPage = new MapPage();
        switch (page){
            case "map":
                mapPage.map.click();
                break;
            case "hunt":
                mapPage.hunt.click();
                break;
            case "my self":
                mapPage.goToSelf();
                break;
            case "my team":
                mapPage.goToTeam();
                break;
        }
    }

    @Then("following team members should be displayed")
    public void following_team_members_should_be_displayed(List<String> members) {
        System.out.println(members);
        MyTeamPage myTeam = new MyTeamPage();
        List<String> actualMembers = BrowserUtils.getElementsText(myTeam.allNames);

        Assert.assertTrue(members.containsAll(actualMembers));
    }


}
