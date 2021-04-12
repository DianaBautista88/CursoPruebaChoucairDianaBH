package co.com.choucair.certification.proyectoDiana.stepdefinitions;

import co.com.choucair.certification.proyectoDiana.model.AcademyChoucairData;
import co.com.choucair.certification.proyectoDiana.task.Answer;
import co.com.choucair.certification.proyectoDiana.task.Login;
import co.com.choucair.certification.proyectoDiana.task.OpenUp;
import co.com.choucair.certification.proyectoDiana.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
@Before
public void setStage() {

    OnStage.setTheStage(new OnlineCast());
}


    @Given("^than Diana wants to learn automation at the academy Choucair$")
    public void thanDianaWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairDataList) {

       OnStage.theActorCalled("Diana").wasAbleTo(OpenUp.ThePage(),(Login.onThePage(academyChoucairDataList.get(0).getStrUser(),academyChoucairDataList.get(0).getStrPassword())));
    }


    @When("^she search for the course  on the choucair academy platform$")
    public void sheSearchForTheCourseOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairDataList.get(0).getStrCourse()));

    }

    @Then("^she finds the course called$")
    public void sheFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairDataList.get(0).getStrCourse())));

    }
}
