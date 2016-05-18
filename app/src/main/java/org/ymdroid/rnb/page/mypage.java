package org.ymdroid.rnb.page;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONObject;
import org.ymdroid.rnb.R;
import org.ymdroid.rnb.UserInfo;

public class mypage extends AppCompatActivity {
    private String TAG = "MYPAGE";

    UserInfo userInfo = UserInfo.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        setUserInfo();
    }

    public void setUserInfo(){
        EditText name = (EditText) findViewById(R.id.et_name);
        EditText password = (EditText) findViewById(R.id.et_password);
        EditText email = (EditText) findViewById(R.id.et_email);
        EditText birth = (EditText) findViewById(R.id.et_birth);

        Log.e(TAG, "test name : "+userInfo.name);

        name.setText(userInfo.name);
        password.setText(userInfo.getUserPassword());
        email.setText(userInfo.email);
        birth.setText(userInfo.birth);
    }

    public void OkButtonClicked(View v) throws Exception {
        Toast.makeText(getApplicationContext(), "okButton",Toast.LENGTH_LONG).show();
    }
    public void CancelButtonClicked(View v){
        finish();
    }


}
