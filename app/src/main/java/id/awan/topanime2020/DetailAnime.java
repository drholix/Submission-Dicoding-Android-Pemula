package id.awan.topanime2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.Objects;

public class DetailAnime extends AppCompatActivity {
    public static final String EXTRA_TITLE = "extra_title";
    public static final String EXTRA_OVERVIEW = "extra_overview";
    public static final String EXTRA_LINK = "extra_link";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_anime);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDetail = findViewById(R.id.tv_item_detail);

        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String detail = getIntent().getStringExtra(EXTRA_OVERVIEW);
        int image = getIntent().getIntExtra(EXTRA_LINK, 0);

        tvName.setText(title);
        tvDetail.setText(detail);
        Glide.with(this)
                .load(image)
                .apply(new RequestOptions())
                .into(imgItemPhoto);

        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
        getSupportActionBar().show();
    }
}
