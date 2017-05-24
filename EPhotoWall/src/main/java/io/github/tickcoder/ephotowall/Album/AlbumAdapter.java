package io.github.tickcoder.ephotowall.Album;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by claris on 2017.05.24.Wednesday.
 */

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumAdapterVH> {

    // ViewHolder
    public class AlbumAdapterVH extends RecyclerView.ViewHolder {
        public AlbumAdapterVH(View itemView) {
            super(itemView);
        }
    }

    private Context mContext;
    private int mColNum = 3;
    private List<AlbumInfo> mAlbumList = new ArrayList<>();

    public AlbumAdapter(Context context, int colNum) {
        super();
        this.mContext = context;
        this.mColNum = colNum;
    }

    public AlbumAdapter(Context context, int colNum, List<AlbumInfo> albumList) {
        super();
        this.mContext = context;
        this.mColNum = colNum;
        this.mAlbumList.addAll(albumList);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public AlbumAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(AlbumAdapterVH holder, int position) {
    }

    @Override
    public void onBindViewHolder(AlbumAdapterVH holder, int position, List<Object> payloads) {
        super.onBindViewHolder(holder, position, payloads);
    }
}
