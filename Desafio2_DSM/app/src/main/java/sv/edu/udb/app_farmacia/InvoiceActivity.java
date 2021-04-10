package sv.edu.udb.app_farmacia;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;

public class InvoiceActivity extends Activity{

    private Bundle bundle;
    private TextView tvTotal, tvDescuento, tvName, tvPrice;

    String Name, Precio, Descuento, Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        try {
            //Asignando los valores al TextView
            tvName = (TextView)findViewById(R.id.tvProd);
            tvPrice = (TextView)findViewById(R.id.tvPrice);
            tvDescuento = (TextView)findViewById(R.id.tvDesc);
            tvTotal = (TextView)findViewById(R.id.tvTotal);

            //Capturando los datos recibidos del MainActivity
             bundle = getIntent().getExtras();

             //Asignando los valores recibidos a las variables correspondientes
            Name = bundle.getString("Name_Medi");
            Precio = bundle.getString("Price");
            Descuento = bundle.getString("Desc");
            Total = bundle.getString("Total");

            //Mostrando los valores de las variables
            tvName.append(Name);
            tvPrice.append(Precio);
            tvDescuento.append(Descuento);
            tvTotal.append(Total);

        }catch (IllegalArgumentException e){
            Toast.makeText(InvoiceActivity.this,"Error: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
