import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class TermekekAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Termekek> termekekList;

    public TermekekAdapter(Context context, ArrayList<Termekek> termekekList) {
        this.context = context;
        this.termekekList = termekekList;
    }

    @Override
    public int getCount() {
        return termekekList.size();
    }

    @Override
    public Object getItem(int position) {
        return termekekList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_termek, parent, false);
        }

        Termekek termek = termekekList.get(position);

        TextView tvNev = convertView.findViewById(R.id.tvNev);
        TextView tvAdatok = convertView.findViewById(R.id.tvAdatok);

        tvNev.setText(termek.getNev());
        tvNev.setTextSize(18);
        tvNev.setTypeface(null, android.graphics.Typeface.BOLD);

        String adatok = "Egységár: " + termek.getEgysegar() +
                "\nMennyiség: " + termek.getMennyiseg() +
                "\nMértékegység: " + termek.getMertekegyseg() +
                "\nBruttó ár: " + termek.getBruttoAr();
        tvAdatok.setText(adatok);

        return convertView;
    }
}
