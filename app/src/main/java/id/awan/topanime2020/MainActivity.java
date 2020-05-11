package id.awan.topanime2020;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnime;
    private ArrayList<Anime> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvAnime = findViewById(R.id.rv_anime);
        rvAnime.setHasFixedSize(true);

        list.addAll(AnimeData.getListData());
        showRecyclerCardView();

        //search
//        EditText editText = findViewById(R.id.txt_searchtxt);
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                filter(s.toString());
//            }
//        });

    }

    //    private void filter(String text){
//        ArrayList<AnimeData> filteredList = new ArrayList<>();
//
//        for (AnimeData item: getList)
//    }
    private void showSelectedAnime(Anime anime) {
        Toast.makeText(this, "Kamu memilih " + anime.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerCardView() {
        rvAnime.setLayoutManager(new LinearLayoutManager(this));
        CardViewAnimeAdapter cardViewAnimeAdapter = new CardViewAnimeAdapter(list);
        rvAnime.setAdapter(cardViewAnimeAdapter);

        cardViewAnimeAdapter.setOnItemClickCallback(new CardViewAnimeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Anime data) {
                showSelectedAnime(data);
                Intent intent = new Intent(MainActivity.this, DetailAnime.class);
                intent.putExtra(DetailAnime.EXTRA_TITLE, data.getName());
                intent.putExtra(DetailAnime.EXTRA_DETAIL, data.getDetail());
                intent.putExtra(DetailAnime.EXTRA_IMG, data.getPhoto());
                startActivity(intent);
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.profile_menu) {
            Intent moveIntent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
