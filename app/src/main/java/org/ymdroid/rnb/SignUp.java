package org.ymdroid.rnb;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;
import org.ymdroid.rnb.page.menu;

public class SignUp extends FragmentActivity {
    private String TAG = "SignUp";
    HTTPUtil httpUtil = new HTTPUtil();
    JsonParse json= new JsonParse();
    JSONObject obj;
    String res;
    private ProgressBar spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_sign_up);

        spinner = (ProgressBar) findViewById(R.id.progressBar);
        spinner.setVisibility(View.GONE);

    }

    public void OkButtonClicked(View v) throws Exception {
        EditText email = (EditText) findViewById(R.id.et_email);
        EditText name = (EditText) findViewById(R.id.et_name);
        EditText birth = (EditText) findViewById(R.id.et_birth);
        EditText password = (EditText) findViewById(R.id.et_password);

        obj = new JSONObject();
        obj.put("email",email.getText().toString());
        obj.put("name",name.getText().toString());
        obj.put("birth",birth.getText().toString());
        obj.put("password",password.getText().toString());

        //test용
        obj.put("user_id", email.getText().toString());
        obj.put("gender", 1);
        obj.put("phone", "010-0000-0000");
        obj.put("verify", "verified");
        //

        Log.e(TAG, "obj String : " + obj.toString());
        spinner.setVisibility(View.VISIBLE);

        //서버로 보냄 파라미터 : "url"동적으로 변화되는 경로, "jsonObject"서버로 보내질 객체
        HttpTask task = new HttpTask("/api/user/signup",  obj.toString());
        String res = task.execute().get(); //결과값을 받음
        Log.e(TAG, "result : " + res);//결과 객체 확인

        if(json.StatusJsonParse(res)){
            Toast.makeText(getApplicationContext(), "회원가입되셨습니다.", Toast.LENGTH_LONG).show();
            spinner.setVisibility(View.GONE);
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "회원가입실패", Toast.LENGTH_LONG).show();
            spinner.setVisibility(View.GONE);
        }

    }



    public void CancelButtonClicked(View v){
        finish();
    }
}
