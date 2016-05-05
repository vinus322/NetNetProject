package org.ymdroid.rnb.page;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import org.ymdroid.rnb.R;
import org.ymdroid.rnb.event.ListData;
import org.ymdroid.rnb.event.ListViewAdapter;

import java.util.Collections;
import java.util.List;

/**
 * Created by kimminyoung on 2016-05-05.
 */
public class cosmetic_info extends ActionBarActivity implements AdapterView.OnItemSelectedListener
        {


    private ArrayAdapter<String> mSpinnerAdapter = null;
    private ListView mListView = null;
    private ListViewAdapter mAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetic_info);
        getSupportActionBar().setTitle("화장품정보");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFF339999));

        mListView = (ListView) findViewById(R.id.listView);

        mAdapter = new ListViewAdapter(this);
        mListView.setAdapter(mAdapter);

        mAdapter.addItem(getResources().getDrawable(R.drawable.ic_launcher),
                "화장품1",
                "2016-05-18");
        mAdapter.addItem(getResources().getDrawable(R.drawable.ic_launcher),
                "화장품2",
                "2016-05-01");
        mAdapter.addItem(getResources().getDrawable(R.drawable.ic_launcher),
                "화장품3",
                "2016-05-04");
        mAdapter.addItem(null,
                "화장품4",
                "2016-05-15");

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ListData mData = mAdapter.mListData.get(position);
                Toast.makeText(cosmetic_info.this, mData.mTitle, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_bar, menu);

        MenuItem item = menu.findItem(R.id.spinner);
        Spinner spinner = (Spinner) MenuItemCompat.getActionView(item);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.spinner) {
            Toast.makeText(this, "액션버튼 이벤트", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

