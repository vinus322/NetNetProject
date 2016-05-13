package org.ymdroid.rnb;

import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;




/**
 * Created by kimminyoung on 2016-05-13.
 */
public class HTTPUtil  extends  Thread{
    private static final String TAG ="DEBUG" ;
    OkHttpClient client = new OkHttpClient();
    Request request;
    Response response;

    final String base_url  = "http://210.118.64.130:27017";


    public HTTPUtil(){ }

    public void connection(){
    }

    public String  signin(String user_id,String password ){
        try {
            RequestBody query = new FormEncodingBuilder()
                    .add("user_id", user_id)
                    .add("password", password)
                    .build();
            Log.e(TAG, "Signin1");
            request = new Request.Builder()
                    .url(base_url + "/api/user/signin")
                    .post(query)
                    .build();
            Log.e(TAG, "Signin2");
            response = client.newCall(request).execute();
            Log.e(TAG, "Signin3");
            if(StatusJsonParse( response.body().string()))
                return "LoginOk";
        }catch (Exception e){
            e.printStackTrace();
        }finally{
        }
        return "Failed";
    }


    public boolean StatusJsonParse(String data){
        boolean status = false;
        try {
            JSONObject  jsonRootObject = new JSONObject(data);
            status =jsonRootObject.optBoolean("status");
            return status;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return status;
    }
}
