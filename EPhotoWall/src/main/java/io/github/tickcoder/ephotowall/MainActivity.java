package io.github.tickcoder.ephotowall;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import io.github.tickcoder.ephotowall.Base.BaseActivity;
import io.github.tickcoder.ephotowall.Photo.PhotoAdapter;
import io.github.tickcoder.ephotowall.Photo.PhotoInfo;

public class MainActivity extends BaseActivity {

    private RecyclerView mPhotoRecyclerView;
    private PhotoAdapter mPhotoAdapter;
    private GridLayoutManager mPhotoGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PhotoInfo> photoList = new ArrayList<>();
        for (int i=0; i<17; i++) {
            PhotoInfo photoInfo = new PhotoInfo();
            photoInfo.setFilePath("https://img6.bdstatic.com/img/image/smallpic/weijupaisheyanhua.jpg");
            photoList.add(photoInfo);
        }

        mPhotoAdapter = new PhotoAdapter(this, 3, photoList);
        mPhotoGridLayoutManager = new GridLayoutManager(this, 3, LinearLayoutManager.VERTICAL, false);
        mPhotoRecyclerView = (RecyclerView)findViewById(R.id.main_activity_photo_recyclerview);
        mPhotoRecyclerView.setLayoutManager(mPhotoGridLayoutManager);
        mPhotoRecyclerView.setAdapter(mPhotoAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_main_activity_item_refresh: {
                break;
            }
            case R.id.menu_main_activity_item_upload: {
                break;
            }
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}
