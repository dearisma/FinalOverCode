package dea.example.finalovercode.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import dea.example.finalovercode.R;
import dea.example.finalovercode.adapter.ListAdapter;
import dea.example.finalovercode.adapter.TracksAdapter;
import dea.example.finalovercode.api.helper.ServiceGenerator;
import dea.example.finalovercode.api.models.Envelope;
import dea.example.finalovercode.api.models.Tracks;
import dea.example.finalovercode.api.services.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    List tracks = new ArrayList<>();
    TracksAdapter tracksAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        recyclerView = findViewById(R.id.rv_teams);

        LinearLayoutManager layoutManager = new LinearLayoutManager(DetailActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        tracksAdapter = new TracksAdapter(DetailActivity.this, tracks);
        recyclerView.setAdapter(tracksAdapter);

        loadData();
    }

    private void loadData() {
        ApiInterface apiService = ServiceGenerator.createService(ApiInterface.class);
        Call<Envelope<List<Tracks>>> call = apiService.getTracks("2739363d", "jsonpretty", "");
        call.enqueue(new Callback<Envelope<List<Tracks>>>() {
            @Override
            public void onResponse(Call<Envelope<List<Tracks>>> call, Response<Envelope<List<Tracks>>> response) {

                tracksAdapter.setTracks(response.body().getResults());
            }

            @Override
            public void onFailure(Call<Envelope<List<Tracks>>> call, Throwable t) {
                Toast.makeText(DetailActivity.this, "Gagal Menampilkan Data Lagu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
