package api;

import org.json.simple.JSONObject;
import config.setUp;

public class dataTeams extends setUp {

    public JSONObject createTeam() {

        JSONObject payload = new JSONObject();
        payload.put("name", teamName);
        payload.put("desc", "description");
        payload.put("type", "team");

        return payload;

    }

    public JSONObject createHQ() {

        JSONObject payload = new JSONObject();
        payload.put("name", HQName);
        payload.put("desc", "description");
        payload.put("type", "hq");

        return payload;

    }


    public JSONObject createProject() {

        JSONObject payload = new JSONObject();
        payload.put("name", projectName);
        payload.put("desc", "description");
        payload.put("type", "project");

        return payload;

    }

}
