package cenapred.gob.mx.holamundo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CENAPRED on 14/12/2015.
 */
public class FrutasVerdurasAdapter extends ArrayAdapter<FrutasVerduras> {
    Context myContext;
    int myLayoutResourceId;
    FrutasVerduras myDatos[] = null;

    public FrutasVerdurasAdapter(Context context, int layoutResourceId, FrutasVerduras[] data) {
        super(context, layoutResourceId);

        this.myContext = context;
        this.myLayoutResourceId = layoutResourceId;
        this.myDatos = data;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        FrutasVerdurasHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity)myContext).getLayoutInflater();
            row = inflater.inflate(myLayoutResourceId,parent,false);

            holder = new FrutasVerdurasHolder();
            holder.imageView = (ImageView)row.findViewById(R.id.imgAct15);
            holder.textView = (TextView)row.findViewById(R.id.txvAct15);
            row.setTag(holder);
        } else {
            holder = (FrutasVerdurasHolder)row.getTag();
        }

        FrutasVerduras frutasVerduras = myDatos[position];
        holder.textView.setText(frutasVerduras.title);
        holder.imageView.setImageResource(frutasVerduras.icon);

        return row;
    }

    static class FrutasVerdurasHolder {
        ImageView imageView;
        TextView textView;
    }
}
