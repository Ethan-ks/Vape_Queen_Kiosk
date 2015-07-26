package com.thevapequeen.vapequeenkiosk.navigation;

/**
 * Created by Human on 7/21/2015.
 */

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import android.widget.Toast;

import com.thevapequeen.vapequeenkiosk.MainActivity;
import com.thevapequeen.vapequeenkiosk.R;
import com.thevapequeen.vapequeenkiosk.housejuices.ArtesianBlend;

import java.util.List;

/*
 * Here you can control what to do next when the user selects an item
 */
public class OnItemClickListenerArtesianNavItem implements OnItemClickListener {

    public static String _mCategory;
    List<ArtesianBlend> artesianBlendList;

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        MainActivity.artesianBlendsPerCategory.clear();
        _mCategory = null;
        artesianBlendList = MainActivity.artesianBlendList;
        Context context = view.getContext();

        TextView textViewItem = ((TextView) view.findViewById(R.id.textViewNavItem));

        // get the clicked item name
        String listItemText = textViewItem.getText().toString();
        _mCategory = listItemText;

        //create proper list and assign it to the proper MainActivity list
        //Refresh notify adapter
        //MainActivity.mlistViewMainArtesian.setVisibility(View.VISIBLE);

        // just toast it
        Toast.makeText(context, _mCategory, Toast.LENGTH_LONG).show();
        NavigationDrawerFragment.mDrawerLayout.closeDrawer(NavigationDrawerFragment.mFragmentContainerView);
    }





}
