package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.MySelfPage;
import com.cybertek.pages.RoomPage;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class MyDetailsStepDefinitions {



    @Then("the user should see their information")
    public void the_user_should_see_their_information(Map<String,String> userInfo) {
        System.out.println(userInfo);

        String name = userInfo.get("name");
        System.out.println("Name : "+ name);

        String role = userInfo.get("role");
        System.out.println("Role : "+ role);

        String team = userInfo.get("team");
        System.out.println("team : "+ team);

        String batch = userInfo.get("batch");
        System.out.println("Batch : "+ batch);

        String campus = userInfo.get("campus");
        System.out.println("Campus :"+campus);

        MySelfPage mySelfPage = new MySelfPage();
        String actualName = mySelfPage.name.getText();
        String actualRole = mySelfPage.role.getText();
        String actualTeam = mySelfPage.role.getText();
        String actualBatch = mySelfPage.batch.getText();
        String actualCampus = mySelfPage.campus.getText();

        Assert.assertTrue("Name is not match", actualName.equals(name));
        Assert.assertTrue("Role is not match", actualRole.equals(role));
        Assert.assertTrue("Team is not match", actualTeam.equals(team));
        Assert.assertTrue("Batch is not match", actualBatch.equals(batch));
        Assert.assertTrue("Campus is not match", actualCampus.equals(campus));



    }


    @Then("user should be able to see quotes info for each room")
    public void user_should_be_able_to_see_quotes_info_for_each_room(Map<String, String> rooms) throws InterruptedException {
        System.out.println(rooms);

        for (String room : rooms.keySet()){
            System.out.println(room);
            // click on the room
            MapPage mapPage = new MapPage();
            mapPage.room(room).click();
            // verify quote
            RoomPage roomPage = new RoomPage();
            Assert.assertEquals(rooms.get(room), roomPage.capacityQuote.getText());
//            Driver.getDriver().navigate().back();
            mapPage.map.click();

        }
    }



}
