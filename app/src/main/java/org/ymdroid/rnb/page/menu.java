package org.ymdroid.rnb.page;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import org.ymdroid.rnb.Login;
import org.ymdroid.rnb.R;
import org.ymdroid.rnb.event.BackPressButtonActivity;

public class menu extends FragmentActivity {
    private ArrayAdapter<String> mSpinnerAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void capture_barcode_click(View v) {
        Toast.makeText(getApplicationContext(), "바코드찍기",Toast.LENGTH_LONG).show();
    }

    public void capture_cosmetic_click(View v) {
        Toast.makeText(getApplicationContext(), "화장품성분표찍기",Toast.LENGTH_LONG).show();
    }

    public void cosmetic_info_click(View v) {
        Intent i = new Intent(menu.this, cosmetic_info.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(), "화장품정보",Toast.LENGTH_LONG).show();

    }

    public void cosmetic_ingredient_click(View v) {
        Toast.makeText(getApplicationContext(), "화장품성분표소개",Toast.LENGTH_LONG).show();
    }

    public void mypage_click(View v) {
        Intent i = new Intent(menu.this, mypage.class);
        startActivity(i);
        Toast.makeText(getApplicationContext(), "마이페이지",Toast.LENGTH_LONG).show();
    }


}