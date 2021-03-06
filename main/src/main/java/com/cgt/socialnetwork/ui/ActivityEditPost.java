package com.cgt.socialnetwork.ui;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.cgt.socialnetwork.R;
import com.cgt.socialnetwork.fragment.FragmentEditPost;

/**
 * Created by CGTechnosoft
 */
public class ActivityEditPost extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back_arrow));
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.edit_post));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ActivityEditPost.this.finish();
            }
        });

        FragmentManager frManager = getFragmentManager();
        FragmentEditPost fragment = new FragmentEditPost();
        frManager.beginTransaction().add(R.id.container, fragment).commit();
    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_common;
    }

}