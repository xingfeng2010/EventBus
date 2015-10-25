package com.example.eventbus;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eventbus.R;
public class TextShowFragment extends Fragment implements MenuFragment.TextClickedListener{

    private TextView mText;
    private MenuFragment mMenuFragment;
    /* (non-Javadoc)
     * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        mMenuFragment.registerTextClickedListener(this);
    }

    /* (non-Javadoc)
     * @see android.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.text_show, container);
        mText = (TextView) view.findViewById(R.id.text);
        return view;
    }

    @Override
    public void onTextClicked(String str) {
        // TODO Auto-generated method stub
        mText.setText(str);
    }

    public void setMenuFrag(MenuFragment frag) {
        mMenuFragment = frag;
    }

    /* (non-Javadoc)
     * @see android.app.Fragment#onStop()
     */
    @Override
    public void onStop() {
        // TODO Auto-generated method stub
        mMenuFragment.unregisterTextClickedListener(this);
        super.onStop();
    }
}
