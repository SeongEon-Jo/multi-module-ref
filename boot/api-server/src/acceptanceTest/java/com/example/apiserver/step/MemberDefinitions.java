package com.example.apiserver.step;

import com.example.apiserver.AcceptanceSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MemberDefinitions extends AcceptanceSteps {

    @Given("관리자 권한으로 로그인하고")
    public void 관리자권한으로로그인하고() {
        System.out.println("로그인");
    }

    @When("새로운 멤버를 동록하면")
    public void 새로운멤버를동록하면() {
        System.out.println("멤버 등록");
    }


    @Then("새로운 멤버가 등록된다.")
    public void 새로운멤버가등록된다() {
        System.out.println("멤버 등록 완료");
    }
}
