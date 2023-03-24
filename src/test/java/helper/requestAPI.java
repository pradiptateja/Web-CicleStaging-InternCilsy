package helper;

import api.*;
import config.setUp;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class requestAPI extends setUp {

    baseUrl baseUrl = new baseUrl();
    token token = new token();
    dataCompanies dataCompanies = new dataCompanies();
    dataTeams dataTeams = new dataTeams();

    public void createCompany() {
        RestAssured.baseURI = baseUrl.getStagingCicle();
        JSONObject payload = dataCompanies.createCompany();
        Response response = given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token.getToken())
                .body(payload.toJSONString())
                .post("/companies")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();

        JsonPath responseParsed = response.jsonPath();
        Assert.assertEquals(responseParsed.getString("message"), "Successfully create company user");
        companyId = responseParsed.getString("newCompany._id");
    }


    public void createTeam(String companyId) {
        RestAssured.baseURI = baseUrl.getStagingCicle();
        JSONObject payload = dataTeams.createTeam();

        given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token.getToken())
                .body(payload.toJSONString())
                .post("/teams?companyId=" + companyId)
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();
    }

    public void createHQ(String companyId) {
        RestAssured.baseURI = baseUrl.getStagingCicle();
        JSONObject payload = dataTeams.createHQ();

        given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token.getToken())
                .body(payload.toJSONString())
                .post("/teams?companyId=" + companyId)
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();
    }

    public void createProject(String companyId) {

        RestAssured.baseURI = baseUrl.getStagingCicle();
        JSONObject payload = dataTeams.createProject();

        given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token.getToken())
                .body(payload.toJSONString())
                .post("/teams?companyId=" + companyId)
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();
    }

    public void deleteCompany (String companyId) {

        RestAssured.baseURI = baseUrl.getStagingCicle();

        given()
                .when()
                .header("Content-Type", "application/json")
                .header("Authorization", token.getToken())
                .delete("/companies/" + companyId)
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response();

    }

}
