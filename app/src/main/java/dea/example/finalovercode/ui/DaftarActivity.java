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
import dea.example.finalovercode.api.helper.ServiceGenerator;
import dea.example.finalovercode.api.models.Album;
import dea.example.finalovercode.api.models.Envelope;
import dea.example.finalovercode.api.services.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DaftarActivity extends AppCompatActivity {
    List song = new ArrayList<>();
    ListAdapter listAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        recyclerView = findViewById(R.id.rv_teams);

        LinearLayoutManager layoutManager = new LinearLayoutManager(DaftarActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        listAdapter = new ListAdapter(DaftarActivity.this, song);
        recyclerView.setAdapter(listAdapter);

        loadData();
    }

    private void loadData() {
        ApiInterface apiService = ServiceGenerator.createService(ApiInterface.class);
        Call<Envelope<List<Album>>> call = apiService.getLagu("2739363d", "jsonpretty", "");
        call.enqueue(new Callback<Envelope<List<Album>>>() {
            @Override
            public void onResponse(Call<Envelope<List<Album>>> call, Response<Envelope<List<Album>>> response) {
                listAdapter.setLagu(response.body().getResults());
            }

            @Override
            public void onFailure(Call<Envelope<List<Album>>> call, Throwable t) {
                Toast.makeText(DaftarActivity.this, "Gagal Menampilkan Data Lagu", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void handleDetail(View view){
        Intent intent = new Intent(DaftarActivity.this, DetailActivity.class);
        startActivity(intent);

    }
}
