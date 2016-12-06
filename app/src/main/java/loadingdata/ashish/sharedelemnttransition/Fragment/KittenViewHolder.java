package loadingdata.ashish.sharedelemnttransition.Fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import loadingdata.ashish.sharedelemnttransition.R;

/**
 * ViewHolder for kitten cells in our grid
 *
 * @author aashish
 */
public class KittenViewHolder extends RecyclerView.ViewHolder {
    ImageView image;

    public KittenViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.image);
    }
}
