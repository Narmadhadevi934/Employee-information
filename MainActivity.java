Parsing JSONObject
package com.example.jsonparsing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import org.json.JSONObject;

public class MainActivity extends Activity {

    public static final String JSON_STRING =
            "{\"employee\":{\"name\":\"Sachin\",\"salary\":56000}}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

TextView textView1 = findViewById(R.id.textView1);

        try {
JSONObjectemp = new JSONObject(JSON_STRING).getJSONObject("employee");

            String empname = emp.getString("name");
intempsalary = emp.getInt("salary");

            String str = "Employee Name: " + empname +
                         "\nEmployee Salary: " + empsalary;

            textView1.setText(str);

        } catch (Exception e) {
e.printStackTrace();
        }
    }
}
