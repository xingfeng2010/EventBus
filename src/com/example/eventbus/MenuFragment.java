/**
 * 
 */
package com.example.eventbus;

import java.util.ArrayList;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eventbus.R;

/**
 * @author LISHIXING
 *
 */
public class MenuFragment extends Fragment implements View.OnClickListener{
    private ArrayList<TextClickedListener> mTextClickedListener = new ArrayList<TextClickedListener>();
    private TextView mTextView1;
    private TextView mTextView2;
    
    public static interface TextClickedListener {
        void onTextClicked(String str);
    }

    /* (non-Javadoc)
     * @see android.app.Fragment#onActivityCreated(android.os.Bundle)
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
    }

    /* (non-Javadoc)
     * @see android.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View view = inflater.inflate(R.layout.menu, container);
        mTextView1 = (TextView) view.findViewById(R.id.text_1);
        mTextView2 = (TextView) view.findViewById(R.id.text_2);
        mTextView1.setOnClickListener(this);
        mTextView2.setOnClickListener(this);
        return view;
    }

    public void registerTextClickedListener(TextClickedListener listener) {
        mTextClickedListener.add(listener);
    }

    public void unregisterTextClickedListener(TextClickedListener listener) {
        mTextClickedListener.remove(listener);
    }

    @Override
    public void onClick(View view) {
        // TODO Auto-generated method stub
        switch (view.getId()) {
        case R.id.text_1:
            if (mTextClickedListener.get(0) != null) {
                mTextClickedListener.get(0).onTextClicked("TEXT1");
            }
            break;
        case R.id.text_2:
            if (mTextClickedListener.get(0) != null) {
                mTextClickedListener.get(0).onTextClicked("TEXT2");
            }
            break;
        }
    }
}
