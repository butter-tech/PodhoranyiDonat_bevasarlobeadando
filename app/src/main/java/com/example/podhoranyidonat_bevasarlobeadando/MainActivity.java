import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNev = findViewById(R.id.etNev);
        EditText etEgysegar = findViewById(R.id.etEgysegar);
        EditText etMennyiseg = findViewById(R.id.etMennyiseg);
        EditText etMertekegyseg = findViewById(R.id.etMertekegyseg);
        Button btnHozzaadas = findViewById(R.id.btnHozzaadas);

        btnHozzaadas.setOnClickListener(v -> {
            String nev = etNev.getText().toString();
            String egysegarStr = etEgysegar.getText().toString();
            String mennyisegStr = etMennyiseg.getText().toString();
            String mertekegyseg = etMertekegyseg.getText().toString();

            if (TextUtils.isEmpty(nev) || TextUtils.isEmpty(egysegarStr) ||
                    TextUtils.isEmpty(mennyisegStr) || TextUtils.isEmpty(mertekegyseg)) {
                Toast.makeText(this, "Minden mezőt ki kell tölteni!", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                int egysegar = Integer.parseInt(egysegarStr);
                double mennyiseg = Double.parseDouble(mennyisegStr);

                Termekek ujTermek = new Termekek(nev, egysegar, mennyiseg, mertekegyseg);
                Toast.makeText(this, "Termék hozzáadva: " + ujTermek.getNev(), Toast.LENGTH_SHORT).show();

                // Itt adhatsz hozzá egy listához vagy más tárolóhoz

            } catch (NumberFormatException e) {
                Toast.makeText(this, "Helyes formátumot adj meg az árhoz és mennyiséghez!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
