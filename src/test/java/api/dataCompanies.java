package api;

import config.setUp;
import org.json.simple.JSONObject;

public class dataCompanies extends setUp {

    public JSONObject createCompany() {

        JSONObject payload = new JSONObject();
        payload.put("name", companyName);
        payload.put("desc", "description");
        return payload;
    }


}
