package dea.example.finalovercode.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import dea.example.finalovercode.R;
import dea.example.finalovercode.api.models.Album;
import dea.example.finalovercode.api.models.Tracks;

public class TracksAdapter extends RecyclerView.Adapter<TracksAdapter.ViewHolder> {

    private Context context;
    public List<Tracks> items;

    public TracksAdapter(Context context, List<Tracks> items) {
        this.context = context;
        this.items = items;

    }

    public void setTracks(List<Tracks> item){
        items.addAll(item);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_detail, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Tracks item=items.get(position);
        Picasso.get().load(item.getImage()).into(holder.fotoImage);
        holder.artistnameText.setText("Artist Name: "+item.getArtis_name());
        holder.nameText.setText("Album Title: "+item.getName());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText, artistnameText, releaseText;
        ImageView fotoImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.text_name);
            artistnameText = itemView.findViewById(R.id.text_artistname);
            fotoImage =  itemView.findViewById(R.id.image_foto);
        }
    }
}
