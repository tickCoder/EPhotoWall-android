package io.github.tickcoder.ephotowall.Photo;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import io.github.tickcoder.ephotowall.R;
import io.github.tickcoder.ephotowall.Utils.LogUtil;

/**
 * Created by claris on 2017.05.24.Wednesday.
 */

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.PhotoAdapterVH> {

    // ViewHolder
    class PhotoAdapterVH extends RecyclerView.ViewHolder {
        public SimpleDraweeView photoView;
        public int position;
        public PhotoAdapterVH(View itemView) {
            super(itemView);
            photoView = (SimpleDraweeView) itemView.findViewById(R.id.vh_photo_adapter_photo);
        }
    }

    // Interface
    public interface IPhotoAdapterActionListener {
        void onItemClick(View view, int position);
        void onItemSelect(View view, int position);
        void onItemLongPress(View view, int position);
    }

    private Context mContext;
    private int mColNum = 3;
    private List<PhotoInfo> mPhotoList = new ArrayList<>();
    private IPhotoAdapterActionListener mActionListener;

    public PhotoAdapter(Context context, int colNum) {
        super();
        this.mContext = context;
        this.mColNum = colNum;
    }

    public PhotoAdapter(Context context, int colNum, List<PhotoInfo> photoList) {
        super();
        this.mContext = context;
        this.mColNum = colNum;
        this.mPhotoList.addAll(photoList);
    }

    public void setActionListener(IPhotoAdapterActionListener listener) {
        this.mActionListener = listener;
    }

    @Override
    public int getItemCount() {
        return mPhotoList.size();
    }

    @Override
    public PhotoAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        LogUtil.Log_Error("onCreateViewHolder");
        View view = LayoutInflater.from(mContext).inflate(R.layout.vh_photo_adapter, null); // null
        int width = parent.getWidth()/mColNum;
        view.setLayoutParams(new RecyclerView.LayoutParams(width, width));
        return new PhotoAdapterVH(view);
    }

    @Override
    public void onBindViewHolder(PhotoAdapterVH holder, int position) {
        LogUtil.Log_Error("onBindViewHolder:"+position);
        Uri uri = Uri.parse(mPhotoList.get(position).getFilePath());
        holder.photoView.setImageURI(uri);
        switch (position%2) {
            case 0:
                holder.itemView.setBackgroundColor(Color.GREEN);
                break;
            case 1:
                holder.itemView.setBackgroundColor(Color.BLUE);
                break;
            default:break;
        }
    }

    @Override
    public void onBindViewHolder(PhotoAdapterVH holder, int position, List<Object> payloads) {
        LogUtil.Log_Error("onBindViewHolderPayloads:"+position);
        super.onBindViewHolder(holder, position, payloads);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        LogUtil.Log_Error("onAttachedToRecyclerView");
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        LogUtil.Log_Error("onDetachedFromRecyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override
    public void onViewAttachedToWindow(PhotoAdapterVH holder) {
        LogUtil.Log_Error("onViewAttachedToWindow:"+holder.position);
        super.onViewAttachedToWindow(holder);
    }

    @Override
    public void onViewDetachedFromWindow(PhotoAdapterVH holder) {
        LogUtil.Log_Error("onViewDetachedFromWindow:"+holder.position);
        super.onViewDetachedFromWindow(holder);
    }

    @Override
    public void onViewRecycled(PhotoAdapterVH holder) {
        LogUtil.Log_Error("onViewRecycled:"+holder.position);
        super.onViewRecycled(holder);
    }

    @Override
    public boolean onFailedToRecycleView(PhotoAdapterVH holder) {
        LogUtil.Log_Error("onFailedToRecycleView:"+holder.position);
        return super.onFailedToRecycleView(holder);
    }
}
