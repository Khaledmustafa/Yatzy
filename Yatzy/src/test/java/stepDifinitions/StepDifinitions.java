package stepDifinitions;

import java.util.Random;
import java.util.Scanner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDifinitions {
	
	private Random randomNumber = new Random(); 
	private int[] dice = new int[5];
	
	@Given("Create a dice")
	public void create_a_dice() {
		
		int dices = (int)(Math.random()*6+1);
	}

	@When("Throw one dice, save and show the score point")
	public void throw_one_dice_save_and_show_the_score_point() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Throw more than one dice, save and show the score point for each dice")
	public void throw_more_than_one_dice_save_and_show_the_score_point_for_each_dice() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Calculate the number of points in different ways according to rules")
	public void calculate_the_number_of_points_in_different_ways_according_to_rules() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
