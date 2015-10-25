package com.example.eventbus;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = this.getFragmentManager();
        MenuFragment menuFrag = (MenuFragment)fm.findFragmentById(R.id.menu_frag);
        TextShowFragment showFrag = (TextShowFragment)fm.findFragmentById(R.id.show_frag);
        showFrag.setMenuFrag(menuFrag);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
