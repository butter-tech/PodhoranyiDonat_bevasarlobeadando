import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private ArrayList<Termekek> termekekList = new ArrayList<>();
    private TermekekAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listView);
        Button btnVissza = findViewById(R.id.btnVissza);

        // Adapter beállítása
        adapter = new TermekekAdapter(this, termekekList);
        listView.setAdapter(adapter);

        // API hívás az adatok betöltésére
        fetchTermekek();

        // Vissza gomb
        btnVissza.setOnClickListener(v -> {
            Intent intent = new Intent(ListActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private void fetchTermekek() {
        // TODO: Hívd meg az API-t, töltsd be a termékeket a `termekekList`-be
        // adapter.notifyDataSetChanged();
    }
}
